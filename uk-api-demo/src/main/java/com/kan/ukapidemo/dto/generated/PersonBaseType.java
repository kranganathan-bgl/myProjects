
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Title" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Forename" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}OtherForenames" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Surname"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonBaseType", propOrder = {
    "title",
    "forename",
    "otherForenames",
    "surname"
})
@XmlSeeAlso({
    com.kan.ukapidemo.dto.generated.DirectorType.Person.class,
    com.kan.ukapidemo.dto.generated.SecretaryAppointmentType.Person.class,
    com.kan.ukapidemo.dto.generated.IncorporationSecretaryAppointmentType.Person.class,
    com.kan.ukapidemo.dto.generated.DirectorIncorporationAppointmentType.Person.class,
    DirectorPersonType.class,
    com.kan.ukapidemo.dto.generated.MemberReturnType.Person.class,
    com.kan.ukapidemo.dto.generated.SecretaryReturnType.Person.class,
    com.kan.ukapidemo.dto.generated.MemberAppointmentType.Person.class,
    com.kan.ukapidemo.dto.generated.IncorporationMemberAppointmentType.Person.class,
    com.kan.ukapidemo.dto.generated.MemberType.Person.class
})
public class PersonBaseType {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Forename")
    protected String forename;
    @XmlElement(name = "OtherForenames")
    protected String otherForenames;
    @XmlElement(name = "Surname", required = true)
    protected String surname;

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
     * More than one name can be entered separated by spaces
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

}
