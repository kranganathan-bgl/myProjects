
package com.kan.ukapidemo.dto.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersCorpAuthType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersCorpAuthType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PersonalDetails" type="{http://xmlgw.companieshouse.gov.uk}PersonalAttributeType" maxOccurs="3" minOccurs="3"/&gt;
 *         &lt;element name="Corporate" type="{http://xmlgw.companieshouse.gov.uk}NameType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersCorpAuthType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "personalDetails",
    "corporate"
})
public class PersCorpAuthType {

    @XmlElement(name = "PersonalDetails", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected List<PersonalAttributeType> personalDetails;
    @XmlElement(name = "Corporate", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected NameType corporate;

    /**
     * Gets the value of the personalDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the personalDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalAttributeType }
     * 
     * 
     */
    public List<PersonalAttributeType> getPersonalDetails() {
        if (personalDetails == null) {
            personalDetails = new ArrayList<PersonalAttributeType>();
        }
        return this.personalDetails;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setCorporate(NameType value) {
        this.corporate = value;
    }

}
