package io.swagger.sample.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ExpandableFields {
    FILM_CATEGORY(Film.FIELD_NAME_ID), FILM_ACTORS(Film.FIELD_NAME_ACTORS);

    private String value;

    ExpandableFields(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ExpandableFields fromValue(String text) {
        for (ExpandableFields b : ExpandableFields.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
