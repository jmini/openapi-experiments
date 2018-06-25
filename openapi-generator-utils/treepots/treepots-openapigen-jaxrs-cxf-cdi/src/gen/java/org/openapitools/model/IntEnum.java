package org.openapitools.model;

import javax.validation.constraints.*;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(Integer.class)
public enum IntEnum {

    @XmlEnumValue("1") NUMBER_1(Integer.valueOf(1)), @XmlEnumValue("2") NUMBER_2(Integer.valueOf(2)), @XmlEnumValue("3") NUMBER_3(Integer.valueOf(3));


    private Integer value;

    IntEnum(Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IntEnum fromValue(String v) {
        for (IntEnum b : IntEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}



