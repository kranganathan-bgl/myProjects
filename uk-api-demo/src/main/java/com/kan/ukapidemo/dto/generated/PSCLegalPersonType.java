
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A corporate sole as a person with significant control notification
 * 
 * <p>Java class for PSCLegalPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCLegalPersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}LegalPersonName"/&gt;
 *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType"/&gt;
 *         &lt;element name="LegalPersonIdentification" type="{http://xmlgw.companieshouse.gov.uk}LegalPersonIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCLegalPersonType", propOrder = {
    "legalPersonName",
    "address",
    "legalPersonIdentification"
})
public class PSCLegalPersonType {

    @XmlElement(name = "LegalPersonName", required = true)
    protected String legalPersonName;
    @XmlElement(name = "Address", required = true)
    protected CompanyAddressType address;
    @XmlElement(name = "LegalPersonIdentification", required = true)
    protected LegalPersonIdentificationType legalPersonIdentification;

    /**
     * Gets the value of the legalPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalPersonName() {
        return legalPersonName;
    }

    /**
     * Sets the value of the legalPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalPersonName(String value) {
        this.legalPersonName = value;
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
     * Gets the value of the legalPersonIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LegalPersonIdentificationType }
     *     
     */
    public LegalPersonIdentificationType getLegalPersonIdentification() {
        return legalPersonIdentification;
    }

    /**
     * Sets the value of the legalPersonIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalPersonIdentificationType }
     *     
     */
    public void setLegalPersonIdentification(LegalPersonIdentificationType value) {
        this.legalPersonIdentification = value;
    }

}
