
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncorporationCompanyLevelStatementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IncorporationCompanyLevelStatementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INDIVIDUAL_OR_ENTITY_WITH_SIGNFICANT_CONTROL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IncorporationCompanyLevelStatementType")
@XmlEnum
public enum IncorporationCompanyLevelStatementType {


    /**
     * The company knows or has reasonable cause to believe that there is no registrable person or registrable relevant legal entity in relation to the company
     * 
     */
    NO_INDIVIDUAL_OR_ENTITY_WITH_SIGNFICANT_CONTROL;

    public String value() {
        return name();
    }

    public static IncorporationCompanyLevelStatementType fromValue(String v) {
        return valueOf(v);
    }

}
