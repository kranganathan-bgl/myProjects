
package com.kan.ukapidemo.dto.generated;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CompanyNumber"/&gt;
 *         &lt;element name="CompanyType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="EW"/&gt;
 *               &lt;enumeration value="SC"/&gt;
 *               &lt;enumeration value="NI"/&gt;
 *               &lt;enumeration value="R"/&gt;
 *               &lt;enumeration value="OC"/&gt;
 *               &lt;enumeration value="SO"/&gt;
 *               &lt;enumeration value="NC"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CompanyAuthenticationCode"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}MadeUpDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companyNumber",
    "companyType",
    "companyAuthenticationCode",
    "madeUpDate"
})
@XmlRootElement(name = "CompanyDataRequest", namespace = "http://xmlgw.companieshouse.gov.uk")
public class CompanyDataRequest {

    @XmlElement(name = "CompanyNumber", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigInteger companyNumber;
    @XmlElement(name = "CompanyType", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String companyType;
    @XmlElement(name = "CompanyAuthenticationCode", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String companyAuthenticationCode;
    @XmlElement(name = "MadeUpDate", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar madeUpDate;

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompanyNumber(BigInteger value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the companyAuthenticationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAuthenticationCode() {
        return companyAuthenticationCode;
    }

    /**
     * Sets the value of the companyAuthenticationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAuthenticationCode(String value) {
        this.companyAuthenticationCode = value;
    }

    /**
     * Gets the value of the madeUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMadeUpDate() {
        return madeUpDate;
    }

    /**
     * Sets the value of the madeUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMadeUpDate(XMLGregorianCalendar value) {
        this.madeUpDate = value;
    }

}
