
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A corporate entity as a person with significant control notification
 * 
 * <p>Java class for PSCCorporateEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCCorporateEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
 *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType"/&gt;
 *         &lt;element name="PSCCompanyIdentification" type="{http://xmlgw.companieshouse.gov.uk}CorporatePSCIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCCorporateEntityType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "corporateName",
    "address",
    "pscCompanyIdentification"
})
public class PSCCorporateEntityType {

    @XmlElement(name = "CorporateName", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String corporateName;
    @XmlElement(name = "Address", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected CompanyAddressType address;
    @XmlElement(name = "PSCCompanyIdentification", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected CorporatePSCIdentificationType pscCompanyIdentification;

    /**
     * Gets the value of the corporateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * Sets the value of the corporateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateName(String value) {
        this.corporateName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAddressType }
     *     
     */
    public CompanyAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAddressType }
     *     
     */
    public void setAddress(CompanyAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the pscCompanyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CorporatePSCIdentificationType }
     *     
     */
    public CorporatePSCIdentificationType getPSCCompanyIdentification() {
        return pscCompanyIdentification;
    }

    /**
     * Sets the value of the pscCompanyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporatePSCIdentificationType }
     *     
     */
    public void setPSCCompanyIdentification(CorporatePSCIdentificationType value) {
        this.pscCompanyIdentification = value;
    }

}
