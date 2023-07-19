
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legacy_iso3currency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="legacy_iso3currency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="3"/&gt;
 *     &lt;enumeration value="TST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "legacy_iso3currency")
@XmlEnum
public enum LegacyIso3Currency {

    TST;

    public String value() {
        return name();
    }

    public static LegacyIso3Currency fromValue(String v) {
        return valueOf(v);
    }

}
