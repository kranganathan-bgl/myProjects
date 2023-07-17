
package com.kan.ukapidemo.dto.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSCChangeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSCChangeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Individual"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PSCIdentificationType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Change" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Name" type="{http://xmlgw.companieshouse.gov.uk}PersonChangeType" minOccurs="0"/&gt;
 *                               &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType" minOccurs="0"/&gt;
 *                               &lt;element name="ResidentialAddress" type="{http://xmlgw.companieshouse.gov.uk}PSCResidentialAddressType" minOccurs="0"/&gt;
 *                               &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality" minOccurs="0"/&gt;
 *                               &lt;element name="CountryOfResidence" minOccurs="0"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyNameAddressString"&gt;
 *                                     &lt;maxLength value="50"/&gt;
 *                                     &lt;whiteSpace value="collapse"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;choice minOccurs="0"&gt;
 *                                 &lt;element name="NatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}NatureOfControlsType"/&gt;
 *                                 &lt;element name="LLPNatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}LLPNatureOfControlsType"/&gt;
 *                               &lt;/choice&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
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
 *                     &lt;element name="Change" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName" minOccurs="0"/&gt;
 *                               &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType" minOccurs="0"/&gt;
 *                               &lt;element name="PSCCompanyIdentification" type="{http://xmlgw.companieshouse.gov.uk}CorporatePSCIdentificationType" minOccurs="0"/&gt;
 *                               &lt;choice minOccurs="0"&gt;
 *                                 &lt;element name="NatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}NatureOfControlsType"/&gt;
 *                                 &lt;element name="LLPNatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}LLPNatureOfControlsType"/&gt;
 *                               &lt;/choice&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
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
 *                     &lt;element name="Change" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://xmlgw.companieshouse.gov.uk}LegalPersonName" minOccurs="0"/&gt;
 *                               &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType" minOccurs="0"/&gt;
 *                               &lt;element name="LegalPersonIdentification" type="{http://xmlgw.companieshouse.gov.uk}LegalPersonIdentificationType" minOccurs="0"/&gt;
 *                               &lt;choice minOccurs="0"&gt;
 *                                 &lt;element name="NatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}NatureOfControlsType"/&gt;
 *                                 &lt;element name="LLPNatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}LLPNatureOfControlsType"/&gt;
 *                               &lt;/choice&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="DateOfChange" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSCChangeDetailsType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "individual",
    "superSecureIndividual",
    "corporate",
    "legalPerson",
    "dateOfChange"
})
public class PSCChangeDetailsType {

