
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnyAddressBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnyAddressBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Premise"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Street"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Thoroughfare" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PostTown"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}County" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Country"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Postcode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyAddressBaseType", propOrder = {
    "premise",
    "street",
    "thoroughfare",
    "postTown",
    "county",
    "country",
    "postcode"
})
public class AnyAddressBaseType {

    @XmlElement(name = "Premise", required = true)
    protected String premise;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "Thoroughfare")
    protected String thoroughfare;
    @XmlElement(name = "PostTown", required = true)
    protected String postTown;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "Postcode")
    protected String postcode;

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

}
