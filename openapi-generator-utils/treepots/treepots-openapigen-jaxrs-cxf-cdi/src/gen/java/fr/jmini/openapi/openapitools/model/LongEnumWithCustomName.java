package fr.jmini.openapi.openapitools.model;

import javax.validation.constraints.*;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(Long.class)
public enum LongEnumWithCustomName {

    @XmlEnumValue("20l") TWENTY(Long.valueOf(20l)), @XmlEnumValue("30l") THIRTY(Long.valueOf(30l)), @XmlEnumValue("40l") FORTY(Long.valueOf(40l));


    private Long value;

    LongEnumWithCustomName(Long v) {
        value = v;
    }

    public Long value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LongEnumWithCustomName fromValue(String v) {
        for (LongEnumWithCustomName b : LongEnumWithCustomName.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}



