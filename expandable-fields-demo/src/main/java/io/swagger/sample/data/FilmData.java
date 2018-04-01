package io.swagger.sample.data;

import java.util.ArrayList;
import java.util.List;

public class FilmData {
    private FilmId id;
    private CategoryData category;
    private String title;
    private String description;
    private List<ActorData> actors = new ArrayList<>();

    public FilmId getId() {
        return id;
    }

    public void setId(FilmId id) {
        this.id = id;
    }

    public CategoryData getCategory() {
        return category;
    }

    public void setCategory(CategoryData category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ActorData> getActors() {
        return actors;
    }

    public void setActors(List<ActorData> actors) {
        this.actors = actors;
    }
}
