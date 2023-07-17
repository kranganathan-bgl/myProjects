
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyLevelStatementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CompanyLevelStatementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_INDIVIDUAL_OR_ENTITY_WITH_SIGNFICANT_CONTROL"/&gt;
 *     &lt;enumeration value="STEPS_TO_FIND_PSC_NOT_YET_COMPLETED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompanyLevelStatementType", namespace = "http://xmlgw.companieshouse.gov.uk")
@XmlEnum
public enum CompanyLevelStatementType {


    /**
     * The company knows or has reasonable cause to believe that there is no registrable person or registrable relevant legal entity in relation to the company
     * 
     */
    NO_INDIVIDUAL_OR_ENTITY_WITH_SIGNFICANT_CONTROL,

    /**
     * The company has not entered the particulars of any registrable person or registrable relevant legal entity and has not yet completed taking reasonable steps to find out if there is anyone who is a registrable person or a registrable relevant legal entity in relation to the company under section 790D of the Act
     * 
     */
    STEPS_TO_FIND_PSC_NOT_YET_COMPLETED;

    public String value() {
        return name();
    }

    public static CompanyLevelStatementType fromValue(String v) {
        return valueOf(v);
    }

}
