
package com.kan.ukapidemo.dto.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="CompanyNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CompanyCategory"/&gt;
 *         &lt;element name="Jurisdiction"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="EW"/&gt;
 *               &lt;enumeration value="SC"/&gt;
 *               &lt;enumeration value="WA"/&gt;
 *               &lt;enumeration value="NI"/&gt;
 *               &lt;enumeration value="EU"/&gt;
 *               &lt;enumeration value="UK"/&gt;
 *               &lt;enumeration value="EN"/&gt;
 *               &lt;enumeration value="OTHER"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TradingOnMarket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DTR5Applies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PSCExemptAsTradingOnRegulatedMarket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PSCExemptAsSharesAdmittedOnMarket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PSCExemptAsTradingOnUKRegulatedMarket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}MadeUpDate"/&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NextDueDate"/&gt;
 *         &lt;element name="RegisteredOfficeAddress" type="{http://xmlgw.companieshouse.gov.uk}UKAddressType"/&gt;
 *         &lt;element name="SailAddress" type="{http://xmlgw.companieshouse.gov.uk}UKAddressType" minOccurs="0"/&gt;
 *         &lt;element name="SailRecords" maxOccurs="16" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}RecordType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}SICCodes" maxOccurs="4"/&gt;
 *         &lt;element name="Officers"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="Director"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://xmlgw.companieshouse.gov.uk}CompanyDataDirectorType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AppointmentDate"/&gt;
 *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ResignationDate" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Secretary"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://xmlgw.companieshouse.gov.uk}CompanyDataSecretaryType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AppointmentDate"/&gt;
 *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ResignationDate" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Member" type="{http://xmlgw.companieshouse.gov.uk}CompanyDataMemberType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSCs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="CompanyStatement" type="{http://xmlgw.companieshouse.gov.uk}CompanyLevelStatementType"/&gt;
 *                   &lt;element name="PSC" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="PSCStatementNotification" type="{http://xmlgw.companieshouse.gov.uk}PSCLevelStatementType"/&gt;
 *                             &lt;element name="PSCLinkedStatementNotification" type="{http://xmlgw.companieshouse.gov.uk}PSCLinkedStatementType"/&gt;
 *                             &lt;element name="PSCNotification"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PSCNotificationReturnType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NotificationDate"/&gt;
 *                                       &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CessationDate" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}SuperSecureIndividual"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatementOfCapital" type="{http://xmlgw.companieshouse.gov.uk}StatementOfCapitalType" minOccurs="0"/&gt;
 *         &lt;element name="Shareholdings" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ShareClass"/&gt;
 *                   &lt;element name="NumberHeld"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;maxInclusive value="999999999999999.999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;fractionDigits value="6"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Shareholders" maxOccurs="10"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Name"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Surname"/&gt;
 *                                         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Forename" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;element name="AmalgamatedName" type="{http://xmlgw.companieshouse.gov.uk}nonEmptyString"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}AddressBaseType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Registers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HeldOnPublicRecord" maxOccurs="7"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RegisterType" type="{http://xmlgw.companieshouse.gov.uk}RegisterTypeType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
    "companyNumber",
    "companyName",
    "companyCategory",
    "jurisdiction",
    "tradingOnMarket",
    "dtr5Applies",
    "pscExemptAsTradingOnRegulatedMarket",
    "pscExemptAsSharesAdmittedOnMarket",
    "pscExemptAsTradingOnUKRegulatedMarket",
    "madeUpDate",
    "nextDueDate",
    "registeredOfficeAddress",
    "sailAddress",
    "sailRecords",
    "sicCodes",
    "officers",
    "psCs",
    "statementOfCapital",
    "shareholdings",
    "registers"
})
//@XmlRootElement(name = "CompanyData", namespace = "http://xmlgw.companieshouse.gov.uk")
@XmlRootElement(name = "CompanyData", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
public class CompanyData {

    @XmlElement(name = "CompanyNumber", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
    protected Object companyNumber;
    @XmlElement(name = "CompanyName", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
    protected Object companyName;
    @XmlElement(name = "CompanyCategory", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
    protected String companyCategory;
    @XmlElement(name = "Jurisdiction", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
    protected String jurisdiction;
    @XmlElement(name = "TradingOnMarket", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
    protected Boolean tradingOnMarket;
    @XmlElement(name = "DTR5Applies", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
    protected Boolean dtr5Applies;
    @XmlElement(name = "PSCExemptAsTradingOnRegulatedMarket", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected Boolean pscExemptAsTradingOnRegulatedMarket;
    @XmlElement(name = "PSCExemptAsSharesAdmittedOnMarket", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected Boolean pscExemptAsSharesAdmittedOnMarket;
    @XmlElement(name = "PSCExemptAsTradingOnUKRegulatedMarket", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected Boolean pscExemptAsTradingOnUKRegulatedMarket;
    @XmlElement(name = "MadeUpDate", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar madeUpDate;
    @XmlElement(name = "NextDueDate", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected XMLGregorianCalendar nextDueDate;
    @XmlElement(name = "RegisteredOfficeAddress", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected UKAddressType registeredOfficeAddress;
    @XmlElement(name = "SailAddress", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected UKAddressType sailAddress;
    @XmlElement(name = "SailRecords", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected List<CompanyData.SailRecords> sailRecords;
    @XmlElement(name = "SICCodes", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected List<SICCodesType> sicCodes;
    @XmlElement(name = "Officers", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected CompanyData.Officers officers;
    @XmlElement(name = "PSCs", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected CompanyData.PSCs psCs;
    @XmlElement(name = "StatementOfCapital", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected StatementOfCapitalType statementOfCapital;
    @XmlElement(name = "Shareholdings", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected List<CompanyData.Shareholdings> shareholdings;
    @XmlElement(name = "Registers", namespace = "http://xmlgw.companieshouse.gov.uk")
    protected CompanyData.Registers registers;

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompanyNumber(Object value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompanyName(Object value) {
        this.companyName = value;
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
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdiction(String value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the tradingOnMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradingOnMarket() {
        return tradingOnMarket;
    }

    /**
     * Sets the value of the tradingOnMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTradingOnMarket(Boolean value) {
        this.tradingOnMarket = value;
    }

    /**
     * Gets the value of the dtr5Applies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDTR5Applies() {
        return dtr5Applies;
    }

    /**
     * Sets the value of the dtr5Applies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDTR5Applies(Boolean value) {
        this.dtr5Applies = value;
    }

    /**
     * Gets the value of the pscExemptAsTradingOnRegulatedMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPSCExemptAsTradingOnRegulatedMarket() {
        return pscExemptAsTradingOnRegulatedMarket;
    }

    /**
     * Sets the value of the pscExemptAsTradingOnRegulatedMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPSCExemptAsTradingOnRegulatedMarket(Boolean value) {
        this.pscExemptAsTradingOnRegulatedMarket = value;
    }

    /**
     * Gets the value of the pscExemptAsSharesAdmittedOnMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPSCExemptAsSharesAdmittedOnMarket() {
        return pscExemptAsSharesAdmittedOnMarket;
    }

    /**
     * Sets the value of the pscExemptAsSharesAdmittedOnMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPSCExemptAsSharesAdmittedOnMarket(Boolean value) {
        this.pscExemptAsSharesAdmittedOnMarket = value;
    }

    /**
     * Gets the value of the pscExemptAsTradingOnUKRegulatedMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPSCExemptAsTradingOnUKRegulatedMarket() {
        return pscExemptAsTradingOnUKRegulatedMarket;
    }

    /**
     * Sets the value of the pscExemptAsTradingOnUKRegulatedMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPSCExemptAsTradingOnUKRegulatedMarket(Boolean value) {
        this.pscExemptAsTradingOnUKRegulatedMarket = value;
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
     * Gets the value of the registeredOfficeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UKAddressType }
     *     
     */
    public UKAddressType getRegisteredOfficeAddress() {
        return registeredOfficeAddress;
    }

    /**
     * Sets the value of the registeredOfficeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UKAddressType }
     *     
     */
    public void setRegisteredOfficeAddress(UKAddressType value) {
        this.registeredOfficeAddress = value;
    }

    /**
     * Gets the value of the sailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UKAddressType }
     *     
     */
    public UKAddressType getSailAddress() {
        return sailAddress;
    }

    /**
     * Sets the value of the sailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UKAddressType }
     *     
     */
    public void setSailAddress(UKAddressType value) {
        this.sailAddress = value;
    }

    /**
     * Gets the value of the sailRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sailRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSailRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyData.SailRecords }
     * 
     * 
     */
    public List<CompanyData.SailRecords> getSailRecords() {
        if (sailRecords == null) {
            sailRecords = new ArrayList<CompanyData.SailRecords>();
        }
        return this.sailRecords;
    }

    /**
     * Gets the value of the sicCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sicCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSICCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SICCodesType }
     * 
     * 
     */
    public List<SICCodesType> getSICCodes() {
        if (sicCodes == null) {
            sicCodes = new ArrayList<SICCodesType>();
        }
        return this.sicCodes;
    }

    /**
     * Gets the value of the officers property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyData.Officers }
     *     
     */
    public CompanyData.Officers getOfficers() {
        return officers;
    }

    /**
     * Sets the value of the officers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyData.Officers }
     *     
     */
    public void setOfficers(CompanyData.Officers value) {
        this.officers = value;
    }

    /**
     * Gets the value of the psCs property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyData.PSCs }
     *     
     */
    public CompanyData.PSCs getPSCs() {
        return psCs;
    }

    /**
     * Sets the value of the psCs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyData.PSCs }
     *     
     */
    public void setPSCs(CompanyData.PSCs value) {
        this.psCs = value;
    }

    /**
     * Gets the value of the statementOfCapital property.
     * 
     * @return
     *     possible object is
     *     {@link StatementOfCapitalType }
     *     
     */
    public StatementOfCapitalType getStatementOfCapital() {
        return statementOfCapital;
    }

    /**
     * Sets the value of the statementOfCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementOfCapitalType }
     *     
     */
    public void setStatementOfCapital(StatementOfCapitalType value) {
        this.statementOfCapital = value;
    }

    /**
     * Gets the value of the shareholdings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shareholdings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareholdings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyData.Shareholdings }
     * 
     * 
     */
    public List<CompanyData.Shareholdings> getShareholdings() {
        if (shareholdings == null) {
            shareholdings = new ArrayList<CompanyData.Shareholdings>();
        }
        return this.shareholdings;
    }

    /**
     * Gets the value of the registers property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyData.Registers }
     *     
     */
    public CompanyData.Registers getRegisters() {
        return registers;
    }

    /**
     * Sets the value of the registers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyData.Registers }
     *     
     */
    public void setRegisters(CompanyData.Registers value) {
        this.registers = value;
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
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="Director"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}CompanyDataDirectorType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AppointmentDate"/&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ResignationDate" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Secretary"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}CompanyDataSecretaryType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AppointmentDate"/&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ResignationDate" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Member" type="{http://xmlgw.companieshouse.gov.uk}CompanyDataMemberType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "directorOrSecretaryOrMember"
    })
    public static class Officers {

        @XmlElements({
            @XmlElement(name = "Director", namespace = "http://xmlgw.companieshouse.gov.uk", type = CompanyData.Officers.Director.class),
            @XmlElement(name = "Secretary", namespace = "http://xmlgw.companieshouse.gov.uk", type = CompanyData.Officers.Secretary.class),
            @XmlElement(name = "Member", namespace = "http://xmlgw.companieshouse.gov.uk", type = CompanyDataMemberType.class)
        })
        protected List<Object> directorOrSecretaryOrMember;

        /**
         * Gets the value of the directorOrSecretaryOrMember property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the directorOrSecretaryOrMember property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirectorOrSecretaryOrMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyData.Officers.Director }
         * {@link CompanyData.Officers.Secretary }
         * {@link CompanyDataMemberType }
         * 
         * 
         */
        public List<Object> getDirectorOrSecretaryOrMember() {
            if (directorOrSecretaryOrMember == null) {
                directorOrSecretaryOrMember = new ArrayList<Object>();
            }
            return this.directorOrSecretaryOrMember;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}CompanyDataDirectorType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AppointmentDate"/&gt;
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ResignationDate" minOccurs="0"/&gt;
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
            "appointmentDate",
            "resignationDate"
        })
        public static class Director
            extends CompanyDataDirectorType
        {

            @XmlElement(name = "AppointmentDate", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar appointmentDate;
            @XmlElement(name = "ResignationDate", namespace = "http://xmlgw.companieshouse.gov.uk")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar resignationDate;

            /**
             * Gets the value of the appointmentDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAppointmentDate() {
                return appointmentDate;
            }

            /**
             * Sets the value of the appointmentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAppointmentDate(XMLGregorianCalendar value) {
                this.appointmentDate = value;
            }

            /**
             * Gets the value of the resignationDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getResignationDate() {
                return resignationDate;
            }

            /**
             * Sets the value of the resignationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setResignationDate(XMLGregorianCalendar value) {
                this.resignationDate = value;
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
         *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}CompanyDataSecretaryType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AppointmentDate"/&gt;
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ResignationDate" minOccurs="0"/&gt;
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
            "appointmentDate",
            "resignationDate"
        })
        public static class Secretary
            extends CompanyDataSecretaryType
        {

            @XmlElement(name = "AppointmentDate", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar appointmentDate;
            @XmlElement(name = "ResignationDate", namespace = "http://xmlgw.companieshouse.gov.uk")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar resignationDate;

            /**
             * Gets the value of the appointmentDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAppointmentDate() {
                return appointmentDate;
            }

            /**
             * Sets the value of the appointmentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAppointmentDate(XMLGregorianCalendar value) {
                this.appointmentDate = value;
            }

            /**
             * Gets the value of the resignationDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getResignationDate() {
                return resignationDate;
            }

            /**
             * Sets the value of the resignationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setResignationDate(XMLGregorianCalendar value) {
                this.resignationDate = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="CompanyStatement" type="{http://xmlgw.companieshouse.gov.uk}CompanyLevelStatementType"/&gt;
     *         &lt;element name="PSC" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="PSCStatementNotification" type="{http://xmlgw.companieshouse.gov.uk}PSCLevelStatementType"/&gt;
     *                   &lt;element name="PSCLinkedStatementNotification" type="{http://xmlgw.companieshouse.gov.uk}PSCLinkedStatementType"/&gt;
     *                   &lt;element name="PSCNotification"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PSCNotificationReturnType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NotificationDate"/&gt;
     *                             &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CessationDate" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}SuperSecureIndividual"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "companyStatement",
        "psc"
    })
    public static class PSCs {

        @XmlElement(name = "CompanyStatement", namespace = "http://xmlgw.companieshouse.gov.uk")
        @XmlSchemaType(name = "string")
        protected CompanyLevelStatementType companyStatement;
        @XmlElement(name = "PSC", namespace = "http://xmlgw.companieshouse.gov.uk")
        protected List<CompanyData.PSCs.PSC> psc;

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
         * Gets the value of the psc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the psc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPSC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyData.PSCs.PSC }
         * 
         * 
         */
        public List<CompanyData.PSCs.PSC> getPSC() {
            if (psc == null) {
                psc = new ArrayList<CompanyData.PSCs.PSC>();
            }
            return this.psc;
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
         *       &lt;choice&gt;
         *         &lt;element name="PSCStatementNotification" type="{http://xmlgw.companieshouse.gov.uk}PSCLevelStatementType"/&gt;
         *         &lt;element name="PSCLinkedStatementNotification" type="{http://xmlgw.companieshouse.gov.uk}PSCLinkedStatementType"/&gt;
         *         &lt;element name="PSCNotification"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PSCNotificationReturnType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NotificationDate"/&gt;
         *                   &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CessationDate" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}SuperSecureIndividual"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pscStatementNotification",
            "pscLinkedStatementNotification",
            "pscNotification",
            "superSecureIndividual"
        })
        public static class PSC {

            @XmlElement(name = "PSCStatementNotification", namespace = "http://xmlgw.companieshouse.gov.uk")
            @XmlSchemaType(name = "string")
            protected PSCLevelStatementType pscStatementNotification;
            @XmlElement(name = "PSCLinkedStatementNotification", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected PSCLinkedStatementType pscLinkedStatementNotification;
            @XmlElement(name = "PSCNotification", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected CompanyData.PSCs.PSC.PSCNotification pscNotification;
            @XmlElement(name = "SuperSecureIndividual", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected String superSecureIndividual;

            /**
             * Gets the value of the pscStatementNotification property.
             * 
             * @return
             *     possible object is
             *     {@link PSCLevelStatementType }
             *     
             */
            public PSCLevelStatementType getPSCStatementNotification() {
                return pscStatementNotification;
            }

            /**
             * Sets the value of the pscStatementNotification property.
             * 
             * @param value
             *     allowed object is
             *     {@link PSCLevelStatementType }
             *     
             */
            public void setPSCStatementNotification(PSCLevelStatementType value) {
                this.pscStatementNotification = value;
            }

            /**
             * Gets the value of the pscLinkedStatementNotification property.
             * 
             * @return
             *     possible object is
             *     {@link PSCLinkedStatementType }
             *     
             */
            public PSCLinkedStatementType getPSCLinkedStatementNotification() {
                return pscLinkedStatementNotification;
            }

            /**
             * Sets the value of the pscLinkedStatementNotification property.
             * 
             * @param value
             *     allowed object is
             *     {@link PSCLinkedStatementType }
             *     
             */
            public void setPSCLinkedStatementNotification(PSCLinkedStatementType value) {
                this.pscLinkedStatementNotification = value;
            }

            /**
             * Gets the value of the pscNotification property.
             * 
             * @return
             *     possible object is
             *     {@link CompanyData.PSCs.PSC.PSCNotification }
             *     
             */
            public CompanyData.PSCs.PSC.PSCNotification getPSCNotification() {
                return pscNotification;
            }

            /**
             * Sets the value of the pscNotification property.
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyData.PSCs.PSC.PSCNotification }
             *     
             */
            public void setPSCNotification(CompanyData.PSCs.PSC.PSCNotification value) {
                this.pscNotification = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PSCNotificationReturnType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}NotificationDate"/&gt;
             *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CessationDate" minOccurs="0"/&gt;
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
                "notificationDate",
                "cessationDate"
            })
            public static class PSCNotification
                extends PSCNotificationReturnType
            {

                @XmlElement(name = "NotificationDate", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar notificationDate;
                @XmlElement(name = "CessationDate", namespace = "http://xmlgw.companieshouse.gov.uk")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar cessationDate;

                /**
                 * Gets the value of the notificationDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getNotificationDate() {
                    return notificationDate;
                }

                /**
                 * Sets the value of the notificationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setNotificationDate(XMLGregorianCalendar value) {
                    this.notificationDate = value;
                }

                /**
                 * Gets the value of the cessationDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCessationDate() {
                    return cessationDate;
                }

                /**
                 * Sets the value of the cessationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCessationDate(XMLGregorianCalendar value) {
                    this.cessationDate = value;
                }

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
     *         &lt;element name="HeldOnPublicRecord" maxOccurs="7"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RegisterType" type="{http://xmlgw.companieshouse.gov.uk}RegisterTypeType"/&gt;
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
        "heldOnPublicRecord"
    })
    public static class Registers {

        @XmlElement(name = "HeldOnPublicRecord", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected List<CompanyData.Registers.HeldOnPublicRecord> heldOnPublicRecord;

        /**
         * Gets the value of the heldOnPublicRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the heldOnPublicRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHeldOnPublicRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyData.Registers.HeldOnPublicRecord }
         * 
         * 
         */
        public List<CompanyData.Registers.HeldOnPublicRecord> getHeldOnPublicRecord() {
            if (heldOnPublicRecord == null) {
                heldOnPublicRecord = new ArrayList<CompanyData.Registers.HeldOnPublicRecord>();
            }
            return this.heldOnPublicRecord;
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
         *         &lt;element name="RegisterType" type="{http://xmlgw.companieshouse.gov.uk}RegisterTypeType"/&gt;
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
            "registerType"
        })
        public static class HeldOnPublicRecord {

            @XmlElement(name = "RegisterType", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
            @XmlSchemaType(name = "string")
            protected RegisterTypeType registerType;

            /**
             * Gets the value of the registerType property.
             * 
             * @return
             *     possible object is
             *     {@link RegisterTypeType }
             *     
             */
            public RegisterTypeType getRegisterType() {
                return registerType;
            }

            /**
             * Sets the value of the registerType property.
             * 
             * @param value
             *     allowed object is
             *     {@link RegisterTypeType }
             *     
             */
            public void setRegisterType(RegisterTypeType value) {
                this.registerType = value;
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
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}RecordType"/&gt;
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
        "recordType"
    })
    public static class SailRecords {

        @XmlElement(name = "RecordType", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String recordType;

        /**
         * Gets the value of the recordType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordType() {
            return recordType;
        }

        /**
         * Sets the value of the recordType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordType(String value) {
            this.recordType = value;
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
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}ShareClass"/&gt;
     *         &lt;element name="NumberHeld"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *               &lt;maxInclusive value="999999999999999.999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;fractionDigits value="6"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Shareholders" maxOccurs="10"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Name"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Surname"/&gt;
     *                               &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Forename" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;element name="AmalgamatedName" type="{http://xmlgw.companieshouse.gov.uk}nonEmptyString"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}AddressBaseType" minOccurs="0"/&gt;
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
        "shareClass",
        "numberHeld",
        "shareholders"
    })
    public static class Shareholdings {

        @XmlElement(name = "ShareClass", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected String shareClass;
        @XmlElement(name = "NumberHeld", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected BigDecimal numberHeld;
        @XmlElement(name = "Shareholders", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
        protected List<CompanyData.Shareholdings.Shareholders> shareholders;

        /**
         * Gets the value of the shareClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareClass() {
            return shareClass;
        }

        /**
         * Sets the value of the shareClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareClass(String value) {
            this.shareClass = value;
        }

        /**
         * Gets the value of the numberHeld property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNumberHeld() {
            return numberHeld;
        }

        /**
         * Sets the value of the numberHeld property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNumberHeld(BigDecimal value) {
            this.numberHeld = value;
        }

        /**
         * Gets the value of the shareholders property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the shareholders property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShareholders().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyData.Shareholdings.Shareholders }
         * 
         * 
         */
        public List<CompanyData.Shareholdings.Shareholders> getShareholders() {
            if (shareholders == null) {
                shareholders = new ArrayList<CompanyData.Shareholdings.Shareholders>();
            }
            return this.shareholders;
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
         *         &lt;element name="Name"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Surname"/&gt;
         *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Forename" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;element name="AmalgamatedName" type="{http://xmlgw.companieshouse.gov.uk}nonEmptyString"/&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}AddressBaseType" minOccurs="0"/&gt;
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
            "address"
        })
        public static class Shareholders {

            @XmlElement(name = "Name", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
            protected CompanyData.Shareholdings.Shareholders.Name name;
            @XmlElement(name = "Address", namespace = "http://xmlgw.companieshouse.gov.uk")
            protected AddressBaseType address;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link CompanyData.Shareholdings.Shareholders.Name }
             *     
             */
            public CompanyData.Shareholdings.Shareholders.Name getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyData.Shareholdings.Shareholders.Name }
             *     
             */
            public void setName(CompanyData.Shareholdings.Shareholders.Name value) {
                this.name = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link AddressBaseType }
             *     
             */
            public AddressBaseType getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressBaseType }
             *     
             */
            public void setAddress(AddressBaseType value) {
                this.address = value;
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
             *       &lt;choice&gt;
             *         &lt;sequence&gt;
             *           &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Surname"/&gt;
             *           &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Forename" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;element name="AmalgamatedName" type="{http://xmlgw.companieshouse.gov.uk}nonEmptyString"/&gt;
             *       &lt;/choice&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "surname",
                "forename",
                "amalgamatedName"
            })
            public static class Name {

                @XmlElement(name = "Surname", namespace = "http://xmlgw.companieshouse.gov.uk")
                protected String surname;
                @XmlElement(name = "Forename", namespace = "http://xmlgw.companieshouse.gov.uk")
                protected List<String> forename;
                @XmlElement(name = "AmalgamatedName", namespace = "http://xmlgw.companieshouse.gov.uk")
                protected String amalgamatedName;

                /**
                 * Gets the value of the surname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSurname() {
                    return surname;
                }

                /**
                 * Sets the value of the surname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSurname(String value) {
                    this.surname = value;
                }

                /**
                 * Gets the value of the forename property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the forename property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getForename().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getForename() {
                    if (forename == null) {
                        forename = new ArrayList<String>();
                    }
                    return this.forename;
                }

                /**
                 * Gets the value of the amalgamatedName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAmalgamatedName() {
                    return amalgamatedName;
                }

                /**
                 * Sets the value of the amalgamatedName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAmalgamatedName(String value) {
                    this.amalgamatedName = value;
                }

            }

        }

    }

}
