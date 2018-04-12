package io.swagger.sample.resource;

import io.swagger.sample.data.ActorData;
import io.swagger.sample.data.CategoryData;
import io.swagger.sample.data.DataStore;
import io.swagger.sample.data.FilmData;
import io.swagger.sample.data.FilmId;
import io.swagger.sample.model.Actor;
import io.swagger.sample.model.Category;
import io.swagger.sample.model.ExpandableField;
import io.swagger.sample.model.ExpandableFields;
import io.swagger.sample.model.Film;
import io.swagger.sample.model.HasId;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/film")
@Produces({ "application/json" })
public class FilmResource {
    @GET
    @Path("/get")
    @Operation( //
            summary = "Find film by ID", //
            description = "Some description ...", //
            responses = { //
                    @ApiResponse(description = "returns the corresponding Film", content = @Content(schema = @Schema(implementation = Film.class))), //
                    @ApiResponse(responseCode = "400", description = "Invalid ID supplied"), //
                    @ApiResponse(responseCode = "404", description = "Order not found") //
            } //
    ) //
    public Film getPetById(@QueryParam("filmId") String filmId, @QueryParam("expand") String expandParam) throws io.swagger.sample.exception.NotFoundException {
        List<ExpandableFields> expandQuery;
        if (expandParam == null) {
            expandQuery = Collections.emptyList();
        }
        else {
            expandQuery = new ArrayList<>();
            for (String s : expandParam.split(",")) {
                try {
                    ExpandableFields t = ExpandableFields.fromValue(s.toUpperCase());
                    expandQuery.add(t);
                }
                catch (IllegalArgumentException e) {
                    // LOG: s is not a valid expand value.
                }
            }
        }
        Film film = mapFilm(DataStore.getFilmById(new FilmId(filmId)), expandQuery);
        if (null != film) {
            return film;
        }
        else {
            throw new io.swagger.sample.exception.NotFoundException(404, "Pet not found");
        }
    }

    private static Actor mapActor(ActorData data, List<ExpandableFields> expandQuery) {
        Actor actor = new Actor();
        actor.setId(data.getId().id);
        actor.setFirstName(data.getFirstName());
        actor.setLastName(data.getLastName());
        return actor;
    }

    private static Category mapCategory(CategoryData data, List<ExpandableFields> expandQuery) {
        Category category = new Category();
        category.setId(data.getId().id);
        category.setName(data.getName());
        return category;
    }

    private static Film mapFilm(FilmData data, List<ExpandableFields> expandQuery) {
        Film film = new Film();
        film.setId(data.getId().id);
        film.setTitle(data.getTitle());
        film.setDescription(data.getDescription());
        Category category = mapCategory(data.getCategory(), expandQuery);
        film.setCategory(createExpandableField(ExpandableFields.FILM_CATEGORY, category, expandQuery));
        List<Actor> actors = data.getActors().stream().map(a -> mapActor(a, expandQuery)).collect(Collectors.toList());
        film.setActors(createExpandableFields(ExpandableFields.FILM_ACTORS, actors, expandQuery));
        return film;
    }

    private static <T extends HasId> ExpandableField<T> createExpandableField(ExpandableFields entity, T item, List<ExpandableFields> expandQuery) {
        if (expandQuery != null && expandQuery.contains(entity)) {
            return new ExpandableField<T>(item.getId(), item);
        }
        else {
            return new ExpandableField<T>(item.getId(), null);
        }
    }

    private static <T extends HasId> List<ExpandableField<T>> createExpandableFields(ExpandableFields entity, List<T> items, List<ExpandableFields> expandQuery) {
        List<ExpandableField<T>> result = new ArrayList<>();
        for (T i : items) {
            result.add(createExpandableField(entity, i, expandQuery));
        }
        return result;
    }

}
