
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Corporate Officer Appointment 
 * 
 * <p>Java class for CorporateOfficerAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateOfficerAppointmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}NameType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
 *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CompanyIdentification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateOfficerAppointmentType", propOrder = {
    "corporateName",
    "address",
    "companyIdentification"
})
public class CorporateOfficerAppointmentType
    extends NameType
{

    @XmlElement(name = "CorporateName", required = true)
    protected String corporateName;
    @XmlElement(name = "Address", required = true)
    protected CompanyAddressType address;
    @XmlElement(name = "CompanyIdentification", required = true)
    protected CompanyIdentification companyIdentification;

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAddressType }
     *     
     */
    public CompanyAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAddressType }
     *     
     */
    public void setAddress(CompanyAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the companyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentification }
     *     
     */
    public CompanyIdentification getCompanyIdentification() {
        return companyIdentification;
    }

    /**
     * Sets the value of the companyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentification }
     *     
     */
    public void setCompanyIdentification(CompanyIdentification value) {
        this.companyIdentification = value;
    }

}
