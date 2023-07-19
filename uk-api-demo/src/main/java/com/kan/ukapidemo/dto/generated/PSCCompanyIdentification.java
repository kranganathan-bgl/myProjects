
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PSCPlaceRegistered" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyNameAddressString"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="160"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSCRegistrationNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyOtherDataString"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="160"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LawGoverned"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyNameAddressString"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="160"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LegalForm"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyOtherDataString"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="160"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CountryOrState" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyNameAddressString"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pscPlaceRegistered",
    "pscRegistrationNumber",
    "lawGoverned",
    "legalForm",
    "countryOrState"
})
@XmlRootElement(name = "PSCCompanyIdentification")
public class PSCCompanyIdentification {

    @XmlElement(name = "PSCPlaceRegistered")
    protected String pscPlaceRegistered;
    @XmlElement(name = "PSCRegistrationNumber")
    protected String pscRegistrationNumber;
    @XmlElement(name = "LawGoverned", required = true)
    protected String lawGoverned;
    @XmlElement(name = "LegalForm", required = true)
    protected String legalForm;
    @XmlElement(name = "CountryOrState")
    protected String countryOrState;

    /**
     * Gets the value of the pscPlaceRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSCPlaceRegistered() {
        return pscPlaceRegistered;
    }

    /**
     * Sets the value of the pscPlaceRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSCPlaceRegistered(String value) {
        this.pscPlaceRegistered = value;
    }

    /**
     * Gets the value of the pscRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSCRegistrationNumber() {
        return pscRegistrationNumber;
    }

    /**
     * Sets the value of the pscRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSCRegistrationNumber(String value) {
        this.pscRegistrationNumber = value;
    }

    /**
     * Gets the value of the lawGoverned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLawGoverned() {
        return lawGoverned;
    }

    /**
     * Sets the value of the lawGoverned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLawGoverned(String value) {
        this.lawGoverned = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalForm(String value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the countryOrState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOrState() {
        return countryOrState;
    }

    /**
     * Sets the value of the countryOrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOrState(String value) {
        this.countryOrState = value;
    }

}
