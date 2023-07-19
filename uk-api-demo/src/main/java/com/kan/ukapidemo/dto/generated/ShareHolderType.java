
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareHolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
 *           &lt;element name="Person"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="Name" type="{http://xmlgw.companieshouse.gov.uk}NameType"/&gt;
 *                     &lt;element name="AmalgamatedName"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nameAddressString"&gt;
 *                           &lt;maxLength value="160"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}ShareholderAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareHolderType", propOrder = {
    "corporateName",
    "person",
    "address"
})
public class ShareHolderType {

    @XmlElement(name = "CorporateName")
    protected String corporateName;
    @XmlElement(name = "Person")
    protected ShareHolderType.Person person;
    @XmlElement(name = "Address", required = true)
    protected ShareholderAddressType address;

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
     *     {@link ShareHolderType.Person }
     *     
     */
    public ShareHolderType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareHolderType.Person }
     *     
     */
    public void setPerson(ShareHolderType.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholderAddressType }
     *     
     */
    public ShareholderAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholderAddressType }
     *     
     */
    public void setAddress(ShareholderAddressType value) {
        this.address = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="Name" type="{http://xmlgw.companieshouse.gov.uk}NameType"/&gt;
     *         &lt;element name="AmalgamatedName"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nameAddressString"&gt;
     *               &lt;maxLength value="160"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "amalgamatedName"
    })
    public static class Person {

        @XmlElement(name = "Name")
        protected NameType name;
        @XmlElement(name = "AmalgamatedName")
        protected String amalgamatedName;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link NameType }
         *     
         */
        public NameType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link NameType }
         *     
         */
        public void setName(NameType value) {
            this.name = value;
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

}
