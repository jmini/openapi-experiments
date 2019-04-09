package fr.jmini.openapi.openapitools.model;

import javax.validation.constraints.*;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(String.class)
public enum String2Enum {

    @XmlEnumValue("c") C(String.valueOf("c")), @XmlEnumValue("b") B(String.valueOf("b")), @XmlEnumValue("a") A(String.valueOf("a"));


    private String value;

    String2Enum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static String2Enum fromValue(String value) {
        for (String2Enum b : String2Enum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



