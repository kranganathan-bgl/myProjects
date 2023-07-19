
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
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Title" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Surname"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Forename" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}OtherForenames" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PersonID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "title",
    "surname",
    "forename",
    "otherForenames",
    "dob",
    "nationality",
    "personID"
})
public class PersonType {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "Forename")
    protected String forename;
    @XmlElement(name = "OtherForenames")
    protected String otherForenames;
    @XmlElement(name = "DOB", type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dob;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "PersonID")
    protected String personID;

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

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOB(LocalDate value) {
        this.dob = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonID(String value) {
        this.personID = value;
    }

}
