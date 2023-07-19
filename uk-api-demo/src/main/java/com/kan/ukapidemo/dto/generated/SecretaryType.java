
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Company Secretary
 * 
 * <p>Java class for SecretaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecretaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
 *           &lt;element name="Person" type="{http://xmlgw.companieshouse.gov.uk}PersonBaseType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}DirectorAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecretaryType", propOrder = {
    "corporateName",
    "person",
    "address"
})
public class SecretaryType {

    @XmlElement(name = "CorporateName")
    protected String corporateName;
    @XmlElement(name = "Person")
    protected PersonBaseType person;
    @XmlElement(name = "Address", required = true)
    protected DirectorAddressType address;

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
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonBaseType }
     *     
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBaseType }
     *     
     */
    public void setPerson(PersonBaseType value) {
        this.person = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorAddressType }
     *     
     */
    public DirectorAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorAddressType }
     *     
     */
    public void setAddress(DirectorAddressType value) {
        this.address = value;
    }

}
