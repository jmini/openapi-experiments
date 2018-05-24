package org.openapitools.model;

import javax.validation.constraints.*;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(String.class)
public enum StringEnum {

    @XmlEnumValue("c") C(String.valueOf("c")), @XmlEnumValue("b") B(String.valueOf("b")), @XmlEnumValue("a") A(String.valueOf("a"));


    private String value;

    StringEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StringEnum fromValue(String v) {
        for (StringEnum b : StringEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}



