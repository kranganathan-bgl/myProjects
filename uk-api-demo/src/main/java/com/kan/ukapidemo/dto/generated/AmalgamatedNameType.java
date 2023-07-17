
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmalgamatedNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmalgamatedNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Surname"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Forename"/&gt;
 *         &lt;element name="AmalgamatedName" type="{http://xmlgw.companieshouse.gov.uk}nameAddressString"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmalgamatedNameType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "surname",
    "forename",
    "amalgamatedName"
})
public class AmalgamatedNameType {

    @XmlElement(name = "Surname", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String surname;
    @XmlElement(name = "Forename", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String forename;
    @XmlElement(name = "AmalgamatedName", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String amalgamatedName;

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForename(String value) {
        this.forename = value;
    }

    /**
     * Gets the value of the amalgamatedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmalgamatedName() {
        return amalgamatedName;
    }

    /**
     * Sets the value of the amalgamatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmalgamatedName(String value) {
        this.amalgamatedName = value;
    }

}
