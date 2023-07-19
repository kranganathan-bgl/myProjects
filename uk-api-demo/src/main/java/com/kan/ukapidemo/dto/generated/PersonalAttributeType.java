
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonalAttribute"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="BIRTOWN"/&gt;
 *               &lt;enumeration value="TEL"/&gt;
 *               &lt;enumeration value="NATINS"/&gt;
 *               &lt;enumeration value="PASSNO"/&gt;
 *               &lt;enumeration value="MUM"/&gt;
 *               &lt;enumeration value="DAD"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PersonalData"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyOtherDataString"&gt;
 *               &lt;minLength value="3"/&gt;
 *               &lt;maxLength value="3"/&gt;
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
@XmlType(name = "PersonalAttributeType", propOrder = {
    "personalAttribute",
    "personalData"
})
public class PersonalAttributeType {

    @XmlElement(name = "PersonalAttribute", required = true)
    protected String personalAttribute;
    @XmlElement(name = "PersonalData", required = true)
    protected String personalData;

    /**
     * Gets the value of the personalAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAttribute() {
        return personalAttribute;
    }

    /**
     * Sets the value of the personalAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAttribute(String value) {
        this.personalAttribute = value;
    }

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalData() {
        return personalData;
    }

    /**
     * Sets the value of the personalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalData(String value) {
        this.personalData = value;
    }

}
