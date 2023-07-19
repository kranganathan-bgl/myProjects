
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyDataResidentialAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyDataResidentialAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SameAsServiceAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="4"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}AddressBaseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyDataResidentialAddressType", propOrder = {
    "sameAsServiceAddress",
    "address"
})
@XmlSeeAlso({
    com.kan.ukapidemo.dto.generated.CompanyDataDirectorType.Person.ResidentialAddress.class,
    com.kan.ukapidemo.dto.generated.CompanyDataMemberType.Person.ResidentialAddress.class
})
public class CompanyDataResidentialAddressType {

    @XmlElement(name = "SameAsServiceAddress")
    protected String sameAsServiceAddress;
    @XmlElement(name = "Address", required = true)
    protected AddressBaseType address;

    /**
     * Gets the value of the sameAsServiceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSameAsServiceAddress() {
        return sameAsServiceAddress;
    }

    /**
     * Sets the value of the sameAsServiceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSameAsServiceAddress(String value) {
        this.sameAsServiceAddress = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBaseType }
     *     
     */
    public AddressBaseType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBaseType }
     *     
     */
    public void setAddress(AddressBaseType value) {
        this.address = value;
    }

}
