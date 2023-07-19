
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of any Subsidiary and Associated Undertakings
 * 
 * <p>Java class for SubsidiaryAndAssociatedUndertakingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubsidiaryAndAssociatedUndertakingsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubCompanyName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyNameAddressString"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="160"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubCompanyNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShareDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}otherDataString"&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherDetails" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}otherDataString"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidiaryAndAssociatedUndertakingsType", propOrder = {
    "subCompanyName",
    "subCompanyNumber",
    "shareDescription",
    "otherDetails"
})
public class SubsidiaryAndAssociatedUndertakingsType {

    @XmlElement(name = "SubCompanyName", required = true)
    protected String subCompanyName;
    @XmlElement(name = "SubCompanyNumber")
    protected String subCompanyNumber;
    @XmlElement(name = "ShareDescription")
    protected String shareDescription;
    @XmlElement(name = "OtherDetails")
    protected String otherDetails;

    /**
     * Gets the value of the subCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCompanyName() {
        return subCompanyName;
    }

    /**
     * Sets the value of the subCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCompanyName(String value) {
        this.subCompanyName = value;
    }

    /**
     * Gets the value of the subCompanyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCompanyNumber() {
        return subCompanyNumber;
    }

    /**
     * Sets the value of the subCompanyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCompanyNumber(String value) {
        this.subCompanyNumber = value;
    }

    /**
     * Gets the value of the shareDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareDescription() {
        return shareDescription;
    }

    /**
     * Sets the value of the shareDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareDescription(String value) {
        this.shareDescription = value;
    }

    /**
     * Gets the value of the otherDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDetails() {
        return otherDetails;
    }

    /**
     * Sets the value of the otherDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDetails(String value) {
        this.otherDetails = value;
    }

}
