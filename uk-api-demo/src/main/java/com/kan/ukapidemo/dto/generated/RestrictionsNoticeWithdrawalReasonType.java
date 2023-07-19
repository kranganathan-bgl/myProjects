
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionsNoticeWithdrawalReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RestrictionsNoticeWithdrawalReasonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESTRICTIONS_NOTICE_WITHDRAWN_BY_COMPANY"/&gt;
 *     &lt;enumeration value="RESTRICTIONS_NOTICE_WITHDRAWN_BY_COURT_ORDER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RestrictionsNoticeWithdrawalReasonType")
@XmlEnum
public enum RestrictionsNoticeWithdrawalReasonType {


    /**
     * The company has withdrawn the restrictions notice by giving a withdrawal notice
     * 
     */
    RESTRICTIONS_NOTICE_WITHDRAWN_BY_COMPANY,

    /**
     * The court has made an order that a relevant interest in the company cease to be subject to restrictions
     * 
     */
    RESTRICTIONS_NOTICE_WITHDRAWN_BY_COURT_ORDER;

    public String value() {
        return name();
    }

    public static RestrictionsNoticeWithdrawalReasonType fromValue(String v) {
        return valueOf(v);
    }

}
