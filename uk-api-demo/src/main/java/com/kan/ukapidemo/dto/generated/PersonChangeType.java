
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Title" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Surname"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Forename" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}OtherForenames" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonChangeType", propOrder = {
    "title",
    "surname",
    "forename",
    "otherForenames"
})
public class PersonChangeType {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "Forename")
    protected String forename;
    @XmlElement(name = "OtherForenames")
    protected String otherForenames;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

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
     * Gets the value of the otherForenames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherForenames() {
        return otherForenames;
    }

    /**
     * Sets the value of the otherForenames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherForenames(String value) {
        this.otherForenames = value;
    }

}
