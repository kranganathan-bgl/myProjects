
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}AddressBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CareofName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PoBox" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyAddressType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "careofName",
    "poBox"
})
public class CompanyAddressType
    extends AddressBaseType
{

    @XmlElement(name = "CareofName", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String careofName;
    @XmlElement(name = "PoBox", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String poBox;

    /**
     * Gets the value of the careofName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareofName() {
        return careofName;
    }

    /**
     * Sets the value of the careofName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareofName(String value) {
        this.careofName = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBox(String value) {
        this.poBox = value;
    }

}
