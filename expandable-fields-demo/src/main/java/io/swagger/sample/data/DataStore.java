package io.swagger.sample.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataStore {
    private static final ActorId ACTOR1_ID = new ActorId("e7dcb566-7533-489f-a2dd-7e6ea3d4b329");
    private static final ActorId ACTOR2_ID = new ActorId("fdc3e69c-609e-4ac3-aab6-1aedc1ecfbdf");
    private static final ActorId ACTOR3_ID = new ActorId("87b9fbe9-2f2b-42b2-8142-1b4ead04baf5");
    private static final ActorId ACTOR4_ID = new ActorId("037e9bbb-bf9e-4c6b-a6a8-20bd972724e8");
    private static final ActorId ACTOR5_ID = new ActorId("ba5ce8b5-244a-48f1-b80f-8453e3cc849b");

    private static final CategoryId CATEGORY_ACTION_ID = new CategoryId("25d68ced-4846-4667-b68a-d60173513a73");
    private static final CategoryId CATEGORY_ANIMAPTION_ID = new CategoryId("f34a2625-e0ed-4119-9f95-7bfbe2c4a67e");
    private static final CategoryId CATEGORY_CHILDREN_ID = new CategoryId("d0374e57-c9e2-4046-b2e4-968874cc2518");
    private static final CategoryId CATEGORY_CLASSICS_ID = new CategoryId("93b6bb5d-5782-4bfa-ab62-09d36b79ef3e");
    private static final CategoryId CATEGORY_COMEDIE_ID = new CategoryId("17cd142b-ffc7-4691-9130-dfe74aac6a31");
    private static final CategoryId CATEGORY_DOCUMENTARY_ID = new CategoryId("cdea24f7-802e-45fa-842b-19f7546df3bd");
    private static final CategoryId CATEGORY_DRAMA_ID = new CategoryId("dcf5c9f2-cfc1-405f-9566-5ddc4e0856a4");
    private static final CategoryId CATEGORY_FAMILY_ID = new CategoryId("e65c3e04-14c0-4c4c-afb2-7ffd0b506ecb");

    static List<FilmData> films = new ArrayList<>();
    static List<ActorData> actors = new ArrayList<>();
    static List<CategoryData> categories = new ArrayList<>();

    static {
        categories.add(createCategory(CATEGORY_ACTION_ID, "Action"));
        categories.add(createCategory(CATEGORY_ANIMAPTION_ID, "Animation"));
        categories.add(createCategory(CATEGORY_CHILDREN_ID, "Children"));
        categories.add(createCategory(CATEGORY_CLASSICS_ID, "Classics"));
        categories.add(createCategory(CATEGORY_COMEDIE_ID, "Comedy"));
        categories.add(createCategory(CATEGORY_DOCUMENTARY_ID, "Documentary"));
        categories.add(createCategory(CATEGORY_DRAMA_ID, "Drama"));
        categories.add(createCategory(CATEGORY_FAMILY_ID, "Family"));

        actors.add(createActor(ACTOR1_ID, "PENELOPE", "GUINESS"));
        actors.add(createActor(ACTOR2_ID, "NICK", "WAHLBERG"));
        actors.add(createActor(ACTOR3_ID, "ED", "CHASE"));
        actors.add(createActor(ACTOR4_ID, "JENNIFER", "DAVIS"));
        actors.add(createActor(ACTOR5_ID, "JOHNNY", "LOLLOBRIGIDA"));

        films.add(createFilm(new FilmId("093dcfaf-b95b-4c7f-a1c0-777424881071"), "ACADEMY DINOSAUR", "A Epic Drama of a Feminist And a Mad Scientist who must Battle a Teacher in The Canadian Rockies", getCategoryById(CATEGORY_CHILDREN_ID), getActorsByIds(ACTOR2_ID, ACTOR4_ID)));
        films.add(createFilm(new FilmId("ce02791d-11c5-4070-9079-900da6c4dcf8"), "ACE GOLDFINGER", "A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China", getCategoryById(CATEGORY_ACTION_ID), getActorsByIds(ACTOR1_ID)));
        films.add(createFilm(new FilmId("7d39105f-a89b-4076-aa2d-8be20cfb59d1"), "ADAPTATION HOLES", "A Astounding Reflection of a Lumberjack And a Car who must Sink a Lumberjack in A Baloon Factory", getCategoryById(CATEGORY_CLASSICS_ID), getActorsByIds(ACTOR3_ID, ACTOR4_ID, ACTOR5_ID)));
        films.add(createFilm(new FilmId("4f6fea06-00d5-441e-a9ee-4b8574983159"), "AFFAIR PREJUDICE", "A Fanciful Documentary of a Frisbee And a Lumberjack who must Chase a Monkey in A Shark Tank", getCategoryById(CATEGORY_DRAMA_ID), getActorsByIds(ACTOR2_ID, ACTOR3_ID)));
        films.add(createFilm(new FilmId("414fde0d-1603-4049-b8ce-5e851894f8ff"), "AFRICAN EGG", "A Fast-Paced Documentary of a Pastry Chef And a Dentist who must Pursue a Forensic Psychologist in The Gulf of Mexico", getCategoryById(CATEGORY_DOCUMENTARY_ID), getActorsByIds(ACTOR5_ID)));
        films.add(createFilm(new FilmId("96d9e473-c2c8-41c5-9544-456e21cff705"), "AGENT TRUMAN", "A Intrepid Panorama of a Robot And a Boy who must Escape a Sumo Wrestler in Ancient China", getCategoryById(CATEGORY_ACTION_ID), getActorsByIds(ACTOR4_ID, ACTOR5_ID)));
        films.add(createFilm(new FilmId("75ca2ae4-9536-4496-8f5b-b1a0ce909d2b"), "AIRPLANE SIERRA", "A Touching Saga of a Hunter And a Butler who must Discover a Butler in A Jet Boat", getCategoryById(CATEGORY_ACTION_ID), getActorsByIds(ACTOR1_ID, ACTOR3_ID, ACTOR4_ID)));
        films.add(createFilm(new FilmId("06c65a6b-a644-4e21-a3a1-8969b4e939a6"), "AIRPORT POLLOCK", "A Epic Tale of a Moose And a Girl who must Confront a Monkey in Ancient India", getCategoryById(CATEGORY_DOCUMENTARY_ID), getActorsByIds(ACTOR3_ID, ACTOR4_ID)));
        films.add(createFilm(new FilmId("ab520ef1-1fe8-4022-99d2-68111b6f8e5d"), "ALABAMA DEVIL", "A Thoughtful Panorama of a Database Administrator And a Mad Scientist who must Outgun a Mad Scientist in A Jet Boat", getCategoryById(CATEGORY_ANIMAPTION_ID), getActorsByIds(ACTOR3_ID)));
        films.add(createFilm(new FilmId("9e1528cd-5b1d-464a-ab63-6248b402bf33"), "ALADDIN CALENDAR", "A Action-Packed Tale of a Man And a Lumberjack who must Reach a Feminist in Ancient China", getCategoryById(CATEGORY_DRAMA_ID), getActorsByIds(ACTOR2_ID, ACTOR4_ID)));

    }

    public static FilmData getFilmById(FilmId filmId) {
        return getById(films, FilmData::getId, filmId);
    }

    public static List<FilmData> getFilmsByIds(FilmId... filmIds) {
        return Arrays.stream(filmIds).map(DataStore::getFilmById).collect(Collectors.toList());
    }

    public static ActorData getActorById(ActorId actorId) {
        return getById(actors, ActorData::getId, actorId);
    }

    public static List<ActorData> getActorsByIds(ActorId... actorsIds) {
        return Arrays.stream(actorsIds).map(DataStore::getActorById).collect(Collectors.toList());
    }

    public static CategoryData getCategoryById(CategoryId categoryId) {
        return getById(categories, CategoryData::getId, categoryId);
    }

    public static List<CategoryData> getCategoriesByIds(CategoryId... categoryIds) {
        return Arrays.stream(categoryIds).map(DataStore::getCategoryById).collect(Collectors.toList());
    }

    private static <T> T getById(List<T> list, Function<T, AbstractId> getId, AbstractId id) {
        for (T e : list) {
            if (id.id.equals(getId.apply(e).id)) {
                return e;
            }
        }
        return null;
    }

    static CategoryData createCategory(CategoryId id, String name) {
        CategoryData category = new CategoryData();
        category.setId(id);
        category.setName(name);
        return category;
    }

    static ActorData createActor(ActorId id, String firstName, String lastName) {
        ActorData actor = new ActorData();
        actor.setId(id);
        actor.setFirstName(firstName);
        actor.setLastName(lastName);
        return actor;
    }

    static FilmData createFilm(FilmId id, String title, String description, CategoryData category, List<ActorData> actors) {
        FilmData film = new FilmData();
        film.setId(id);
        film.setTitle(title);
        film.setDescription(description);
        film.setCategory(category);
        film.setActors(actors);
        return film;
    }
}