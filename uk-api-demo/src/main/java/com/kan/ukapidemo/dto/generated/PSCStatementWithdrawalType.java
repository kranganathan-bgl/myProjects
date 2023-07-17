
package com.kan.ukapidemo.dto.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSCStatementWithdrawalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCStatementWithdrawalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PSCStatementNotificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WithdrawalDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RestrictionsNoticeWithdrawalReason" type="{http://xmlgw.companieshouse.gov.uk}RestrictionsNoticeWithdrawalReasonType" minOccurs="0"/&gt;
 *         &lt;element name="RegisterEntryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCStatementWithdrawalType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "withdrawalDate",
    "restrictionsNoticeWithdrawalReason",
    "registerEntryDate"
})
public class PSCStatementWithdrawalType
    extends PSCStatementNotificationType
{

    @XmlElement(name = "WithdrawalDate", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar withdrawalDate;
    @XmlElement(name = "RestrictionsNoticeWithdrawalReason", namespace = "http://xmlgw.companieshouse.gov.uk")
    @XmlSchemaType(name = "string")
    protected RestrictionsNoticeWithdrawalReasonType restrictionsNoticeWithdrawalReason;
    @XmlElement(name = "RegisterEntryDate", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registerEntryDate;

    /**
     * Gets the value of the withdrawalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawalDate() {
        return withdrawalDate;
    }

    /**
     * Sets the value of the withdrawalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawalDate(XMLGregorianCalendar value) {
        this.withdrawalDate = value;
    }

    /**
     * Gets the value of the restrictionsNoticeWithdrawalReason property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionsNoticeWithdrawalReasonType }
     *     
     */
    public RestrictionsNoticeWithdrawalReasonType getRestrictionsNoticeWithdrawalReason() {
        return restrictionsNoticeWithdrawalReason;
    }

    /**
     * Sets the value of the restrictionsNoticeWithdrawalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionsNoticeWithdrawalReasonType }
     *     
     */
    public void setRestrictionsNoticeWithdrawalReason(RestrictionsNoticeWithdrawalReasonType value) {
        this.restrictionsNoticeWithdrawalReason = value;
    }

    /**
     * Gets the value of the registerEntryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisterEntryDate() {
        return registerEntryDate;
    }

    /**
     * Sets the value of the registerEntryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisterEntryDate(XMLGregorianCalendar value) {
        this.registerEntryDate = value;
    }

}
