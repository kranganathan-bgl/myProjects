
package com.kan.ukapidemo.dto.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Set of previous names and dates changed
 * 
 * <p>Java class for CoPreviousNamesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoPreviousNamesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CONDate"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CompanyName"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoPreviousNamesType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "conDate",
    "companyName"
})
public class CoPreviousNamesType {

    @XmlElement(name = "CONDate", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected XMLGregorianCalendar conDate;
    @XmlElement(name = "CompanyName", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String companyName;

    /**
     * Gets the value of the conDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCONDate() {
        return conDate;
    }

    /**
     * Sets the value of the conDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCONDate(XMLGregorianCalendar value) {
        this.conDate = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

}
