
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSCLevelStatementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PSCLevelStatementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PSC_EXISTS_BUT_NOT_IDENTIFIED"/&gt;
 *     &lt;enumeration value="PSC_DETAILS_NOT_CONFIRMED"/&gt;
 *     &lt;enumeration value="PSC_CONTACTED_BUT_NO_RESPONSE"/&gt;
 *     &lt;enumeration value="RESTRICTIONS_NOTICE_ISSUED_TO_PSC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PSCLevelStatementType", namespace = "http://xmlgw.companieshouse.gov.uk")
@XmlEnum
public enum PSCLevelStatementType {


    /**
     * The company knows or has reasonable cause to believe there is a registrable person in relation to the company and has been unable to identify the registrable person
     * 
     */
    PSC_EXISTS_BUT_NOT_IDENTIFIED,

    /**
     * The company has identified a registrable person in relation to the company and all the required particulars of that person have not been confirmed
     * 
     */
    PSC_DETAILS_NOT_CONFIRMED,

    /**
     * The company has given notice under section 790D of the Act; and the addressees of the notice have failed to comply with the notice within the time specified in it
     * 
     */
    PSC_CONTACTED_BUT_NO_RESPONSE,

    /**
     * The company has issued a restriction notice under paragraph 1 of Schedule 1B of the Companies Act 2006
     * 
     */
    RESTRICTIONS_NOTICE_ISSUED_TO_PSC;

    public String value() {
        return name();
    }

    public static PSCLevelStatementType fromValue(String v) {
        return valueOf(v);
    }

}
