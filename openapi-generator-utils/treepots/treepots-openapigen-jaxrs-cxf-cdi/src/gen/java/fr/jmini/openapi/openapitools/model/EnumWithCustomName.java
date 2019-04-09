package fr.jmini.openapi.openapitools.model;

import javax.validation.constraints.*;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(Integer.class)
public enum EnumWithCustomName {

    @XmlEnumValue("1") FOO(Integer.valueOf(1)), @XmlEnumValue("2") BAR(Integer.valueOf(2));


    private Integer value;

    EnumWithCustomName(Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EnumWithCustomName fromValue(Integer value) {
        for (EnumWithCustomName b : EnumWithCustomName.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



