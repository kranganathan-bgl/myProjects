
package com.kan.ukapidemo.dto.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}CompanyName"/&gt;
 *         &lt;element ref="{}CompanyNumber"/&gt;
 *         &lt;element name="HasInconsistencies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}RegAddress"/&gt;
 *         &lt;element ref="{}CompanyCategory"/&gt;
 *         &lt;element ref="{}CompanyStatus"/&gt;
 *         &lt;element ref="{}CountryOfOrigin"/&gt;
 *         &lt;element ref="{}RegistrationDate" minOccurs="0"/&gt;
 *         &lt;element name="RegDateType" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element ref="{}DissolutionDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}IncorporationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}ClosureDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}PreviousNames" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Accounts"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}AccountRefDate" minOccurs="0"/&gt;
 *                   &lt;element ref="{}NextDueDate" minOccurs="0"/&gt;
 *                   &lt;element ref="{}Overdue"/&gt;
 *                   &lt;element ref="{}LastMadeUpDate" minOccurs="0"/&gt;
 *                   &lt;element ref="{}AccountCategory" minOccurs="0"/&gt;
 *                   &lt;element ref="{}DocumentAvailable"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Returns"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}NextDueDate" minOccurs="0"/&gt;
 *                   &lt;element ref="{}Overdue"/&gt;
 *                   &lt;element ref="{}LastMadeUpDate" minOccurs="0"/&gt;
 *                   &lt;element ref="{}DocumentAvailable"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Mortgages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}MortgageInd"/&gt;
 *                   &lt;element ref="{}NumMortCharges"/&gt;
 *                   &lt;element ref="{}NumMortOutstanding"/&gt;
 *                   &lt;element ref="{}NumMortPartSatisfied"/&gt;
 *                   &lt;element ref="{}NumMortSatisfied"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}SICCodes"/&gt;
 *         &lt;element ref="{}LastFullMemDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}LastBulkShareDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}WeededDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}HasUKestablishment"/&gt;
 *         &lt;element ref="{}HasAppointments"/&gt;
 *         &lt;element ref="{}InLiquidation"/&gt;
 *         &lt;element name="LimitedPartnerships" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}NumGenPartners"/&gt;
 *                   &lt;element ref="{}NumLimPartners"/&gt;
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
    "companyName",
    "companyNumber",
    "hasInconsistencies",
    "regAddress",
    "companyCategory",
    "companyStatus",
    "countryOfOrigin",
    "registrationDate",
    "regDateType",
    "dissolutionDate",
    "incorporationDate",
    "closureDate",
    "previousNames",
    "accounts",
    "returns",
    "mortgages",
    "sicCodes",
    "lastFullMemDate",
    "lastBulkShareDate",
    "weededDate",
    "hasUKestablishment",
    "hasAppointments",
    "inLiquidation",
    "limitedPartnerships"
})
@XmlRootElement(name = "CompanyDetails")
public class CompanyDetails {

