package io.swagger.sample.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({ Actor.class, Category.class, Film.class, ExpandableField.class, ExpandableFieldTypeAdapter.class })
public class Film implements HasId {

    static final String FIELD_NAME_ID = "id";
    static final String FIELD_NAME_FILM_CATEGORY = "filmCategory";
    static final String FIELD_NAME_FILM_TITLE = "title";
    static final String FIELD_NAME_FILM_DESCRIPTION = "description";
    static final String FIELD_NAME_ACTORS = "actors";

    private String id;
    private ExpandableField<Category> category;
    private String title;
    private String description;
    private List<ExpandableField<Actor>> actors = new ArrayList<>();

    @XmlElement(name = FIELD_NAME_ID)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = FIELD_NAME_FILM_CATEGORY)
    public ExpandableField<Category> getCategory() {
        return category;
    }

    public void setCategory(ExpandableField<Category> category) {
        this.category = category;
    }

    @XmlElement(name = FIELD_NAME_FILM_TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement(name = FIELD_NAME_FILM_DESCRIPTION)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElementWrapper(name = FIELD_NAME_ACTORS)
    // @XmlElement(name = FIELD_NAME_ACTORS)
    public List<ExpandableField<Actor>> getActors() {
        return actors;
    }

    public void setActors(List<ExpandableField<Actor>> actors) {
        this.actors = actors;
    }
}
