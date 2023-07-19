
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSCResidentialAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCResidentialAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SameAsServiceAddress"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="4"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}AddressBaseType"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCResidentialAddressType", propOrder = {
    "sameAsServiceAddress",
    "address"
})
public class PSCResidentialAddressType {

    @XmlElement(name = "SameAsServiceAddress")
    protected String sameAsServiceAddress;
    @XmlElement(name = "Address")
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
