
package com.kan.ukapidemo.dto.generated;

import java.time.LocalDate;
import com.kan.ukapidemo.adapters.LocalDateXmlAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PSCCessationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCCessationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Individual"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PSCIdentificationType"&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
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
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CessationDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCCessationType", propOrder = {
    "individual",
    "superSecureIndividual",
    "corporate",
    "legalPerson",
    "cessationDate"
})
public class PSCCessationType {

    @XmlElement(name = "Individual")
    protected PSCCessationType.Individual individual;
    @XmlElement(name = "SuperSecureIndividual")
    protected String superSecureIndividual;
    @XmlElement(name = "Corporate")
    protected PSCCessationType.Corporate corporate;
    @XmlElement(name = "LegalPerson")
    protected PSCCessationType.LegalPerson legalPerson;
    @XmlElement(name = "CessationDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate cessationDate;

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link PSCCessationType.Individual }
     *     
     */
    public PSCCessationType.Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCCessationType.Individual }
     *     
     */
    public void setIndividual(PSCCessationType.Individual value) {
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
     *     {@link PSCCessationType.Corporate }
     *     
     */
    public PSCCessationType.Corporate getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCCessationType.Corporate }
     *     
     */
    public void setCorporate(PSCCessationType.Corporate value) {
        this.corporate = value;
    }

    /**
     * Gets the value of the legalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PSCCessationType.LegalPerson }
     *     
     */
    public PSCCessationType.LegalPerson getLegalPerson() {
        return legalPerson;
    }

    /**
     * Sets the value of the legalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCCessationType.LegalPerson }
     *     
     */
    public void setLegalPerson(PSCCessationType.LegalPerson value) {
        this.legalPerson = value;
    }

    /**
     * Date the PSC notified or confirmed they are no longer a PSC with the company
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCessationDate() {
        return cessationDate;
    }

    /**
     * Sets the value of the cessationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCessationDate(LocalDate value) {
        this.cessationDate = value;
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
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PSCIdentificationType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Individual
        extends PSCIdentificationType
    {


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
