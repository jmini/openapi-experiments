package org.openapitools.model;

import javax.validation.constraints.*;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(Long.class)
public enum LongEnum {

    @XmlEnumValue("20l") NUMBER_20(Long.valueOf(20l)), @XmlEnumValue("30l") NUMBER_30(Long.valueOf(30l)), @XmlEnumValue("40l") NUMBER_40(Long.valueOf(40l));


    private Long value;

    LongEnum(Long v) {
        value = v;
    }

    public Long value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LongEnum fromValue(String v) {
        for (LongEnum b : LongEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}



