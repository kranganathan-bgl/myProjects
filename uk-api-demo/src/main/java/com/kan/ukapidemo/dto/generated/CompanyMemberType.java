
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyMemberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemberClass" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyString"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name" type="{http://xmlgw.companieshouse.gov.uk}CompanyMemberNameType"/&gt;
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
@XmlType(name = "CompanyMemberType", propOrder = {
    "memberClass",
    "name",
    "address"
})
public class CompanyMemberType {

    @XmlElement(name = "MemberClass")
    protected String memberClass;
    @XmlElement(name = "Name", required = true)
    protected CompanyMemberNameType name;
    @XmlElement(name = "Address", required = true)
    protected AddressBaseType address;

    /**
     * Gets the value of the memberClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberClass() {
        return memberClass;
    }

    /**
     * Sets the value of the memberClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberClass(String value) {
        this.memberClass = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyMemberNameType }
     *     
     */
    public CompanyMemberNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyMemberNameType }
     *     
     */
    public void setName(CompanyMemberNameType value) {
        this.name = value;
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
