
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Company Director Annual Return 
 * 
 * <p>Java class for DirectorReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectorReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Person" type="{http://xmlgw.companieshouse.gov.uk}DirectorPersonType"/&gt;
 *         &lt;element name="Corporate" type="{http://xmlgw.companieshouse.gov.uk}CorporateOfficerType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectorReturnType", propOrder = {
    "person",
    "corporate"
})
public class DirectorReturnType {

    @XmlElement(name = "Person")
    protected DirectorPersonType person;
    @XmlElement(name = "Corporate")
    protected CorporateOfficerType corporate;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorPersonType }
     *     
     */
    public DirectorPersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorPersonType }
     *     
     */
    public void setPerson(DirectorPersonType value) {
        this.person = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateOfficerType }
     *     
     */
    public CorporateOfficerType getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateOfficerType }
     *     
     */
    public void setCorporate(CorporateOfficerType value) {
        this.corporate = value;
    }

}
