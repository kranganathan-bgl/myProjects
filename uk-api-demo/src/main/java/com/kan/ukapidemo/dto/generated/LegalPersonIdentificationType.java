
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalPersonIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalPersonIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LawGoverned"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyNameAddressString"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="160"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LegalForm"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyOtherDataString"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="160"/&gt;
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
@XmlType(name = "LegalPersonIdentificationType", propOrder = {
    "lawGoverned",
    "legalForm"
})
public class LegalPersonIdentificationType {

    @XmlElement(name = "LawGoverned", required = true)
    protected String lawGoverned;
    @XmlElement(name = "LegalForm", required = true)
    protected String legalForm;

    /**
     * Gets the value of the lawGoverned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLawGoverned() {
        return lawGoverned;
    }

    /**
     * Sets the value of the lawGoverned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLawGoverned(String value) {
        this.lawGoverned = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalForm(String value) {
        this.legalForm = value;
    }

}