    @XmlElement(name = "Individual", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected PSCChangeDetailsType.Individual individual;
    @XmlElement(name = "SuperSecureIndividual", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected String superSecureIndividual;
    @XmlElement(name = "Corporate", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected PSCChangeDetailsType.Corporate corporate;
    @XmlElement(name = "LegalPerson", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected PSCChangeDetailsType.LegalPerson legalPerson;
    @XmlElement(name = "DateOfChange", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfChange;

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link PSCChangeDetailsType.Individual }
     *     
     */
    public PSCChangeDetailsType.Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCChangeDetailsType.Individual }
     *     
     */
    public void setIndividual(PSCChangeDetailsType.Individual value) {
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
     *     {@link PSCChangeDetailsType.Corporate }
     *     
     */
    public PSCChangeDetailsType.Corporate getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCChangeDetailsType.Corporate }
     *     
     */
    public void setCorporate(PSCChangeDetailsType.Corporate value) {
        this.corporate = value;
    }

    /**
     * Gets the value of the legalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PSCChangeDetailsType.LegalPerson }
     *     
     */
    public PSCChangeDetailsType.LegalPerson getLegalPerson() {
        return legalPerson;
    }

    /**
     * Sets the value of the legalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSCChangeDetailsType.LegalPerson }
     *     
     */
    public void setLegalPerson(PSCChangeDetailsType.LegalPerson value) {
        this.legalPerson = value;
    }

    /**
     * Gets the value of the dateOfChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfChange() {
        return dateOfChange;
    }

    /**
     * Sets the value of the dateOfChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfChange(XMLGregorianCalendar value) {
        this.dateOfChange = value;
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
     *         &lt;element name="Change" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName" minOccurs="0"/&gt;
     *                   &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType" minOccurs="0"/&gt;
     *                   &lt;element name="PSCCompanyIdentification" type="{http://xmlgw.companieshouse.gov.uk}CorporatePSCIdentificationType" minOccurs="0"/&gt;
     *                   &lt;choice minOccurs="0"&gt;
     *                     &lt;element name="NatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}NatureOfControlsType"/&gt;
     *                     &lt;element name="LLPNatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}LLPNatureOfControlsType"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "corporateName",
        "change"
    })
    public static class Corporate {

        @XmlElement(name = "CorporateName", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String corporateName;
        @XmlElement(name = "Change", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected PSCChangeDetailsType.Corporate.Change change;

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
         * Gets the value of the change property.
         * 
         * @return
         *     possible object is
         *     {@link PSCChangeDetailsType.Corporate.Change }
         *     
         */
        public PSCChangeDetailsType.Corporate.Change getChange() {
            return change;
        }

        /**
         * Sets the value of the change property.
         * 
         * @param value
         *     allowed object is
         *     {@link PSCChangeDetailsType.Corporate.Change }
         *     
         */
        public void setChange(PSCChangeDetailsType.Corporate.Change value) {
            this.change = value;
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
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName" minOccurs="0"/&gt;
         *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType" minOccurs="0"/&gt;
         *         &lt;element name="PSCCompanyIdentification" type="{http://xmlgw.companieshouse.gov.uk}CorporatePSCIdentificationType" minOccurs="0"/&gt;
         *         &lt;choice minOccurs="0"&gt;
         *           &lt;element name="NatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}NatureOfControlsType"/&gt;
         *           &lt;element name="LLPNatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}LLPNatureOfControlsType"/&gt;
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
        @XmlType(name = "", propOrder = {
            "corporateName",
            "address",
            "pscCompanyIdentification",
            "natureOfControls",
            "llpNatureOfControls"
        })
        public static class Change {

            @XmlElement(name = "CorporateName", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected String corporateName;
            @XmlElement(name = "Address", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected CompanyAddressType address;
            @XmlElement(name = "PSCCompanyIdentification", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected CorporatePSCIdentificationType pscCompanyIdentification;
            @XmlElement(name = "NatureOfControls", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected NatureOfControlsType natureOfControls;
            @XmlElement(name = "LLPNatureOfControls", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected LLPNatureOfControlsType llpNatureOfControls;

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
             * Gets the value of the pscCompanyIdentification property.
             * 
             * @return
             *     possible object is
             *     {@link CorporatePSCIdentificationType }
             *     
             */
            public CorporatePSCIdentificationType getPSCCompanyIdentification() {
                return pscCompanyIdentification;
            }

            /**
             * Sets the value of the pscCompanyIdentification property.
             * 
             * @param value
             *     allowed object is
             *     {@link CorporatePSCIdentificationType }
             *     
             */
            public void setPSCCompanyIdentification(CorporatePSCIdentificationType value) {
                this.pscCompanyIdentification = value;
            }

            /**
             * Gets the value of the natureOfControls property.
             * 
             * @return
             *     possible object is
             *     {@link NatureOfControlsType }
             *     
             */
            public NatureOfControlsType getNatureOfControls() {
                return natureOfControls;
            }

            /**
             * Sets the value of the natureOfControls property.
             * 
             * @param value
             *     allowed object is
             *     {@link NatureOfControlsType }
             *     
             */
            public void setNatureOfControls(NatureOfControlsType value) {
                this.natureOfControls = value;
            }

            /**
             * Gets the value of the llpNatureOfControls property.
             * 
             * @return
             *     possible object is
             *     {@link LLPNatureOfControlsType }
             *     
             */
            public LLPNatureOfControlsType getLLPNatureOfControls() {
                return llpNatureOfControls;
            }

            /**
             * Sets the value of the llpNatureOfControls property.
             * 
             * @param value
             *     allowed object is
             *     {@link LLPNatureOfControlsType }
             *     
             */
            public void setLLPNatureOfControls(LLPNatureOfControlsType value) {
                this.llpNatureOfControls = value;
            }

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
     *       &lt;sequence&gt;
     *         &lt;element name="Change" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Name" type="{http://xmlgw.companieshouse.gov.uk}PersonChangeType" minOccurs="0"/&gt;
     *                   &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType" minOccurs="0"/&gt;
     *                   &lt;element name="ResidentialAddress" type="{http://xmlgw.companieshouse.gov.uk}PSCResidentialAddressType" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality" minOccurs="0"/&gt;
     *                   &lt;element name="CountryOfResidence" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyNameAddressString"&gt;
     *                         &lt;maxLength value="50"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;choice minOccurs="0"&gt;
     *                     &lt;element name="NatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}NatureOfControlsType"/&gt;
     *                     &lt;element name="LLPNatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}LLPNatureOfControlsType"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "change"
    })
    public static class Individual
        extends PSCIdentificationType
    {

        @XmlElement(name = "Change", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected PSCChangeDetailsType.Individual.Change change;

        /**
         * Gets the value of the change property.
         * 
         * @return
         *     possible object is
         *     {@link PSCChangeDetailsType.Individual.Change }
         *     
         */
        public PSCChangeDetailsType.Individual.Change getChange() {
            return change;
        }

        /**
         * Sets the value of the change property.
         * 
         * @param value
         *     allowed object is
         *     {@link PSCChangeDetailsType.Individual.Change }
         *     
         */
        public void setChange(PSCChangeDetailsType.Individual.Change value) {
            this.change = value;
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
         *         &lt;element name="Name" type="{http://xmlgw.companieshouse.gov.uk}PersonChangeType" minOccurs="0"/&gt;
         *         &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType" minOccurs="0"/&gt;
         *         &lt;element name="ResidentialAddress" type="{http://xmlgw.companieshouse.gov.uk}PSCResidentialAddressType" minOccurs="0"/&gt;
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality" minOccurs="0"/&gt;
         *         &lt;element name="CountryOfResidence" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nonEmptyNameAddressString"&gt;
         *               &lt;maxLength value="50"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;choice minOccurs="0"&gt;
         *           &lt;element name="NatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}NatureOfControlsType"/&gt;
         *           &lt;element name="LLPNatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}LLPNatureOfControlsType"/&gt;
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
        @XmlType(name = "", propOrder = {
            "name",
            "serviceAddress",
            "residentialAddress",
            "nationality",
            "countryOfResidence",
            "natureOfControls",
            "llpNatureOfControls"
        })
        public static class Change {

            @XmlElement(name = "Name", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected PersonChangeType name;
            @XmlElement(name = "ServiceAddress", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected ServiceAddressType serviceAddress;
            @XmlElement(name = "ResidentialAddress", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected PSCResidentialAddressType residentialAddress;
            @XmlElement(name = "Nationality", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected String nationality;
            @XmlElement(name = "CountryOfResidence", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected String countryOfResidence;
            @XmlElement(name = "NatureOfControls", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected NatureOfControlsType natureOfControls;
            @XmlElement(name = "LLPNatureOfControls", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected LLPNatureOfControlsType llpNatureOfControls;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link PersonChangeType }
             *     
             */
            public PersonChangeType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonChangeType }
             *     
             */
            public void setName(PersonChangeType value) {
                this.name = value;
            }

            /**
             * Gets the value of the serviceAddress property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceAddressType }
             *     
             */
            public ServiceAddressType getServiceAddress() {
                return serviceAddress;
            }

            /**
             * Sets the value of the serviceAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceAddressType }
             *     
             */
            public void setServiceAddress(ServiceAddressType value) {
                this.serviceAddress = value;
            }

            /**
             * Gets the value of the residentialAddress property.
             * 
             * @return
             *     possible object is
             *     {@link PSCResidentialAddressType }
             *     
             */
            public PSCResidentialAddressType getResidentialAddress() {
                return residentialAddress;
            }

            /**
             * Sets the value of the residentialAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link PSCResidentialAddressType }
             *     
             */
            public void setResidentialAddress(PSCResidentialAddressType value) {
                this.residentialAddress = value;
            }

            /**
             * Gets the value of the nationality property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNationality() {
                return nationality;
            }

            /**
             * Sets the value of the nationality property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNationality(String value) {
                this.nationality = value;
            }

            /**
             * Gets the value of the countryOfResidence property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryOfResidence() {
                return countryOfResidence;
            }

            /**
             * Sets the value of the countryOfResidence property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryOfResidence(String value) {
                this.countryOfResidence = value;
            }

            /**
             * Gets the value of the natureOfControls property.
             * 
             * @return
             *     possible object is
             *     {@link NatureOfControlsType }
             *     
             */
            public NatureOfControlsType getNatureOfControls() {
                return natureOfControls;
            }

            /**
             * Sets the value of the natureOfControls property.
             * 
             * @param value
             *     allowed object is
             *     {@link NatureOfControlsType }
             *     
             */
            public void setNatureOfControls(NatureOfControlsType value) {
                this.natureOfControls = value;
            }

            /**
             * Gets the value of the llpNatureOfControls property.
             * 
             * @return
             *     possible object is
             *     {@link LLPNatureOfControlsType }
             *     
             */
            public LLPNatureOfControlsType getLLPNatureOfControls() {
                return llpNatureOfControls;
            }

            /**
             * Sets the value of the llpNatureOfControls property.
             * 
             * @param value
             *     allowed object is
             *     {@link LLPNatureOfControlsType }
             *     
             */
            public void setLLPNatureOfControls(LLPNatureOfControlsType value) {
                this.llpNatureOfControls = value;
            }

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
     *         &lt;element name="Change" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}LegalPersonName" minOccurs="0"/&gt;
     *                   &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType" minOccurs="0"/&gt;
     *                   &lt;element name="LegalPersonIdentification" type="{http://xmlgw.companieshouse.gov.uk}LegalPersonIdentificationType" minOccurs="0"/&gt;
     *                   &lt;choice minOccurs="0"&gt;
     *                     &lt;element name="NatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}NatureOfControlsType"/&gt;
     *                     &lt;element name="LLPNatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}LLPNatureOfControlsType"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "legalPersonName",
        "change"
    })
    public static class LegalPerson {

        @XmlElement(name = "LegalPersonName", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String legalPersonName;
        @XmlElement(name = "Change", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected PSCChangeDetailsType.LegalPerson.Change change;

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

        /**
         * Gets the value of the change property.
         * 
         * @return
         *     possible object is
         *     {@link PSCChangeDetailsType.LegalPerson.Change }
         *     
         */
        public PSCChangeDetailsType.LegalPerson.Change getChange() {
            return change;
        }

        /**
         * Sets the value of the change property.
         * 
         * @param value
         *     allowed object is
         *     {@link PSCChangeDetailsType.LegalPerson.Change }
         *     
         */
        public void setChange(PSCChangeDetailsType.LegalPerson.Change value) {
            this.change = value;
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
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}LegalPersonName" minOccurs="0"/&gt;
         *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType" minOccurs="0"/&gt;
         *         &lt;element name="LegalPersonIdentification" type="{http://xmlgw.companieshouse.gov.uk}LegalPersonIdentificationType" minOccurs="0"/&gt;
         *         &lt;choice minOccurs="0"&gt;
         *           &lt;element name="NatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}NatureOfControlsType"/&gt;
         *           &lt;element name="LLPNatureOfControls" type="{http://xmlgw.companieshouse.gov.uk}LLPNatureOfControlsType"/&gt;
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
        @XmlType(name = "", propOrder = {
            "legalPersonName",
            "address",
            "legalPersonIdentification",
            "natureOfControls",
            "llpNatureOfControls"
        })
        public static class Change {

            @XmlElement(name = "LegalPersonName", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected String legalPersonName;
            @XmlElement(name = "Address", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected CompanyAddressType address;
            @XmlElement(name = "LegalPersonIdentification", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected LegalPersonIdentificationType legalPersonIdentification;
            @XmlElement(name = "NatureOfControls", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected NatureOfControlsType natureOfControls;
            @XmlElement(name = "LLPNatureOfControls", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected LLPNatureOfControlsType llpNatureOfControls;

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
             * Gets the value of the legalPersonIdentification property.
             * 
             * @return
             *     possible object is
             *     {@link LegalPersonIdentificationType }
             *     
             */
            public LegalPersonIdentificationType getLegalPersonIdentification() {
                return legalPersonIdentification;
            }

            /**
             * Sets the value of the legalPersonIdentification property.
             * 
             * @param value
             *     allowed object is
             *     {@link LegalPersonIdentificationType }
             *     
             */
            public void setLegalPersonIdentification(LegalPersonIdentificationType value) {
                this.legalPersonIdentification = value;
            }

            /**
             * Gets the value of the natureOfControls property.
             * 
             * @return
             *     possible object is
             *     {@link NatureOfControlsType }
             *     
             */
            public NatureOfControlsType getNatureOfControls() {
                return natureOfControls;
            }

            /**
             * Sets the value of the natureOfControls property.
             * 
             * @param value
             *     allowed object is
             *     {@link NatureOfControlsType }
             *     
             */
            public void setNatureOfControls(NatureOfControlsType value) {
                this.natureOfControls = value;
            }

            /**
             * Gets the value of the llpNatureOfControls property.
             * 
             * @return
             *     possible object is
             *     {@link LLPNatureOfControlsType }
             *     
             */
            public LLPNatureOfControlsType getLLPNatureOfControls() {
                return llpNatureOfControls;
            }

            /**
             * Sets the value of the llpNatureOfControls property.
             * 
             * @param value
             *     allowed object is
             *     {@link LLPNatureOfControlsType }
             *     
             */
            public void setLLPNatureOfControls(LLPNatureOfControlsType value) {
                this.llpNatureOfControls = value;
            }

        }

    }

}
