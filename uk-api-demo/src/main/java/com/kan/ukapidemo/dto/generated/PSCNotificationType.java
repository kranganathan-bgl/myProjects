
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Notification of a person with significant control (PSC)
 * 
 * <p>Java class for PSCNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Individual" type="{http://xmlgw.companieshouse.gov.uk}PSCIndividualType"/&gt;
 *           &lt;element ref="{http://xmlgw.companieshouse.gov.uk}SuperSecureIndividual"/&gt;
 *           &lt;element name="Corporate" type="{http://xmlgw.companieshouse.gov.uk}PSCCorporateEntityType"/&gt;
 *           &lt;element name="LegalPerson" type="{http://xmlgw.companieshouse.gov.uk}PSCLegalPersonType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="NatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}NatureOfControlsType"/&gt;
 *           &lt;element name="LLPNatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}LLPNatureOfControlsType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCNotificationType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "individual",
    "superSecureIndividual",
    "corporate",
    "legalPerson",
    "natureOfControls",
    "llpNatureOfControls"
})
public class PSCNotificationType {

    @XmlElement(name = "Individual", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected PSCIndividualType individual;
    @XmlElement(name = "SuperSecureIndividual", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String superSecureIndividual;
    @XmlElement(name = "Corporate", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected PSCCorporateEntityType corporate;
    @XmlElement(name = "LegalPerson", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected PSCLegalPersonType legalPerson;
    @XmlElement(name = "NatureOfControls", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected NatureOfControlsType natureOfControls;
    @XmlElement(name = "LLPNatureOfControls", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected LLPNatureOfControlsType llpNatureOfControls;

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link PSCIndividualType }
     *     
     */
    public PSCIndividualType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCIndividualType }
     *     
     */
    public void setIndividual(PSCIndividualType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the superSecureIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperSecureIndividual() {
        return superSecureIndividual;
    }

    /**
     * Sets the value of the superSecureIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperSecureIndividual(String value) {
        this.superSecureIndividual = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link PSCCorporateEntityType }
     *     
     */
    public PSCCorporateEntityType getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCCorporateEntityType }
     *     
     */
    public void setCorporate(PSCCorporateEntityType value) {
        this.corporate = value;
    }

    /**
     * Gets the value of the legalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PSCLegalPersonType }
     *     
     */
    public PSCLegalPersonType getLegalPerson() {
        return legalPerson;
    }

    /**
     * Sets the value of the legalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCLegalPersonType }
     *     
     */
    public void setLegalPerson(PSCLegalPersonType value) {
        this.legalPerson = value;
    }

    /**
     * Gets the value of the natureOfControls property.
     * 
     * @return
     *     possible object is
     *     {@link NatureOfControlsType }
     *     
     */
    public NatureOfControlsType getNatureOfControls() {
        return natureOfControls;
    }

    /**
     * Sets the value of the natureOfControls property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureOfControlsType }
     *     
     */
    public void setNatureOfControls(NatureOfControlsType value) {
        this.natureOfControls = value;
    }

    /**
     * Gets the value of the llpNatureOfControls property.
     * 
     * @return
     *     possible object is
     *     {@link LLPNatureOfControlsType }
     *     
     */
    public LLPNatureOfControlsType getLLPNatureOfControls() {
        return llpNatureOfControls;
    }

    /**
     * Sets the value of the llpNatureOfControls property.
     * 
     * @param value
     *     allowed object is
     *     {@link LLPNatureOfControlsType }
     *     
     */
    public void setLLPNatureOfControls(LLPNatureOfControlsType value) {
        this.llpNatureOfControls = value;
    }

}
