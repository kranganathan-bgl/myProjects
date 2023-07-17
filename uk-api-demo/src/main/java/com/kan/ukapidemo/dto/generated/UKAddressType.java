
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UKAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UKAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Premise"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Street" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Thoroughfare" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PostTown"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}County" minOccurs="0"/&gt;
 *         &lt;element name="Country"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="GB-ENG"/&gt;
 *               &lt;enumeration value="GB-WLS"/&gt;
 *               &lt;enumeration value="GB-SCT"/&gt;
 *               &lt;enumeration value="GB-NIR"/&gt;
 *               &lt;enumeration value="GBR"/&gt;
 *               &lt;enumeration value="UNDEF"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Postcode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CareofName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PoBox" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UKAddressType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "premise",
    "street",
    "thoroughfare",
    "postTown",
    "county",
    "country",
    "postcode",
    "careofName",
    "poBox"
})
public class UKAddressType {

    @XmlElement(name = "Premise", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String premise;
    @XmlElement(name = "Street", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String street;
    @XmlElement(name = "Thoroughfare", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String thoroughfare;
    @XmlElement(name = "PostTown", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String postTown;
    @XmlElement(name = "County", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String county;
    @XmlElement(name = "Country", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String country;
    @XmlElement(name = "Postcode", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String postcode;
    @XmlElement(name = "CareofName", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String careofName;
    @XmlElement(name = "PoBox", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String poBox;

    /**
     * Gets the value of the premise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremise() {
        return premise;
    }

    /**
     * Sets the value of the premise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremise(String value) {
        this.premise = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the thoroughfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfare() {
        return thoroughfare;
    }

    /**
     * Sets the value of the thoroughfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfare(String value) {
        this.thoroughfare = value;
    }

    /**
     * Gets the value of the postTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTown() {
        return postTown;
    }

    /**
     * Sets the value of the postTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTown(String value) {
        this.postTown = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the careofName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareofName() {
        return careofName;
    }

    /**
     * Sets the value of the careofName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareofName(String value) {
        this.careofName = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBox(String value) {
        this.poBox = value;
    }

}
