
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSCIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Title" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Surname"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Forename" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}OtherForenames" minOccurs="0"/&gt;
 *         &lt;element name="PartialDOB" type="{http://xmlgw.companieshouse.gov.uk}PartialDOBType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCIdentificationType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "title",
    "surname",
    "forename",
    "otherForenames",
    "partialDOB"
})
@XmlSeeAlso({
    com.kan.ukapidemo.dto.generated.PSCChangeDetailsType.Individual.class,
    com.kan.ukapidemo.dto.generated.PSCCessationType.Individual.class
})
public class PSCIdentificationType {

    @XmlElement(name = "Title", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String title;
    @XmlElement(name = "Surname", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String surname;
    @XmlElement(name = "Forename", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String forename;
    @XmlElement(name = "OtherForenames", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String otherForenames;
    @XmlElement(name = "PartialDOB", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected PartialDOBType partialDOB;

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
     * Gets the value of the partialDOB property.
     * 
     * @return
     *     possible object is
     *     {@link PartialDOBType }
     *     
     */
    public PartialDOBType getPartialDOB() {
        return partialDOB;
    }

    /**
     * Sets the value of the partialDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialDOBType }
     *     
     */
    public void setPartialDOB(PartialDOBType value) {
        this.partialDOB = value;
    }

}
