
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StatementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PSC_HAS_FAILED_TO_CONFIRM_CHANGED_DETAILS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementType", namespace = "http://xmlgw.companieshouse.gov.uk")
@XmlEnum
public enum StatementType {


    /**
     * The company has given a notice under section 790E of the Act and the addressee has failed to comply with the notice within the time specified in it
     * 
     */
    PSC_HAS_FAILED_TO_CONFIRM_CHANGED_DETAILS;

    public String value() {
        return name();
    }

    public static StatementType fromValue(String v) {
        return valueOf(v);
    }

}
