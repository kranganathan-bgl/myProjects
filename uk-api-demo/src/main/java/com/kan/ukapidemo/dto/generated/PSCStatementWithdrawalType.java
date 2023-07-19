
package com.kan.ukapidemo.dto.generated;

import java.time.LocalDate;
import com.kan.ukapidemo.adapters.LocalDateXmlAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
@XmlType(name = "PSCStatementWithdrawalType", propOrder = {
    "withdrawalDate",
    "restrictionsNoticeWithdrawalReason",
    "registerEntryDate"
})
public class PSCStatementWithdrawalType
    extends PSCStatementNotificationType
{

    @XmlElement(name = "WithdrawalDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate withdrawalDate;
    @XmlElement(name = "RestrictionsNoticeWithdrawalReason")
    @XmlSchemaType(name = "string")
    protected RestrictionsNoticeWithdrawalReasonType restrictionsNoticeWithdrawalReason;
    @XmlElement(name = "RegisterEntryDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate registerEntryDate;

    /**
     * Gets the value of the withdrawalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getWithdrawalDate() {
        return withdrawalDate;
    }

    /**
     * Sets the value of the withdrawalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithdrawalDate(LocalDate value) {
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
     *     {@link String }
     *     
     */
    public LocalDate getRegisterEntryDate() {
        return registerEntryDate;
    }

    /**
     * Sets the value of the registerEntryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterEntryDate(LocalDate value) {
        this.registerEntryDate = value;
    }

}
