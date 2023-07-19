
package com.kan.ukapidemo.dto.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * PSC details provided in a LinkedStatement must relate to a PSC already filed with Companies House
 * 
 * <p>Java class for PSCLinkedStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCLinkedStatementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Statement" type="{http://xmlgw.companieshouse.gov.uk}StatementType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Individual" type="{http://xmlgw.companieshouse.gov.uk}PSCIdentificationType"/&gt;
 *           &lt;element ref="{http://xmlgw.companieshouse.gov.uk}SuperSecureIndividual"/&gt;
 *           &lt;element name="Corporate"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="LegalPerson"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}LegalPersonName"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCLinkedStatementType", propOrder = {
    "statement",
    "individual",
    "superSecureIndividual",
    "corporate",
    "legalPerson"
})
public class PSCLinkedStatementType {

    @XmlElement(name = "Statement", required = true)
    @XmlSchemaType(name = "string")
    protected StatementType statement;
    @XmlElement(name = "Individual")
    protected PSCIdentificationType individual;
    @XmlElement(name = "SuperSecureIndividual")
    protected String superSecureIndividual;
    @XmlElement(name = "Corporate")
    protected PSCLinkedStatementType.Corporate corporate;
    @XmlElement(name = "LegalPerson")
    protected PSCLinkedStatementType.LegalPerson legalPerson;

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType }
     *     
     */
    public StatementType getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType }
     *     
     */
    public void setStatement(StatementType value) {
        this.statement = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link PSCIdentificationType }
     *     
     */
    public PSCIdentificationType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCIdentificationType }
     *     
     */
    public void setIndividual(PSCIdentificationType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the superSecureIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperSecureIndividual() {
        return superSecureIndividual;
    }

    /**
     * Sets the value of the superSecureIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperSecureIndividual(String value) {
        this.superSecureIndividual = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link PSCLinkedStatementType.Corporate }
     *     
     */
    public PSCLinkedStatementType.Corporate getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCLinkedStatementType.Corporate }
     *     
     */
    public void setCorporate(PSCLinkedStatementType.Corporate value) {
        this.corporate = value;
    }

    /**
     * Gets the value of the legalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PSCLinkedStatementType.LegalPerson }
     *     
     */
    public PSCLinkedStatementType.LegalPerson getLegalPerson() {
        return legalPerson;
    }

    /**
     * Sets the value of the legalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCLinkedStatementType.LegalPerson }
     *     
     */
    public void setLegalPerson(PSCLinkedStatementType.LegalPerson value) {
        this.legalPerson = value;
    }


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
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/&gt;
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
        "corporateName"
    })
    public static class Corporate {

        @XmlElement(name = "CorporateName", required = true)
        protected String corporateName;

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

    }


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
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}LegalPersonName"/&gt;
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
        "legalPersonName"
    })
    public static class LegalPerson {

        @XmlElement(name = "LegalPersonName", required = true)
        protected String legalPersonName;

        /**
         * Gets the value of the legalPersonName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegalPersonName() {
            return legalPersonName;
        }

        /**
         * Sets the value of the legalPersonName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegalPersonName(String value) {
            this.legalPersonName = value;
        }

    }

}
