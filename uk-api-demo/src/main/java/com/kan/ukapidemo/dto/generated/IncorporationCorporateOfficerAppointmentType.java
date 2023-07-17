
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Corporate Officer Appointment 
 * 
 * <p>Java class for IncorporationCorporateOfficerAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncorporationCorporateOfficerAppointmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}NameType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
 *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType"/&gt;
 *         &lt;element name="CompanyIdentification" type="{http://xmlgw.companieshouse.gov.uk}IncorporationCompanyIdentification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncorporationCorporateOfficerAppointmentType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "corporateName",
    "address",
    "companyIdentification"
})
public class IncorporationCorporateOfficerAppointmentType
    extends NameType
{

    @XmlElement(name = "CorporateName", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected String corporateName;
    @XmlElement(name = "Address", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected CompanyAddressType address;
    @XmlElement(name = "CompanyIdentification", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected IncorporationCompanyIdentification companyIdentification;

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
     *     {@link IncorporationCompanyIdentification }
     *     
     */
    public IncorporationCompanyIdentification getCompanyIdentification() {
        return companyIdentification;
    }

    /**
     * Sets the value of the companyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncorporationCompanyIdentification }
     *     
     */
    public void setCompanyIdentification(IncorporationCompanyIdentification value) {
        this.companyIdentification = value;
    }

}