    @XmlElement(name = "CompanyName", required = true)
    protected String companyName;
    @XmlElement(name = "CompanyNumber", required = true)
    protected String companyNumber;
    @XmlElement(name = "HasInconsistencies")
    protected Boolean hasInconsistencies;
    @XmlElement(name = "RegAddress", required = true)
    protected RegAddressType regAddress;
    @XmlElement(name = "CompanyCategory", required = true)
    protected String companyCategory;
    @XmlElement(name = "CompanyStatus", required = true)
    protected String companyStatus;
    @XmlElement(name = "CountryOfOrigin", required = true)
    protected String countryOfOrigin;
    @XmlElement(name = "RegistrationDate")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "RegDateType", required = true)
    protected Object regDateType;
    @XmlElement(name = "DissolutionDate")
    protected XMLGregorianCalendar dissolutionDate;
    @XmlElement(name = "IncorporationDate")
    protected XMLGregorianCalendar incorporationDate;
    @XmlElement(name = "ClosureDate")
    protected XMLGregorianCalendar closureDate;
    @XmlElement(name = "PreviousNames")
    protected List<PreviousNamesType> previousNames;
    @XmlElement(name = "Accounts", required = true)
    protected CompanyDetails.Accounts accounts;
    @XmlElement(name = "Returns", required = true)
    protected CompanyDetails.Returns returns;
    @XmlElement(name = "Mortgages")
    protected CompanyDetails.Mortgages mortgages;
    @XmlElement(name = "SICCodes", required = true)
    protected SicCodesType sicCodes;
    @XmlElement(name = "LastFullMemDate")
    protected XMLGregorianCalendar lastFullMemDate;
    @XmlElement(name = "LastBulkShareDate")
    protected XMLGregorianCalendar lastBulkShareDate;
    @XmlElement(name = "WeededDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar weededDate;
    @XmlElement(name = "HasUKestablishment")
    protected boolean hasUKestablishment;
    @XmlElement(name = "HasAppointments")
    protected boolean hasAppointments;
    @XmlElement(name = "InLiquidation")
    protected boolean inLiquidation;
    @XmlElement(name = "LimitedPartnerships")
    protected CompanyDetails.LimitedPartnerships limitedPartnerships;

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

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNumber(String value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the hasInconsistencies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasInconsistencies() {
        return hasInconsistencies;
    }

    /**
     * Sets the value of the hasInconsistencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasInconsistencies(Boolean value) {
        this.hasInconsistencies = value;
    }

    /**
     * Gets the value of the regAddress property.
     * 
     * @return
     *     possible object is
     *     {@link RegAddressType }
     *     
     */
    public RegAddressType getRegAddress() {
        return regAddress;
    }

    /**
     * Sets the value of the regAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegAddressType }
     *     
     */
    public void setRegAddress(RegAddressType value) {
        this.regAddress = value;
    }

    /**
     * Gets the value of the companyCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCategory() {
        return companyCategory;
    }

    /**
     * Sets the value of the companyCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCategory(String value) {
        this.companyCategory = value;
    }

    /**
     * Gets the value of the companyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyStatus() {
        return companyStatus;
    }

    /**
     * Sets the value of the companyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyStatus(String value) {
        this.companyStatus = value;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfOrigin(String value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the regDateType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRegDateType() {
        return regDateType;
    }

    /**
     * Sets the value of the regDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRegDateType(Object value) {
        this.regDateType = value;
    }

    /**
     * Gets the value of the dissolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDissolutionDate() {
        return dissolutionDate;
    }

    /**
     * Sets the value of the dissolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDissolutionDate(XMLGregorianCalendar value) {
        this.dissolutionDate = value;
    }

    /**
     * Gets the value of the incorporationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncorporationDate() {
        return incorporationDate;
    }

    /**
     * Sets the value of the incorporationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncorporationDate(XMLGregorianCalendar value) {
        this.incorporationDate = value;
    }

    /**
     * Gets the value of the closureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosureDate() {
        return closureDate;
    }

    /**
     * Sets the value of the closureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosureDate(XMLGregorianCalendar value) {
        this.closureDate = value;
    }

    /**
     * Gets the value of the previousNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the previousNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreviousNamesType }
     * 
     * 
     */
    public List<PreviousNamesType> getPreviousNames() {
        if (previousNames == null) {
            previousNames = new ArrayList<PreviousNamesType>();
        }
        return this.previousNames;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDetails.Accounts }
     *     
     */
    public CompanyDetails.Accounts getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDetails.Accounts }
     *     
     */
    public void setAccounts(CompanyDetails.Accounts value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the returns property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDetails.Returns }
     *     
     */
    public CompanyDetails.Returns getReturns() {
        return returns;
    }

    /**
     * Sets the value of the returns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDetails.Returns }
     *     
     */
    public void setReturns(CompanyDetails.Returns value) {
        this.returns = value;
    }

    /**
     * Gets the value of the mortgages property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDetails.Mortgages }
     *     
     */
    public CompanyDetails.Mortgages getMortgages() {
        return mortgages;
    }

    /**
     * Sets the value of the mortgages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDetails.Mortgages }
     *     
     */
    public void setMortgages(CompanyDetails.Mortgages value) {
        this.mortgages = value;
    }

    /**
     * Gets the value of the sicCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SicCodesType }
     *     
     */
    public SicCodesType getSICCodes() {
        return sicCodes;
    }

    /**
     * Sets the value of the sicCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SicCodesType }
     *     
     */
    public void setSICCodes(SicCodesType value) {
        this.sicCodes = value;
    }

    /**
     * Gets the value of the lastFullMemDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFullMemDate() {
        return lastFullMemDate;
    }

    /**
     * Sets the value of the lastFullMemDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFullMemDate(XMLGregorianCalendar value) {
        this.lastFullMemDate = value;
    }

    /**
     * Gets the value of the lastBulkShareDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBulkShareDate() {
        return lastBulkShareDate;
    }

    /**
     * Sets the value of the lastBulkShareDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBulkShareDate(XMLGregorianCalendar value) {
        this.lastBulkShareDate = value;
    }

    /**
     * Gets the value of the weededDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeededDate() {
        return weededDate;
    }

    /**
     * Sets the value of the weededDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeededDate(XMLGregorianCalendar value) {
        this.weededDate = value;
    }

    /**
     * Gets the value of the hasUKestablishment property.
     * 
     */
    public boolean isHasUKestablishment() {
        return hasUKestablishment;
    }

    /**
     * Sets the value of the hasUKestablishment property.
     * 
     */
    public void setHasUKestablishment(boolean value) {
        this.hasUKestablishment = value;
    }

    /**
     * Gets the value of the hasAppointments property.
     * 
     */
    public boolean isHasAppointments() {
        return hasAppointments;
    }

    /**
     * Sets the value of the hasAppointments property.
     * 
     */
    public void setHasAppointments(boolean value) {
        this.hasAppointments = value;
    }

    /**
     * Gets the value of the inLiquidation property.
     * 
     */
    public boolean isInLiquidation() {
        return inLiquidation;
    }

    /**
     * Sets the value of the inLiquidation property.
     * 
     */
    public void setInLiquidation(boolean value) {
        this.inLiquidation = value;
    }

    /**
     * Gets the value of the limitedPartnerships property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDetails.LimitedPartnerships }
     *     
     */
    public CompanyDetails.LimitedPartnerships getLimitedPartnerships() {
        return limitedPartnerships;
    }

    /**
     * Sets the value of the limitedPartnerships property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDetails.LimitedPartnerships }
     *     
     */
    public void setLimitedPartnerships(CompanyDetails.LimitedPartnerships value) {
        this.limitedPartnerships = value;
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
     *         &lt;element ref="{}AccountRefDate" minOccurs="0"/&gt;
     *         &lt;element ref="{}NextDueDate" minOccurs="0"/&gt;
     *         &lt;element ref="{}Overdue"/&gt;
     *         &lt;element ref="{}LastMadeUpDate" minOccurs="0"/&gt;
     *         &lt;element ref="{}AccountCategory" minOccurs="0"/&gt;
     *         &lt;element ref="{}DocumentAvailable"/&gt;
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
        "accountRefDate",
        "nextDueDate",
        "overdue",
        "lastMadeUpDate",
        "accountCategory",
        "documentAvailable"
    })
    public static class Accounts {

        @XmlElement(name = "AccountRefDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar accountRefDate;
        @XmlElement(name = "NextDueDate")
        protected XMLGregorianCalendar nextDueDate;
        @XmlElement(name = "Overdue", required = true)
        protected String overdue;
        @XmlElement(name = "LastMadeUpDate")
        protected XMLGregorianCalendar lastMadeUpDate;
        @XmlElement(name = "AccountCategory")
        protected String accountCategory;
        @XmlElement(name = "DocumentAvailable")
        protected boolean documentAvailable;

        /**
         * Gets the value of the accountRefDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAccountRefDate() {
            return accountRefDate;
        }

        /**
         * Sets the value of the accountRefDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAccountRefDate(XMLGregorianCalendar value) {
            this.accountRefDate = value;
        }

        /**
         * Gets the value of the nextDueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNextDueDate() {
            return nextDueDate;
        }

        /**
         * Sets the value of the nextDueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNextDueDate(XMLGregorianCalendar value) {
            this.nextDueDate = value;
        }

        /**
         * Gets the value of the overdue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverdue() {
            return overdue;
        }

        /**
         * Sets the value of the overdue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverdue(String value) {
            this.overdue = value;
        }

        /**
         * Gets the value of the lastMadeUpDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastMadeUpDate() {
            return lastMadeUpDate;
        }

        /**
         * Sets the value of the lastMadeUpDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastMadeUpDate(XMLGregorianCalendar value) {
            this.lastMadeUpDate = value;
        }

        /**
         * Gets the value of the accountCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountCategory() {
            return accountCategory;
        }

        /**
         * Sets the value of the accountCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountCategory(String value) {
            this.accountCategory = value;
        }

        /**
         * Gets the value of the documentAvailable property.
         * 
         */
        public boolean isDocumentAvailable() {
            return documentAvailable;
        }

        /**
         * Sets the value of the documentAvailable property.
         * 
         */
        public void setDocumentAvailable(boolean value) {
            this.documentAvailable = value;
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
     *         &lt;element ref="{}NumGenPartners"/&gt;
     *         &lt;element ref="{}NumLimPartners"/&gt;
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
        "numGenPartners",
        "numLimPartners"
    })
    public static class LimitedPartnerships {

        @XmlElement(name = "NumGenPartners", required = true)
        protected BigInteger numGenPartners;
        @XmlElement(name = "NumLimPartners", required = true)
        protected BigInteger numLimPartners;

        /**
         * Gets the value of the numGenPartners property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumGenPartners() {
            return numGenPartners;
        }

        /**
         * Sets the value of the numGenPartners property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumGenPartners(BigInteger value) {
            this.numGenPartners = value;
        }

        /**
         * Gets the value of the numLimPartners property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumLimPartners() {
            return numLimPartners;
        }

        /**
         * Sets the value of the numLimPartners property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumLimPartners(BigInteger value) {
            this.numLimPartners = value;
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
     *         &lt;element ref="{}MortgageInd"/&gt;
     *         &lt;element ref="{}NumMortCharges"/&gt;
     *         &lt;element ref="{}NumMortOutstanding"/&gt;
     *         &lt;element ref="{}NumMortPartSatisfied"/&gt;
     *         &lt;element ref="{}NumMortSatisfied"/&gt;
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
        "mortgageInd",
        "numMortCharges",
        "numMortOutstanding",
        "numMortPartSatisfied",
        "numMortSatisfied"
    })
    public static class Mortgages {

        @XmlElement(name = "MortgageInd", required = true)
        protected String mortgageInd;
        @XmlElement(name = "NumMortCharges", required = true)
        protected BigInteger numMortCharges;
        @XmlElement(name = "NumMortOutstanding", required = true)
        protected BigInteger numMortOutstanding;
        @XmlElement(name = "NumMortPartSatisfied", required = true)
        protected BigInteger numMortPartSatisfied;
        @XmlElement(name = "NumMortSatisfied", required = true)
        protected BigInteger numMortSatisfied;

        /**
         * Gets the value of the mortgageInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMortgageInd() {
            return mortgageInd;
        }

        /**
         * Sets the value of the mortgageInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMortgageInd(String value) {
            this.mortgageInd = value;
        }

        /**
         * Gets the value of the numMortCharges property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumMortCharges() {
            return numMortCharges;
        }

        /**
         * Sets the value of the numMortCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumMortCharges(BigInteger value) {
            this.numMortCharges = value;
        }

        /**
         * Gets the value of the numMortOutstanding property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumMortOutstanding() {
            return numMortOutstanding;
        }

        /**
         * Sets the value of the numMortOutstanding property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumMortOutstanding(BigInteger value) {
            this.numMortOutstanding = value;
        }

        /**
         * Gets the value of the numMortPartSatisfied property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumMortPartSatisfied() {
            return numMortPartSatisfied;
        }

        /**
         * Sets the value of the numMortPartSatisfied property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumMortPartSatisfied(BigInteger value) {
            this.numMortPartSatisfied = value;
        }

        /**
         * Gets the value of the numMortSatisfied property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumMortSatisfied() {
            return numMortSatisfied;
        }

        /**
         * Sets the value of the numMortSatisfied property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumMortSatisfied(BigInteger value) {
            this.numMortSatisfied = value;
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
     *         &lt;element ref="{}NextDueDate" minOccurs="0"/&gt;
     *         &lt;element ref="{}Overdue"/&gt;
     *         &lt;element ref="{}LastMadeUpDate" minOccurs="0"/&gt;
     *         &lt;element ref="{}DocumentAvailable"/&gt;
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
        "nextDueDate",
        "overdue",
        "lastMadeUpDate",
        "documentAvailable"
    })
    public static class Returns {

        @XmlElement(name = "NextDueDate")
        protected XMLGregorianCalendar nextDueDate;
        @XmlElement(name = "Overdue", required = true)
        protected String overdue;
        @XmlElement(name = "LastMadeUpDate")
        protected XMLGregorianCalendar lastMadeUpDate;
        @XmlElement(name = "DocumentAvailable")
        protected boolean documentAvailable;

        /**
         * Gets the value of the nextDueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNextDueDate() {
            return nextDueDate;
        }

        /**
         * Sets the value of the nextDueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNextDueDate(XMLGregorianCalendar value) {
            this.nextDueDate = value;
        }

        /**
         * Gets the value of the overdue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverdue() {
            return overdue;
        }

        /**
         * Sets the value of the overdue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverdue(String value) {
            this.overdue = value;
        }

        /**
         * Gets the value of the lastMadeUpDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastMadeUpDate() {
            return lastMadeUpDate;
        }

        /**
         * Sets the value of the lastMadeUpDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastMadeUpDate(XMLGregorianCalendar value) {
            this.lastMadeUpDate = value;
        }

        /**
         * Gets the value of the documentAvailable property.
         * 
         */
        public boolean isDocumentAvailable() {
            return documentAvailable;
        }

        /**
         * Sets the value of the documentAvailable property.
         * 
         */
        public void setDocumentAvailable(boolean value) {
            this.documentAvailable = value;
        }

    }

}
