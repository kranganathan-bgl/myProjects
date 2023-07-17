
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSCStatementNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCStatementNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CompanyStatement" type="{http://xmlgw.companieshouse.gov.uk}CompanyLevelStatementType"/&gt;
 *         &lt;element name="PSCStatement" type="{http://xmlgw.companieshouse.gov.uk}PSCLevelStatementType"/&gt;
 *         &lt;element name="PSCLinkedStatement" type="{http://xmlgw.companieshouse.gov.uk}PSCLinkedStatementType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCStatementNotificationType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "companyStatement",
    "pscStatement",
    "pscLinkedStatement"
})
@XmlSeeAlso({
    PSCStatementWithdrawalType.class
})
public class PSCStatementNotificationType {

    @XmlElement(name = "CompanyStatement", namespace = "http://xmlgw.companieshouse.gov.uk")
    @XmlSchemaType(name = "string")
    protected CompanyLevelStatementType companyStatement;
    @XmlElement(name = "PSCStatement", namespace = "http://xmlgw.companieshouse.gov.uk")
    @XmlSchemaType(name = "string")
    protected PSCLevelStatementType pscStatement;
    @XmlElement(name = "PSCLinkedStatement", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected PSCLinkedStatementType pscLinkedStatement;

    /**
     * Gets the value of the companyStatement property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLevelStatementType }
     *     
     */
    public CompanyLevelStatementType getCompanyStatement() {
        return companyStatement;
    }

    /**
     * Sets the value of the companyStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLevelStatementType }
     *     
     */
    public void setCompanyStatement(CompanyLevelStatementType value) {
        this.companyStatement = value;
    }

    /**
     * Gets the value of the pscStatement property.
     * 
     * @return
     *     possible object is
     *     {@link PSCLevelStatementType }
     *     
     */
    public PSCLevelStatementType getPSCStatement() {
        return pscStatement;
    }

    /**
     * Sets the value of the pscStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCLevelStatementType }
     *     
     */
    public void setPSCStatement(PSCLevelStatementType value) {
        this.pscStatement = value;
    }

    /**
     * Gets the value of the pscLinkedStatement property.
     * 
     * @return
     *     possible object is
     *     {@link PSCLinkedStatementType }
     *     
     */
    public PSCLinkedStatementType getPSCLinkedStatement() {
        return pscLinkedStatement;
    }

    /**
     * Sets the value of the pscLinkedStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCLinkedStatementType }
     *     
     */
    public void setPSCLinkedStatement(PSCLinkedStatementType value) {
        this.pscLinkedStatement = value;
    }

}
