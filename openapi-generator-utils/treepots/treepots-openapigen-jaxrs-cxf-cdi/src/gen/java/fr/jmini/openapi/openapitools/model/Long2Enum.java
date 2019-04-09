package fr.jmini.openapi.openapitools.model;

import javax.validation.constraints.*;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(Long.class)
public enum Long2Enum {

    @XmlEnumValue("20l") NUMBER_20(Long.valueOf(20l)), @XmlEnumValue("30l") NUMBER_30(Long.valueOf(30l)), @XmlEnumValue("40l") NUMBER_40(Long.valueOf(40l));


    private Long value;

    Long2Enum(Long v) {
        value = v;
    }

    public Long value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Long2Enum fromValue(Long value) {
        for (Long2Enum b : Long2Enum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



