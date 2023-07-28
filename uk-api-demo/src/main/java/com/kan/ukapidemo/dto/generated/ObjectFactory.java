
package com.kan.ukapidemo.dto.generated;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.xml.namespace.QName;
import com.kan.ukapidemo.adapters.LocalDateXmlAdapter;
import com.kan.ukapidemo.adapters.LongXmlAdapter;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kan.ukapidemo.dto.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CompanyName_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CompanyName");
    private final static QName _CompanyNumber_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CompanyNumber");
    private final static QName _PartialCompanyNumber_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PartialCompanyNumber");
    private final static QName _MortgageInd_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "MortgageInd");
    private final static QName _AddressLine_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AddressLine");
    private final static QName _RegAddress_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "RegAddress");
    private final static QName _SICText_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "SICText");
    private final static QName _SICCode_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "SICCode");
    private final static QName _SICCodes_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "SICCodes");
    private final static QName _CompanyStatus_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CompanyStatus");
    private final static QName _DissolutionDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DissolutionDate");
    private final static QName _ClosureDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ClosureDate");
    private final static QName _IncorporationDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "IncorporationDate");
    private final static QName _RegistrationDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "RegistrationDate");
    private final static QName _CONDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CONDate");
    private final static QName _PreviousNames_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PreviousNames");
    private final static QName _NextDueDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NextDueDate");
    private final static QName _Overdue_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Overdue");
    private final static QName _AccountCategory_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AccountCategory");
    private final static QName _AccountRefDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AccountRefDate");
    private final static QName _LastMadeUpDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "LastMadeUpDate");
    private final static QName _DocumentAvailable_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DocumentAvailable");
    private final static QName _LastFullMemDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "LastFullMemDate");
    private final static QName _LastBulkShareDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "LastBulkShareDate");
    private final static QName _CountryOfOrigin_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CountryOfOrigin");
    private final static QName _NumGenPartners_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumGenPartners");
    private final static QName _NumLimPartners_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumLimPartners");
    private final static QName _Weeded_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Weeded");
    private final static QName _HasUKEstablishment_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "HasUKEstablishment");
    private final static QName _WeededDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "WeededDate");
    private final static QName _NumMortCharges_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumMortCharges");
    private final static QName _NumMortOutstanding_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumMortOutstanding");
    private final static QName _NumMortSatisfied_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumMortSatisfied");
    private final static QName _NumMortPartSatisfied_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumMortPartSatisfied");
    private final static QName _HasAppointments_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "HasAppointments");
    private final static QName _InLiquidation_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "InLiquidation");
    private final static QName _GiveMortTotals_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "GiveMortTotals");
    private final static QName _DataSet_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DataSet");
    private final static QName _CompanyDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CompanyDate");
    private final static QName _CompanyIndexStatus_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CompanyIndexStatus");
    private final static QName _SearchMatch_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "SearchMatch");
    private final static QName _SearchRows_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "SearchRows");
    private final static QName _ContinuationKey_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ContinuationKey");
    private final static QName _RegressionKey_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "RegressionKey");
    private final static QName _DocumentCategory_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DocumentCategory");
    private final static QName _FormType_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "FormType");
    private final static QName _DocumentType_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DocumentType");
    private final static QName _DocumentDesc_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DocumentDesc");
    private final static QName _DocumentDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DocumentDate");
    private final static QName _DocBeingScanned_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DocBeingScanned");
    private final static QName _ImageKey_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ImageKey");
    private final static QName _CapitalDocInd_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CapitalDocInd");
    private final static QName _UserReference_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "UserReference");
    private final static QName _AppointmentStatus_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AppointmentStatus");
    private final static QName _AppointmentType_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AppointmentType");
    private final static QName _NumCurrentAppt_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumCurrentAppt");
    private final static QName _NumResignedAppt_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumResignedAppt");
    private final static QName _NumDissolvedAppt_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumDissolvedAppt");
    private final static QName _NumAppointments_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumAppointments");
    private final static QName _Surname_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Surname");
    private final static QName _Forename_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Forename");
    private final static QName _OtherForenames_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "OtherForenames");
    private final static QName _Title_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Title");
    private final static QName _PostTown_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PostTown");
    private final static QName _PoBox_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PoBox");
    private final static QName _County_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "County");
    private final static QName _Country_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Country");
    private final static QName _Postcode_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Postcode");
    private final static QName _PostCode_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PostCode");
    private final static QName _Nationality_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Nationality");
    private final static QName _PersonID_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PersonID");
    private final static QName _DOB_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DOB");
    private final static QName _AppointmentDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AppointmentDate");
    private final static QName _ResignationDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ResignationDate");
    private final static QName _ApptDatePrefix_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ApptDatePrefix");
    private final static QName _ServiceAddressInd_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ServiceAddressInd");
    private final static QName _CoSearchItem_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CoSearchItem");
    private final static QName _StartDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "StartDate");
    private final static QName _EndDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "EndDate");
    private final static QName _SatisfiedChargesInd_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "SatisfiedChargesInd");
    private final static QName _ChargeNumber_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ChargeNumber");
    private final static QName _ChargeCode_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ChargeCode");
    private final static QName _ChargeDescription_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ChargeDescription");
    private final static QName _Description_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Description");
    private final static QName _CreationDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CreationDate");
    private final static QName _AcquisitionDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AcquisitionDate");
    private final static QName _PropertyAcquiredDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PropertyAcquiredDate");
    private final static QName _AlterationToChgInd_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AlterationToChgInd");
    private final static QName _AdditionalPersonsEntitled_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AdditionalPersonsEntitled");
    private final static QName _PersonsEntitled_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PersonsEntitled");
    private final static QName _PersonEntChgName_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PersonEntChgName");
    private final static QName _SatisfiedDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "SatisfiedDate");
    private final static QName _ExistingChargeKey_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ExistingChargeKey");
    private final static QName _ChargeSatisfied_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ChargeSatisfied");
    private final static QName _DetailsOnFicheInd_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DetailsOnFicheInd");
    private final static QName _ReceiverAptdInd_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ReceiverAptdInd");
    private final static QName _InstrumentDescription_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "InstrumentDescription");
    private final static QName _ShortParticulars_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ShortParticulars");
    private final static QName _IncludeResignedInd_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "IncludeResignedInd");
    private final static QName _MadeUpDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "MadeUpDate");
    private final static QName _Media_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Media");
    private final static QName _OfficerType_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "OfficerType");
    private final static QName _NumPages_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumPages");
    private final static QName _NumDisqualOrders_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumDisqualOrders");
    private final static QName _DocRequestKey_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DocRequestKey");
    private final static QName _DocumentName_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DocumentName");
    private final static QName _Occupation_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Occupation");
    private final static QName _NumAppInd_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumAppInd");
    private final static QName _CorporateIndicator_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CorporateIndicator");
    private final static QName _Currency_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Currency");
    private final static QName _NominalCapital_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NominalCapital");
    private final static QName _NumShares_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumShares");
    private final static QName _TotalAmountUnpaid_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "TotalAmountUnpaid");
    private final static QName _TotalNumberOfIssuedShares_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "TotalNumberOfIssuedShares");
    private final static QName _ShareValue_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ShareValue");
    private final static QName _AmountPaidDuePerShare_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AmountPaidDuePerShare");
    private final static QName _AmountUnpaidPerShare_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AmountUnpaidPerShare");
    private final static QName _PersonalAuthentication_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PersonalAuthentication");
    private final static QName _PersonalAuthenticationData_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PersonalAuthenticationData");
    private final static QName _PersonalAuthenitcationItem_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PersonalAuthenitcationItem");
    private final static QName _PersonalAuthenticationCode_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PersonalAuthenticationCode");
    private final static QName _ShareClass_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ShareClass");
    private final static QName _NumSharesIssued_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NumSharesIssued");
    private final static QName _AggregrateNominalValue_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AggregrateNominalValue");
    private final static QName _PrescribedParticulars_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PrescribedParticulars");
    private final static QName _Designation_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Designation");
    private final static QName _Premise_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Premise");
    private final static QName _Street_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Street");
    private final static QName _Thoroughfare_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "Thoroughfare");
    private final static QName _ForeignAddress_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ForeignAddress");
    private final static QName _CorporateName_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CorporateName");
    private final static QName _CareofName_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CareofName");
    private final static QName _SubmissionNumber_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "SubmissionNumber");
    private final static QName _CompanyAuthenticationCode_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CompanyAuthenticationCode");
    private final static QName _IncorporationAppointmentType_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "IncorporationAppointmentType");
    private final static QName _AmountPaidUp_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AmountPaidUp");
    private final static QName _AmountUnpaid_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AmountUnpaid");
    private final static QName _TotalAggregateNominalValue_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "TotalAggregateNominalValue");
    private final static QName _AggregateNominalValue_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "AggregateNominalValue");
    private final static QName _CountryOfResidence_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CountryOfResidence");
    private final static QName _SecureAddressInd_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "SecureAddressInd");
    private final static QName _PlaceRegistered_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "PlaceRegistered");
    private final static QName _CountryStr_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CountryStr");
    private final static QName _RegistrationNumber_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "RegistrationNumber");
    private final static QName _RecordType_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "RecordType");
    private final static QName _CompanyCategory_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CompanyCategory");
    private final static QName _ConsentToAct_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "ConsentToAct");
    private final static QName _DateRegisteredAsMember_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DateRegisteredAsMember");
    private final static QName _DateCeasedToBeMember_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "DateCeasedToBeMember");
    private final static QName _NotificationDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "NotificationDate");
    private final static QName _CessationDate_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "CessationDate");
    private final static QName _LegalPersonName_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "LegalPersonName");
    private final static QName _SuperSecureIndividual_QNAME = new QName("http://xmlgw.companieshouse.gov.uk", "SuperSecureIndividual");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kan.ukapidemo.dto.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompanyIdentification }
     * 
     */
    public CompanyIdentification createCompanyIdentification() {
        return new CompanyIdentification();
    }

    /**
     * Create an instance of {@link CompanyData }
     * 
     */
    public CompanyData createCompanyData() {
        return new CompanyData();
    }

    /**
     * Create an instance of {@link GovTalkMessage }
     * 
     */
    public GovTalkMessage createGovTalkMessage() {
        return new GovTalkMessage();
    }

    /**
     * Create an instance of {@link IDAuthentication }
     * 
     */
    public IDAuthentication createIDAuthentication() {
        return new IDAuthentication();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails }
     * 
     */
    public GovTalkMessage.GovTalkDetails createGovTalkMessageGovTalkDetails() {
        return new GovTalkMessage.GovTalkDetails();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails.GovTalkErrors }
     * 
     */
    public GovTalkMessage.GovTalkDetails.GovTalkErrors createGovTalkMessageGovTalkDetailsGovTalkErrors() {
        return new GovTalkMessage.GovTalkDetails.GovTalkErrors();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails.ChannelRouting }
     * 
     */
    public GovTalkMessage.GovTalkDetails.ChannelRouting createGovTalkMessageGovTalkDetailsChannelRouting() {
        return new GovTalkMessage.GovTalkDetails.ChannelRouting();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails.Keys }
     * 
     */
    public GovTalkMessage.GovTalkDetails.Keys createGovTalkMessageGovTalkDetailsKeys() {
        return new GovTalkMessage.GovTalkDetails.Keys();
    }

    /**
     * Create an instance of {@link GovTalkMessage.Header }
     * 
     */
    public GovTalkMessage.Header createGovTalkMessageHeader() {
        return new GovTalkMessage.Header();
    }

    /**
     * Create an instance of {@link GovTalkMessage.Header.MessageDetails }
     * 
     */
    public GovTalkMessage.Header.MessageDetails createGovTalkMessageHeaderMessageDetails() {
        return new GovTalkMessage.Header.MessageDetails();
    }

    /**
     * Create an instance of {@link CompanyDataMemberType }
     * 
     */
    public CompanyDataMemberType createCompanyDataMemberType() {
        return new CompanyDataMemberType();
    }

    /**
     * Create an instance of {@link CompanyDataMemberType.Person }
     * 
     */
    public CompanyDataMemberType.Person createCompanyDataMemberTypePerson() {
        return new CompanyDataMemberType.Person();
    }

    /**
     * Create an instance of {@link CompanyDataDirectorType }
     * 
     */
    public CompanyDataDirectorType createCompanyDataDirectorType() {
        return new CompanyDataDirectorType();
    }

    /**
     * Create an instance of {@link CompanyDataDirectorType.Person }
     * 
     */
    public CompanyDataDirectorType.Person createCompanyDataDirectorTypePerson() {
        return new CompanyDataDirectorType.Person();
    }

    /**
     * Create an instance of {@link PSCCessationType }
     * 
     */
    public PSCCessationType createPSCCessationType() {
        return new PSCCessationType();
    }

    /**
     * Create an instance of {@link PSCChangeDetailsType }
     * 
     */
    public PSCChangeDetailsType createPSCChangeDetailsType() {
        return new PSCChangeDetailsType();
    }

    /**
     * Create an instance of {@link PSCChangeDetailsType.LegalPerson }
     * 
     */
    public PSCChangeDetailsType.LegalPerson createPSCChangeDetailsTypeLegalPerson() {
        return new PSCChangeDetailsType.LegalPerson();
    }

    /**
     * Create an instance of {@link PSCChangeDetailsType.Corporate }
     * 
     */
    public PSCChangeDetailsType.Corporate createPSCChangeDetailsTypeCorporate() {
        return new PSCChangeDetailsType.Corporate();
    }

    /**
     * Create an instance of {@link PSCChangeDetailsType.Individual }
     * 
     */
    public PSCChangeDetailsType.Individual createPSCChangeDetailsTypeIndividual() {
        return new PSCChangeDetailsType.Individual();
    }

    /**
     * Create an instance of {@link IncorporationPSCNotificationType }
     * 
     */
    public IncorporationPSCNotificationType createIncorporationPSCNotificationType() {
        return new IncorporationPSCNotificationType();
    }

    /**
     * Create an instance of {@link PSCLinkedStatementType }
     * 
     */
    public PSCLinkedStatementType createPSCLinkedStatementType() {
        return new PSCLinkedStatementType();
    }

    /**
     * Create an instance of {@link SharesOrStockHeldType }
     * 
     */
    public SharesOrStockHeldType createSharesOrStockHeldType() {
        return new SharesOrStockHeldType();
    }

    /**
     * Create an instance of {@link MemberType }
     * 
     */
    public MemberType createMemberType() {
        return new MemberType();
    }

    /**
     * Create an instance of {@link IncorporationMemberAppointmentType }
     * 
     */
    public IncorporationMemberAppointmentType createIncorporationMemberAppointmentType() {
        return new IncorporationMemberAppointmentType();
    }

    /**
     * Create an instance of {@link MemberAppointmentType }
     * 
     */
    public MemberAppointmentType createMemberAppointmentType() {
        return new MemberAppointmentType();
    }

    /**
     * Create an instance of {@link SecretaryReturnType }
     * 
     */
    public SecretaryReturnType createSecretaryReturnType() {
        return new SecretaryReturnType();
    }

    /**
     * Create an instance of {@link MemberReturnType }
     * 
     */
    public MemberReturnType createMemberReturnType() {
        return new MemberReturnType();
    }

    /**
     * Create an instance of {@link IncorporationCompanyIdentification }
     * 
     */
    public IncorporationCompanyIdentification createIncorporationCompanyIdentification() {
        return new IncorporationCompanyIdentification();
    }

    /**
     * Create an instance of {@link DirectorIncorporationAppointmentType }
     * 
     */
    public DirectorIncorporationAppointmentType createDirectorIncorporationAppointmentType() {
        return new DirectorIncorporationAppointmentType();
    }

    /**
     * Create an instance of {@link IncorporationDirectorAppointmentType }
     * 
     */
    public IncorporationDirectorAppointmentType createIncorporationDirectorAppointmentType() {
        return new IncorporationDirectorAppointmentType();
    }

    /**
     * Create an instance of {@link IncorporationDirectorAppointmentType.Person }
     * 
     */
    public IncorporationDirectorAppointmentType.Person createIncorporationDirectorAppointmentTypePerson() {
        return new IncorporationDirectorAppointmentType.Person();
    }

    /**
     * Create an instance of {@link DirectorAppointmentType }
     * 
     */
    public DirectorAppointmentType createDirectorAppointmentType() {
        return new DirectorAppointmentType();
    }

    /**
     * Create an instance of {@link DirectorAppointmentType.Person }
     * 
     */
    public DirectorAppointmentType.Person createDirectorAppointmentTypePerson() {
        return new DirectorAppointmentType.Person();
    }

    /**
     * Create an instance of {@link CompanyDataSecretaryType }
     * 
     */
    public CompanyDataSecretaryType createCompanyDataSecretaryType() {
        return new CompanyDataSecretaryType();
    }

    /**
     * Create an instance of {@link IncorporationSecretaryAppointmentType }
     * 
     */
    public IncorporationSecretaryAppointmentType createIncorporationSecretaryAppointmentType() {
        return new IncorporationSecretaryAppointmentType();
    }

    /**
     * Create an instance of {@link SecretaryAppointmentType }
     * 
     */
    public SecretaryAppointmentType createSecretaryAppointmentType() {
        return new SecretaryAppointmentType();
    }

    /**
     * Create an instance of {@link DirectorType }
     * 
     */
    public DirectorType createDirectorType() {
        return new DirectorType();
    }

    /**
     * Create an instance of {@link ShareHolderType }
     * 
     */
    public ShareHolderType createShareHolderType() {
        return new ShareHolderType();
    }

    /**
     * Create an instance of {@link OfficerAppointmentType }
     * 
     */
    public OfficerAppointmentType createOfficerAppointmentType() {
        return new OfficerAppointmentType();
    }

    /**
     * Create an instance of {@link OfficerAppointmentType.Appointee }
     * 
     */
    public OfficerAppointmentType.Appointee createOfficerAppointmentTypeAppointee() {
        return new OfficerAppointmentType.Appointee();
    }

    /**
     * Create an instance of {@link CompanyData.Registers }
     * 
     */
    public CompanyData.Registers createCompanyDataRegisters() {
        return new CompanyData.Registers();
    }

    /**
     * Create an instance of {@link CompanyData.Shareholdings }
     * 
     */
    public CompanyData.Shareholdings createCompanyDataShareholdings() {
        return new CompanyData.Shareholdings();
    }

    /**
     * Create an instance of {@link CompanyData.Shareholdings.Shareholders }
     * 
     */
    public CompanyData.Shareholdings.Shareholders createCompanyDataShareholdingsShareholders() {
        return new CompanyData.Shareholdings.Shareholders();
    }

    /**
     * Create an instance of {@link StatementOfCapitalType }
     * 
     */
    public StatementOfCapitalType createStatementOfCapitalType() {
        return new StatementOfCapitalType();
    }

    /**
     * Create an instance of {@link StatementOfCapitalType.Capital }
     * 
     */
    public StatementOfCapitalType.Capital createStatementOfCapitalTypeCapital() {
        return new StatementOfCapitalType.Capital();
    }

    /**
     * Create an instance of {@link CompanyData.PSCs }
     * 
     */
    public CompanyData.PSCs createCompanyDataPSCs() {
        return new CompanyData.PSCs();
    }

    /**
     * Create an instance of {@link CompanyData.PSCs.PSC }
     * 
     */
    public CompanyData.PSCs.PSC createCompanyDataPSCsPSC() {
        return new CompanyData.PSCs.PSC();
    }

    /**
     * Create an instance of {@link CompanyData.Officers }
     * 
     */
    public CompanyData.Officers createCompanyDataOfficers() {
        return new CompanyData.Officers();
    }

    /**
     * Create an instance of {@link RegAddressType }
     * 
     */
    public RegAddressType createRegAddressType() {
        return new RegAddressType();
    }

    /**
     * Create an instance of {@link SICCodesType }
     * 
     */
    public SICCodesType createSICCodesType() {
        return new SICCodesType();
    }

    /**
     * Create an instance of {@link CoPreviousNamesType }
     * 
     */
    public CoPreviousNamesType createCoPreviousNamesType() {
        return new CoPreviousNamesType();
    }

    /**
     * Create an instance of {@link CoSearchCPLXType }
     * 
     */
    public CoSearchCPLXType createCoSearchCPLXType() {
        return new CoSearchCPLXType();
    }

    /**
     * Create an instance of {@link OfficerSearchItem }
     * 
     */
    public OfficerSearchItem createOfficerSearchItem() {
        return new OfficerSearchItem();
    }

    /**
     * Create an instance of {@link PersonalAttributeType }
     * 
     */
    public PersonalAttributeType createPersonalAttributeType() {
        return new PersonalAttributeType();
    }

    /**
     * Create an instance of {@link CompanyIdentification.UK }
     * 
     */
    public CompanyIdentification.UK createCompanyIdentificationUK() {
        return new CompanyIdentification.UK();
    }

    /**
     * Create an instance of {@link CompanyIdentification.NonUK }
     * 
     */
    public CompanyIdentification.NonUK createCompanyIdentificationNonUK() {
        return new CompanyIdentification.NonUK();
    }

    /**
     * Create an instance of {@link PSCCompanyIdentification }
     * 
     */
    public PSCCompanyIdentification createPSCCompanyIdentification() {
        return new PSCCompanyIdentification();
    }

    /**
     * Create an instance of {@link UKAddressType }
     * 
     */
    public UKAddressType createUKAddressType() {
        return new UKAddressType();
    }

    /**
     * Create an instance of {@link CompanyData.SailRecords }
     * 
     */
    public CompanyData.SailRecords createCompanyDataSailRecords() {
        return new CompanyData.SailRecords();
    }

    /**
     * Create an instance of {@link CompanyDataRequest }
     * 
     */
    public CompanyDataRequest createCompanyDataRequest() {
        return new CompanyDataRequest();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link PersonBaseType }
     * 
     */
    public PersonBaseType createPersonBaseType() {
        return new PersonBaseType();
    }

    /**
     * Create an instance of {@link PersonReturnType }
     * 
     */
    public PersonReturnType createPersonReturnType() {
        return new PersonReturnType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link PreviousNameType }
     * 
     */
    public PreviousNameType createPreviousNameType() {
        return new PreviousNameType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link AddressTypeX }
     * 
     */
    public AddressTypeX createAddressTypeX() {
        return new AddressTypeX();
    }

    /**
     * Create an instance of {@link CompanyAddressType }
     * 
     */
    public CompanyAddressType createCompanyAddressType() {
        return new CompanyAddressType();
    }

    /**
     * Create an instance of {@link ShareholderAddressType }
     * 
     */
    public ShareholderAddressType createShareholderAddressType() {
        return new ShareholderAddressType();
    }

    /**
     * Create an instance of {@link DirectorAddressType }
     * 
     */
    public DirectorAddressType createDirectorAddressType() {
        return new DirectorAddressType();
    }

    /**
     * Create an instance of {@link AnyAddressBaseType }
     * 
     */
    public AnyAddressBaseType createAnyAddressBaseType() {
        return new AnyAddressBaseType();
    }

    /**
     * Create an instance of {@link AddressBaseType }
     * 
     */
    public AddressBaseType createAddressBaseType() {
        return new AddressBaseType();
    }

    /**
     * Create an instance of {@link CompanyIdentifierType }
     * 
     */
    public CompanyIdentifierType createCompanyIdentifierType() {
        return new CompanyIdentifierType();
    }

    /**
     * Create an instance of {@link PersonChangeType }
     * 
     */
    public PersonChangeType createPersonChangeType() {
        return new PersonChangeType();
    }

    /**
     * Create an instance of {@link IssuedShareType }
     * 
     */
    public IssuedShareType createIssuedShareType() {
        return new IssuedShareType();
    }

    /**
     * Create an instance of {@link ShareQuantityValueType }
     * 
     */
    public ShareQuantityValueType createShareQuantityValueType() {
        return new ShareQuantityValueType();
    }

    /**
     * Create an instance of {@link AmalgamatedNameType }
     * 
     */
    public AmalgamatedNameType createAmalgamatedNameType() {
        return new AmalgamatedNameType();
    }

    /**
     * Create an instance of {@link TotalShareCapitalType }
     * 
     */
    public TotalShareCapitalType createTotalShareCapitalType() {
        return new TotalShareCapitalType();
    }

    /**
     * Create an instance of {@link ShareQuantityClassType }
     * 
     */
    public ShareQuantityClassType createShareQuantityClassType() {
        return new ShareQuantityClassType();
    }

    /**
     * Create an instance of {@link CapitalType }
     * 
     */
    public CapitalType createCapitalType() {
        return new CapitalType();
    }

    /**
     * Create an instance of {@link PersCorpAuthType }
     * 
     */
    public PersCorpAuthType createPersCorpAuthType() {
        return new PersCorpAuthType();
    }

    /**
     * Create an instance of {@link SecretaryType }
     * 
     */
    public SecretaryType createSecretaryType() {
        return new SecretaryType();
    }

    /**
     * Create an instance of {@link PersonAddrType }
     * 
     */
    public PersonAddrType createPersonAddrType() {
        return new PersonAddrType();
    }

    /**
     * Create an instance of {@link FooterDetails }
     * 
     */
    public FooterDetails createFooterDetails() {
        return new FooterDetails();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link CorporateOfficerAppointmentType }
     * 
     */
    public CorporateOfficerAppointmentType createCorporateOfficerAppointmentType() {
        return new CorporateOfficerAppointmentType();
    }

    /**
     * Create an instance of {@link IncorporationCorporateOfficerAppointmentType }
     * 
     */
    public IncorporationCorporateOfficerAppointmentType createIncorporationCorporateOfficerAppointmentType() {
        return new IncorporationCorporateOfficerAppointmentType();
    }

    /**
     * Create an instance of {@link CorporateOfficerType }
     * 
     */
    public CorporateOfficerType createCorporateOfficerType() {
        return new CorporateOfficerType();
    }

    /**
     * Create an instance of {@link AllotmentType }
     * 
     */
    public AllotmentType createAllotmentType() {
        return new AllotmentType();
    }

    /**
     * Create an instance of {@link ServiceAddressType }
     * 
     */
    public ServiceAddressType createServiceAddressType() {
        return new ServiceAddressType();
    }

    /**
     * Create an instance of {@link ResidentialAddressType }
     * 
     */
    public ResidentialAddressType createResidentialAddressType() {
        return new ResidentialAddressType();
    }

    /**
     * Create an instance of {@link ShareholderNameType }
     * 
     */
    public ShareholderNameType createShareholderNameType() {
        return new ShareholderNameType();
    }

    /**
     * Create an instance of {@link DirectorPersonType }
     * 
     */
    public DirectorPersonType createDirectorPersonType() {
        return new DirectorPersonType();
    }

    /**
     * Create an instance of {@link DirectorPersonReturnType }
     * 
     */
    public DirectorPersonReturnType createDirectorPersonReturnType() {
        return new DirectorPersonReturnType();
    }

    /**
     * Create an instance of {@link DirectorReturnType }
     * 
     */
    public DirectorReturnType createDirectorReturnType() {
        return new DirectorReturnType();
    }

    /**
     * Create an instance of {@link SubsidiaryAndAssociatedUndertakingsType }
     * 
     */
    public SubsidiaryAndAssociatedUndertakingsType createSubsidiaryAndAssociatedUndertakingsType() {
        return new SubsidiaryAndAssociatedUndertakingsType();
    }

    /**
     * Create an instance of {@link DatePeriod }
     * 
     */
    public DatePeriod createDatePeriod() {
        return new DatePeriod();
    }

    /**
     * Create an instance of {@link PartialDOBType }
     * 
     */
    public PartialDOBType createPartialDOBType() {
        return new PartialDOBType();
    }

    /**
     * Create an instance of {@link CompanyMemberType }
     * 
     */
    public CompanyMemberType createCompanyMemberType() {
        return new CompanyMemberType();
    }

    /**
     * Create an instance of {@link SharesType }
     * 
     */
    public SharesType createSharesType() {
        return new SharesType();
    }

    /**
     * Create an instance of {@link CompanyMemberNameType }
     * 
     */
    public CompanyMemberNameType createCompanyMemberNameType() {
        return new CompanyMemberNameType();
    }

    /**
     * Create an instance of {@link PSCCorporateEntityType }
     * 
     */
    public PSCCorporateEntityType createPSCCorporateEntityType() {
        return new PSCCorporateEntityType();
    }

    /**
     * Create an instance of {@link PSCLegalPersonType }
     * 
     */
    public PSCLegalPersonType createPSCLegalPersonType() {
        return new PSCLegalPersonType();
    }

    /**
     * Create an instance of {@link PSCIndividualType }
     * 
     */
    public PSCIndividualType createPSCIndividualType() {
        return new PSCIndividualType();
    }

    /**
     * Create an instance of {@link PSCIndividualReturnType }
     * 
     */
    public PSCIndividualReturnType createPSCIndividualReturnType() {
        return new PSCIndividualReturnType();
    }

    /**
     * Create an instance of {@link NatureOfControlsType }
     * 
     */
    public NatureOfControlsType createNatureOfControlsType() {
        return new NatureOfControlsType();
    }

    /**
     * Create an instance of {@link LLPNatureOfControlsType }
     * 
     */
    public LLPNatureOfControlsType createLLPNatureOfControlsType() {
        return new LLPNatureOfControlsType();
    }

    /**
     * Create an instance of {@link CorporatePSCIdentificationType }
     * 
     */
    public CorporatePSCIdentificationType createCorporatePSCIdentificationType() {
        return new CorporatePSCIdentificationType();
    }

    /**
     * Create an instance of {@link LegalPersonIdentificationType }
     * 
     */
    public LegalPersonIdentificationType createLegalPersonIdentificationType() {
        return new LegalPersonIdentificationType();
    }

    /**
     * Create an instance of {@link PSCNotificationReturnType }
     * 
     */
    public PSCNotificationReturnType createPSCNotificationReturnType() {
        return new PSCNotificationReturnType();
    }

    /**
     * Create an instance of {@link PSCResidentialAddressType }
     * 
     */
    public PSCResidentialAddressType createPSCResidentialAddressType() {
        return new PSCResidentialAddressType();
    }

    /**
     * Create an instance of {@link PSCCompanyAddressType }
     * 
     */
    public PSCCompanyAddressType createPSCCompanyAddressType() {
        return new PSCCompanyAddressType();
    }

    /**
     * Create an instance of {@link PSCNotificationType }
     * 
     */
    public PSCNotificationType createPSCNotificationType() {
        return new PSCNotificationType();
    }

    /**
     * Create an instance of {@link PSCStatementNotificationType }
     * 
     */
    public PSCStatementNotificationType createPSCStatementNotificationType() {
        return new PSCStatementNotificationType();
    }

    /**
     * Create an instance of {@link PSCStatementWithdrawalType }
     * 
     */
    public PSCStatementWithdrawalType createPSCStatementWithdrawalType() {
        return new PSCStatementWithdrawalType();
    }

    /**
     * Create an instance of {@link PSCIdentificationType }
     * 
     */
    public PSCIdentificationType createPSCIdentificationType() {
        return new PSCIdentificationType();
    }

    /**
     * Create an instance of {@link CompanyDataResidentialAddressType }
     * 
     */
    public CompanyDataResidentialAddressType createCompanyDataResidentialAddressType() {
        return new CompanyDataResidentialAddressType();
    }

    /**
     * Create an instance of {@link GovTalkMessage.Body }
     * 
     */
    public GovTalkMessage.Body createGovTalkMessageBody() {
        return new GovTalkMessage.Body();
    }

    /**
     * Create an instance of {@link IDAuthentication.Authentication }
     * 
     */
    public IDAuthentication.Authentication createIDAuthenticationAuthentication() {
        return new IDAuthentication.Authentication();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails.TargetDetails }
     * 
     */
    public GovTalkMessage.GovTalkDetails.TargetDetails createGovTalkMessageGovTalkDetailsTargetDetails() {
        return new GovTalkMessage.GovTalkDetails.TargetDetails();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails.GatewayValidation }
     * 
     */
    public GovTalkMessage.GovTalkDetails.GatewayValidation createGovTalkMessageGovTalkDetailsGatewayValidation() {
        return new GovTalkMessage.GovTalkDetails.GatewayValidation();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails.GatewayAdditions }
     * 
     */
    public GovTalkMessage.GovTalkDetails.GatewayAdditions createGovTalkMessageGovTalkDetailsGatewayAdditions() {
        return new GovTalkMessage.GovTalkDetails.GatewayAdditions();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails.GovTalkErrors.Error }
     * 
     */
    public GovTalkMessage.GovTalkDetails.GovTalkErrors.Error createGovTalkMessageGovTalkDetailsGovTalkErrorsError() {
        return new GovTalkMessage.GovTalkDetails.GovTalkErrors.Error();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails.ChannelRouting.Channel }
     * 
     */
    public GovTalkMessage.GovTalkDetails.ChannelRouting.Channel createGovTalkMessageGovTalkDetailsChannelRoutingChannel() {
        return new GovTalkMessage.GovTalkDetails.ChannelRouting.Channel();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails.ChannelRouting.ID }
     * 
     */
    public GovTalkMessage.GovTalkDetails.ChannelRouting.ID createGovTalkMessageGovTalkDetailsChannelRoutingID() {
        return new GovTalkMessage.GovTalkDetails.ChannelRouting.ID();
    }

    /**
     * Create an instance of {@link GovTalkMessage.GovTalkDetails.Keys.Key }
     * 
     */
    public GovTalkMessage.GovTalkDetails.Keys.Key createGovTalkMessageGovTalkDetailsKeysKey() {
        return new GovTalkMessage.GovTalkDetails.Keys.Key();
    }

    /**
     * Create an instance of {@link GovTalkMessage.Header.SenderDetails }
     * 
     */
    public GovTalkMessage.Header.SenderDetails createGovTalkMessageHeaderSenderDetails() {
        return new GovTalkMessage.Header.SenderDetails();
    }

    /**
     * Create an instance of {@link GovTalkMessage.Header.MessageDetails.ResponseEndPoint }
     * 
     */
    public GovTalkMessage.Header.MessageDetails.ResponseEndPoint createGovTalkMessageHeaderMessageDetailsResponseEndPoint() {
        return new GovTalkMessage.Header.MessageDetails.ResponseEndPoint();
    }

    /**
     * Create an instance of {@link CompanyDataMemberType.Person.ResidentialAddress }
     * 
     */
    public CompanyDataMemberType.Person.ResidentialAddress createCompanyDataMemberTypePersonResidentialAddress() {
        return new CompanyDataMemberType.Person.ResidentialAddress();
    }

    /**
     * Create an instance of {@link CompanyDataDirectorType.Person.ResidentialAddress }
     * 
     */
    public CompanyDataDirectorType.Person.ResidentialAddress createCompanyDataDirectorTypePersonResidentialAddress() {
        return new CompanyDataDirectorType.Person.ResidentialAddress();
    }

    /**
     * Create an instance of {@link PSCCessationType.Individual }
     * 
     */
    public PSCCessationType.Individual createPSCCessationTypeIndividual() {
        return new PSCCessationType.Individual();
    }

    /**
     * Create an instance of {@link PSCCessationType.Corporate }
     * 
     */
    public PSCCessationType.Corporate createPSCCessationTypeCorporate() {
        return new PSCCessationType.Corporate();
    }

    /**
     * Create an instance of {@link PSCCessationType.LegalPerson }
     * 
     */
    public PSCCessationType.LegalPerson createPSCCessationTypeLegalPerson() {
        return new PSCCessationType.LegalPerson();
    }

    /**
     * Create an instance of {@link PSCChangeDetailsType.LegalPerson.Change }
     * 
     */
    public PSCChangeDetailsType.LegalPerson.Change createPSCChangeDetailsTypeLegalPersonChange() {
        return new PSCChangeDetailsType.LegalPerson.Change();
    }

    /**
     * Create an instance of {@link PSCChangeDetailsType.Corporate.Change }
     * 
     */
    public PSCChangeDetailsType.Corporate.Change createPSCChangeDetailsTypeCorporateChange() {
        return new PSCChangeDetailsType.Corporate.Change();
    }

    /**
     * Create an instance of {@link PSCChangeDetailsType.Individual.Change }
     * 
     */
    public PSCChangeDetailsType.Individual.Change createPSCChangeDetailsTypeIndividualChange() {
        return new PSCChangeDetailsType.Individual.Change();
    }

    /**
     * Create an instance of {@link IncorporationPSCNotificationType.Individual }
     * 
     */
    public IncorporationPSCNotificationType.Individual createIncorporationPSCNotificationTypeIndividual() {
        return new IncorporationPSCNotificationType.Individual();
    }

    /**
     * Create an instance of {@link PSCLinkedStatementType.Corporate }
     * 
     */
    public PSCLinkedStatementType.Corporate createPSCLinkedStatementTypeCorporate() {
        return new PSCLinkedStatementType.Corporate();
    }

    /**
     * Create an instance of {@link PSCLinkedStatementType.LegalPerson }
     * 
     */
    public PSCLinkedStatementType.LegalPerson createPSCLinkedStatementTypeLegalPerson() {
        return new PSCLinkedStatementType.LegalPerson();
    }

    /**
     * Create an instance of {@link SharesOrStockHeldType.SharesHeld }
     * 
     */
    public SharesOrStockHeldType.SharesHeld createSharesOrStockHeldTypeSharesHeld() {
        return new SharesOrStockHeldType.SharesHeld();
    }

    /**
     * Create an instance of {@link SharesOrStockHeldType.StockHeld }
     * 
     */
    public SharesOrStockHeldType.StockHeld createSharesOrStockHeldTypeStockHeld() {
        return new SharesOrStockHeldType.StockHeld();
    }

    /**
     * Create an instance of {@link MemberType.Person }
     * 
     */
    public MemberType.Person createMemberTypePerson() {
        return new MemberType.Person();
    }

    /**
     * Create an instance of {@link IncorporationMemberAppointmentType.Person }
     * 
     */
    public IncorporationMemberAppointmentType.Person createIncorporationMemberAppointmentTypePerson() {
        return new IncorporationMemberAppointmentType.Person();
    }

    /**
     * Create an instance of {@link MemberAppointmentType.Person }
     * 
     */
    public MemberAppointmentType.Person createMemberAppointmentTypePerson() {
        return new MemberAppointmentType.Person();
    }

    /**
     * Create an instance of {@link SecretaryReturnType.Person }
     * 
     */
    public SecretaryReturnType.Person createSecretaryReturnTypePerson() {
        return new SecretaryReturnType.Person();
    }

    /**
     * Create an instance of {@link MemberReturnType.Person }
     * 
     */
    public MemberReturnType.Person createMemberReturnTypePerson() {
        return new MemberReturnType.Person();
    }

    /**
     * Create an instance of {@link IncorporationCompanyIdentification.UK }
     * 
     */
    public IncorporationCompanyIdentification.UK createIncorporationCompanyIdentificationUK() {
        return new IncorporationCompanyIdentification.UK();
    }

    /**
     * Create an instance of {@link IncorporationCompanyIdentification.NonUK }
     * 
     */
    public IncorporationCompanyIdentification.NonUK createIncorporationCompanyIdentificationNonUK() {
        return new IncorporationCompanyIdentification.NonUK();
    }

    /**
     * Create an instance of {@link DirectorIncorporationAppointmentType.Address }
     * 
     */
    public DirectorIncorporationAppointmentType.Address createDirectorIncorporationAppointmentTypeAddress() {
        return new DirectorIncorporationAppointmentType.Address();
    }

    /**
     * Create an instance of {@link DirectorIncorporationAppointmentType.Person }
     * 
     */
    public DirectorIncorporationAppointmentType.Person createDirectorIncorporationAppointmentTypePerson() {
        return new DirectorIncorporationAppointmentType.Person();
    }

    /**
     * Create an instance of {@link DirectorIncorporationAppointmentType.Corporate }
     * 
     */
    public DirectorIncorporationAppointmentType.Corporate createDirectorIncorporationAppointmentTypeCorporate() {
        return new DirectorIncorporationAppointmentType.Corporate();
    }

    /**
     * Create an instance of {@link IncorporationDirectorAppointmentType.Person.ResidentialAddress }
     * 
     */
    public IncorporationDirectorAppointmentType.Person.ResidentialAddress createIncorporationDirectorAppointmentTypePersonResidentialAddress() {
        return new IncorporationDirectorAppointmentType.Person.ResidentialAddress();
    }

    /**
     * Create an instance of {@link DirectorAppointmentType.Person.ResidentialAddress }
     * 
     */
    public DirectorAppointmentType.Person.ResidentialAddress createDirectorAppointmentTypePersonResidentialAddress() {
        return new DirectorAppointmentType.Person.ResidentialAddress();
    }

    /**
     * Create an instance of {@link CompanyDataSecretaryType.Person }
     * 
     */
    public CompanyDataSecretaryType.Person createCompanyDataSecretaryTypePerson() {
        return new CompanyDataSecretaryType.Person();
    }

    /**
     * Create an instance of {@link IncorporationSecretaryAppointmentType.Person }
     * 
     */
    public IncorporationSecretaryAppointmentType.Person createIncorporationSecretaryAppointmentTypePerson() {
        return new IncorporationSecretaryAppointmentType.Person();
    }

    /**
     * Create an instance of {@link SecretaryAppointmentType.Person }
     * 
     */
    public SecretaryAppointmentType.Person createSecretaryAppointmentTypePerson() {
        return new SecretaryAppointmentType.Person();
    }

    /**
     * Create an instance of {@link DirectorType.Person }
     * 
     */
    public DirectorType.Person createDirectorTypePerson() {
        return new DirectorType.Person();
    }

    /**
     * Create an instance of {@link ShareHolderType.Person }
     * 
     */
    public ShareHolderType.Person createShareHolderTypePerson() {
        return new ShareHolderType.Person();
    }

    /**
     * Create an instance of {@link OfficerAppointmentType.Appointee.Individual }
     * 
     */
    public OfficerAppointmentType.Appointee.Individual createOfficerAppointmentTypeAppointeeIndividual() {
        return new OfficerAppointmentType.Appointee.Individual();
    }

    /**
     * Create an instance of {@link CompanyData.Registers.HeldOnPublicRecord }
     * 
     */
    public CompanyData.Registers.HeldOnPublicRecord createCompanyDataRegistersHeldOnPublicRecord() {
        return new CompanyData.Registers.HeldOnPublicRecord();
    }

    /**
     * Create an instance of {@link CompanyData.Shareholdings.Shareholders.Name }
     * 
     */
    public CompanyData.Shareholdings.Shareholders.Name createCompanyDataShareholdingsShareholdersName() {
        return new CompanyData.Shareholdings.Shareholders.Name();
    }

    /**
     * Create an instance of {@link StatementOfCapitalType.Capital.Shares }
     * 
     */
    public StatementOfCapitalType.Capital.Shares createStatementOfCapitalTypeCapitalShares() {
        return new StatementOfCapitalType.Capital.Shares();
    }

    /**
     * Create an instance of {@link CompanyData.PSCs.PSC.PSCNotification }
     * 
     */
    public CompanyData.PSCs.PSC.PSCNotification createCompanyDataPSCsPSCPSCNotification() {
        return new CompanyData.PSCs.PSC.PSCNotification();
    }

    /**
     * Create an instance of {@link CompanyData.Officers.Director }
     * 
     */
    public CompanyData.Officers.Director createCompanyDataOfficersDirector() {
        return new CompanyData.Officers.Director();
    }

    /**
     * Create an instance of {@link CompanyData.Officers.Secretary }
     * 
     */
    public CompanyData.Officers.Secretary createCompanyDataOfficersSecretary() {
        return new CompanyData.Officers.Secretary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CompanyName")
    public JAXBElement<String> createCompanyName(String value) {
        return new JAXBElement<String>(_CompanyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CompanyNumber")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createCompanyNumber(Long value) {
        return new JAXBElement<Long>(_CompanyNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PartialCompanyNumber")
    public JAXBElement<String> createPartialCompanyNumber(String value) {
        return new JAXBElement<String>(_PartialCompanyNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "MortgageInd")
    public JAXBElement<String> createMortgageInd(String value) {
        return new JAXBElement<String>(_MortgageInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AddressLine")
    public JAXBElement<String> createAddressLine(String value) {
        return new JAXBElement<String>(_AddressLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegAddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegAddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "RegAddress")
    public JAXBElement<RegAddressType> createRegAddress(RegAddressType value) {
        return new JAXBElement<RegAddressType>(_RegAddress_QNAME, RegAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "SICText")
    public JAXBElement<String> createSICText(String value) {
        return new JAXBElement<String>(_SICText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "SICCode")
    public JAXBElement<String> createSICCode(String value) {
        return new JAXBElement<String>(_SICCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SICCodesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SICCodesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "SICCodes")
    public JAXBElement<SICCodesType> createSICCodes(SICCodesType value) {
        return new JAXBElement<SICCodesType>(_SICCodes_QNAME, SICCodesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CompanyStatus")
    public JAXBElement<String> createCompanyStatus(String value) {
        return new JAXBElement<String>(_CompanyStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DissolutionDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createDissolutionDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_DissolutionDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ClosureDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createClosureDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_ClosureDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "IncorporationDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createIncorporationDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_IncorporationDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "RegistrationDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createRegistrationDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_RegistrationDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CONDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createCONDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_CONDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoPreviousNamesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CoPreviousNamesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PreviousNames")
    public JAXBElement<CoPreviousNamesType> createPreviousNames(CoPreviousNamesType value) {
        return new JAXBElement<CoPreviousNamesType>(_PreviousNames_QNAME, CoPreviousNamesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NextDueDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createNextDueDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_NextDueDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Overdue")
    public JAXBElement<String> createOverdue(String value) {
        return new JAXBElement<String>(_Overdue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AccountCategory")
    public JAXBElement<String> createAccountCategory(String value) {
        return new JAXBElement<String>(_AccountCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AccountRefDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createAccountRefDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_AccountRefDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "LastMadeUpDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createLastMadeUpDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_LastMadeUpDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DocumentAvailable")
    public JAXBElement<Boolean> createDocumentAvailable(Boolean value) {
        return new JAXBElement<Boolean>(_DocumentAvailable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "LastFullMemDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createLastFullMemDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_LastFullMemDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "LastBulkShareDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createLastBulkShareDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_LastBulkShareDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CountryOfOrigin")
    public JAXBElement<String> createCountryOfOrigin(String value) {
        return new JAXBElement<String>(_CountryOfOrigin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumGenPartners")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumGenPartners(Long value) {
        return new JAXBElement<Long>(_NumGenPartners_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumLimPartners")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumLimPartners(Long value) {
        return new JAXBElement<Long>(_NumLimPartners_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Weeded")
    public JAXBElement<Boolean> createWeeded(Boolean value) {
        return new JAXBElement<Boolean>(_Weeded_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "HasUKEstablishment")
    public JAXBElement<Boolean> createHasUKEstablishment(Boolean value) {
        return new JAXBElement<Boolean>(_HasUKEstablishment_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "WeededDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createWeededDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_WeededDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumMortCharges")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumMortCharges(Long value) {
        return new JAXBElement<Long>(_NumMortCharges_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumMortOutstanding")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumMortOutstanding(Long value) {
        return new JAXBElement<Long>(_NumMortOutstanding_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumMortSatisfied")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumMortSatisfied(Long value) {
        return new JAXBElement<Long>(_NumMortSatisfied_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumMortPartSatisfied")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumMortPartSatisfied(Long value) {
        return new JAXBElement<Long>(_NumMortPartSatisfied_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "HasAppointments")
    public JAXBElement<Boolean> createHasAppointments(Boolean value) {
        return new JAXBElement<Boolean>(_HasAppointments_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "InLiquidation")
    public JAXBElement<Boolean> createInLiquidation(Boolean value) {
        return new JAXBElement<Boolean>(_InLiquidation_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "GiveMortTotals")
    public JAXBElement<Boolean> createGiveMortTotals(Boolean value) {
        return new JAXBElement<Boolean>(_GiveMortTotals_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DataSet")
    public JAXBElement<String> createDataSet(String value) {
        return new JAXBElement<String>(_DataSet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CompanyDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createCompanyDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_CompanyDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CompanyIndexStatus")
    public JAXBElement<String> createCompanyIndexStatus(String value) {
        return new JAXBElement<String>(_CompanyIndexStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "SearchMatch")
    public JAXBElement<String> createSearchMatch(String value) {
        return new JAXBElement<String>(_SearchMatch_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "SearchRows")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createSearchRows(Long value) {
        return new JAXBElement<Long>(_SearchRows_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ContinuationKey")
    public JAXBElement<String> createContinuationKey(String value) {
        return new JAXBElement<String>(_ContinuationKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "RegressionKey")
    public JAXBElement<String> createRegressionKey(String value) {
        return new JAXBElement<String>(_RegressionKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DocumentCategory")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createDocumentCategory(Long value) {
        return new JAXBElement<Long>(_DocumentCategory_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "FormType")
    public JAXBElement<String> createFormType(String value) {
        return new JAXBElement<String>(_FormType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DocumentType")
    public JAXBElement<String> createDocumentType(String value) {
        return new JAXBElement<String>(_DocumentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DocumentDesc")
    public JAXBElement<String> createDocumentDesc(String value) {
        return new JAXBElement<String>(_DocumentDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DocumentDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createDocumentDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_DocumentDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DocBeingScanned")
    public JAXBElement<Boolean> createDocBeingScanned(Boolean value) {
        return new JAXBElement<Boolean>(_DocBeingScanned_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ImageKey")
    public JAXBElement<String> createImageKey(String value) {
        return new JAXBElement<String>(_ImageKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CapitalDocInd")
    public JAXBElement<Boolean> createCapitalDocInd(Boolean value) {
        return new JAXBElement<Boolean>(_CapitalDocInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "UserReference")
    public JAXBElement<String> createUserReference(String value) {
        return new JAXBElement<String>(_UserReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AppointmentStatus")
    public JAXBElement<String> createAppointmentStatus(String value) {
        return new JAXBElement<String>(_AppointmentStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AppointmentType")
    public JAXBElement<String> createAppointmentType(String value) {
        return new JAXBElement<String>(_AppointmentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumCurrentAppt")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumCurrentAppt(Long value) {
        return new JAXBElement<Long>(_NumCurrentAppt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumResignedAppt")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumResignedAppt(Long value) {
        return new JAXBElement<Long>(_NumResignedAppt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumDissolvedAppt")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumDissolvedAppt(Long value) {
        return new JAXBElement<Long>(_NumDissolvedAppt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumAppointments")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumAppointments(Long value) {
        return new JAXBElement<Long>(_NumAppointments_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Surname")
    public JAXBElement<String> createSurname(String value) {
        return new JAXBElement<String>(_Surname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Forename")
    public JAXBElement<String> createForename(String value) {
        return new JAXBElement<String>(_Forename_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "OtherForenames")
    public JAXBElement<String> createOtherForenames(String value) {
        return new JAXBElement<String>(_OtherForenames_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PostTown")
    public JAXBElement<String> createPostTown(String value) {
        return new JAXBElement<String>(_PostTown_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PoBox")
    public JAXBElement<String> createPoBox(String value) {
        return new JAXBElement<String>(_PoBox_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "County")
    public JAXBElement<String> createCounty(String value) {
        return new JAXBElement<String>(_County_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Postcode")
    public JAXBElement<String> createPostcode(String value) {
        return new JAXBElement<String>(_Postcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PostCode")
    public JAXBElement<String> createPostCode(String value) {
        return new JAXBElement<String>(_PostCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Nationality")
    public JAXBElement<String> createNationality(String value) {
        return new JAXBElement<String>(_Nationality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PersonID")
    public JAXBElement<String> createPersonID(String value) {
        return new JAXBElement<String>(_PersonID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DOB")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createDOB(LocalDate value) {
        return new JAXBElement<LocalDate>(_DOB_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AppointmentDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createAppointmentDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_AppointmentDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ResignationDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createResignationDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_ResignationDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ApptDatePrefix")
    public JAXBElement<String> createApptDatePrefix(String value) {
        return new JAXBElement<String>(_ApptDatePrefix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ServiceAddressInd")
    public JAXBElement<Boolean> createServiceAddressInd(Boolean value) {
        return new JAXBElement<Boolean>(_ServiceAddressInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoSearchCPLXType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CoSearchCPLXType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CoSearchItem")
    public JAXBElement<CoSearchCPLXType> createCoSearchItem(CoSearchCPLXType value) {
        return new JAXBElement<CoSearchCPLXType>(_CoSearchItem_QNAME, CoSearchCPLXType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "StartDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createStartDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_StartDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "EndDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createEndDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_EndDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "SatisfiedChargesInd")
    public JAXBElement<Boolean> createSatisfiedChargesInd(Boolean value) {
        return new JAXBElement<Boolean>(_SatisfiedChargesInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ChargeNumber")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createChargeNumber(Long value) {
        return new JAXBElement<Long>(_ChargeNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ChargeCode")
    public JAXBElement<String> createChargeCode(String value) {
        return new JAXBElement<String>(_ChargeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ChargeDescription")
    public JAXBElement<String> createChargeDescription(String value) {
        return new JAXBElement<String>(_ChargeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CreationDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createCreationDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_CreationDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AcquisitionDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createAcquisitionDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_AcquisitionDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PropertyAcquiredDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createPropertyAcquiredDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_PropertyAcquiredDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AlterationToChgInd")
    public JAXBElement<Boolean> createAlterationToChgInd(Boolean value) {
        return new JAXBElement<Boolean>(_AlterationToChgInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AdditionalPersonsEntitled")
    public JAXBElement<String> createAdditionalPersonsEntitled(String value) {
        return new JAXBElement<String>(_AdditionalPersonsEntitled_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PersonsEntitled")
    public JAXBElement<String> createPersonsEntitled(String value) {
        return new JAXBElement<String>(_PersonsEntitled_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PersonEntChgName")
    public JAXBElement<String> createPersonEntChgName(String value) {
        return new JAXBElement<String>(_PersonEntChgName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "SatisfiedDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createSatisfiedDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_SatisfiedDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ExistingChargeKey")
    public JAXBElement<Object> createExistingChargeKey(Object value) {
        return new JAXBElement<Object>(_ExistingChargeKey_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ChargeSatisfied")
    public JAXBElement<String> createChargeSatisfied(String value) {
        return new JAXBElement<String>(_ChargeSatisfied_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DetailsOnFicheInd")
    public JAXBElement<Boolean> createDetailsOnFicheInd(Boolean value) {
        return new JAXBElement<Boolean>(_DetailsOnFicheInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ReceiverAptdInd")
    public JAXBElement<Boolean> createReceiverAptdInd(Boolean value) {
        return new JAXBElement<Boolean>(_ReceiverAptdInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "InstrumentDescription")
    public JAXBElement<String> createInstrumentDescription(String value) {
        return new JAXBElement<String>(_InstrumentDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ShortParticulars")
    public JAXBElement<String> createShortParticulars(String value) {
        return new JAXBElement<String>(_ShortParticulars_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "IncludeResignedInd")
    public JAXBElement<Boolean> createIncludeResignedInd(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeResignedInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "MadeUpDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createMadeUpDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_MadeUpDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Media")
    public JAXBElement<String> createMedia(String value) {
        return new JAXBElement<String>(_Media_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "OfficerType")
    public JAXBElement<String> createOfficerType(String value) {
        return new JAXBElement<String>(_OfficerType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumPages")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumPages(Long value) {
        return new JAXBElement<Long>(_NumPages_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumDisqualOrders")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumDisqualOrders(Long value) {
        return new JAXBElement<Long>(_NumDisqualOrders_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DocRequestKey")
    public JAXBElement<String> createDocRequestKey(String value) {
        return new JAXBElement<String>(_DocRequestKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DocumentName")
    public JAXBElement<String> createDocumentName(String value) {
        return new JAXBElement<String>(_DocumentName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Occupation")
    public JAXBElement<String> createOccupation(String value) {
        return new JAXBElement<String>(_Occupation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumAppInd")
    public JAXBElement<String> createNumAppInd(String value) {
        return new JAXBElement<String>(_NumAppInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CorporateIndicator")
    public JAXBElement<Boolean> createCorporateIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CorporateIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Currency")
    public JAXBElement<String> createCurrency(String value) {
        return new JAXBElement<String>(_Currency_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NominalCapital")
    public JAXBElement<BigDecimal> createNominalCapital(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NominalCapital_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumShares")
    public JAXBElement<BigDecimal> createNumShares(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NumShares_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "TotalAmountUnpaid")
    public JAXBElement<BigDecimal> createTotalAmountUnpaid(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TotalAmountUnpaid_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "TotalNumberOfIssuedShares")
    public JAXBElement<BigDecimal> createTotalNumberOfIssuedShares(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TotalNumberOfIssuedShares_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ShareValue")
    public JAXBElement<BigDecimal> createShareValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ShareValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AmountPaidDuePerShare")
    public JAXBElement<BigDecimal> createAmountPaidDuePerShare(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AmountPaidDuePerShare_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AmountUnpaidPerShare")
    public JAXBElement<BigDecimal> createAmountUnpaidPerShare(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AmountUnpaidPerShare_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonalAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PersonalAuthentication")
    public JAXBElement<PersonalAttributeType> createPersonalAuthentication(PersonalAttributeType value) {
        return new JAXBElement<PersonalAttributeType>(_PersonalAuthentication_QNAME, PersonalAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PersonalAuthenticationData")
    public JAXBElement<String> createPersonalAuthenticationData(String value) {
        return new JAXBElement<String>(_PersonalAuthenticationData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PersonalAuthenitcationItem")
    public JAXBElement<String> createPersonalAuthenitcationItem(String value) {
        return new JAXBElement<String>(_PersonalAuthenitcationItem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PersonalAuthenticationCode")
    public JAXBElement<String> createPersonalAuthenticationCode(String value) {
        return new JAXBElement<String>(_PersonalAuthenticationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ShareClass")
    public JAXBElement<String> createShareClass(String value) {
        return new JAXBElement<String>(_ShareClass_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NumSharesIssued")
    @XmlJavaTypeAdapter(LongXmlAdapter.class)
    public JAXBElement<Long> createNumSharesIssued(Long value) {
        return new JAXBElement<Long>(_NumSharesIssued_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AggregrateNominalValue")
    public JAXBElement<BigDecimal> createAggregrateNominalValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AggregrateNominalValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PrescribedParticulars")
    public JAXBElement<String> createPrescribedParticulars(String value) {
        return new JAXBElement<String>(_PrescribedParticulars_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Designation")
    public JAXBElement<String> createDesignation(String value) {
        return new JAXBElement<String>(_Designation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Premise")
    public JAXBElement<String> createPremise(String value) {
        return new JAXBElement<String>(_Premise_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Street")
    public JAXBElement<String> createStreet(String value) {
        return new JAXBElement<String>(_Street_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "Thoroughfare")
    public JAXBElement<String> createThoroughfare(String value) {
        return new JAXBElement<String>(_Thoroughfare_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ForeignAddress")
    public JAXBElement<Boolean> createForeignAddress(Boolean value) {
        return new JAXBElement<Boolean>(_ForeignAddress_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CorporateName")
    public JAXBElement<String> createCorporateName(String value) {
        return new JAXBElement<String>(_CorporateName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CareofName")
    public JAXBElement<String> createCareofName(String value) {
        return new JAXBElement<String>(_CareofName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "SubmissionNumber")
    public JAXBElement<String> createSubmissionNumber(String value) {
        return new JAXBElement<String>(_SubmissionNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CompanyAuthenticationCode")
    public JAXBElement<String> createCompanyAuthenticationCode(String value) {
        return new JAXBElement<String>(_CompanyAuthenticationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "IncorporationAppointmentType")
    public JAXBElement<String> createIncorporationAppointmentType(String value) {
        return new JAXBElement<String>(_IncorporationAppointmentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AmountPaidUp")
    public JAXBElement<BigDecimal> createAmountPaidUp(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AmountPaidUp_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AmountUnpaid")
    public JAXBElement<BigDecimal> createAmountUnpaid(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AmountUnpaid_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "TotalAggregateNominalValue")
    public JAXBElement<BigDecimal> createTotalAggregateNominalValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TotalAggregateNominalValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "AggregateNominalValue")
    public JAXBElement<BigDecimal> createAggregateNominalValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AggregateNominalValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CountryOfResidence")
    public JAXBElement<String> createCountryOfResidence(String value) {
        return new JAXBElement<String>(_CountryOfResidence_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "SecureAddressInd")
    public JAXBElement<Boolean> createSecureAddressInd(Boolean value) {
        return new JAXBElement<Boolean>(_SecureAddressInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "PlaceRegistered")
    public JAXBElement<String> createPlaceRegistered(String value) {
        return new JAXBElement<String>(_PlaceRegistered_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CountryStr")
    public JAXBElement<String> createCountryStr(String value) {
        return new JAXBElement<String>(_CountryStr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "RegistrationNumber")
    public JAXBElement<String> createRegistrationNumber(String value) {
        return new JAXBElement<String>(_RegistrationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "RecordType")
    public JAXBElement<String> createRecordType(String value) {
        return new JAXBElement<String>(_RecordType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CompanyCategory")
    public JAXBElement<String> createCompanyCategory(String value) {
        return new JAXBElement<String>(_CompanyCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "ConsentToAct")
    public JAXBElement<Boolean> createConsentToAct(Boolean value) {
        return new JAXBElement<Boolean>(_ConsentToAct_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DateRegisteredAsMember")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createDateRegisteredAsMember(LocalDate value) {
        return new JAXBElement<LocalDate>(_DateRegisteredAsMember_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "DateCeasedToBeMember")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createDateCeasedToBeMember(LocalDate value) {
        return new JAXBElement<LocalDate>(_DateCeasedToBeMember_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "NotificationDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createNotificationDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_NotificationDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "CessationDate")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    public JAXBElement<LocalDate> createCessationDate(LocalDate value) {
        return new JAXBElement<LocalDate>(_CessationDate_QNAME, LocalDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "LegalPersonName")
    public JAXBElement<String> createLegalPersonName(String value) {
        return new JAXBElement<String>(_LegalPersonName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlgw.companieshouse.gov.uk", name = "SuperSecureIndividual")
    public JAXBElement<String> createSuperSecureIndividual(String value) {
        return new JAXBElement<String>(_SuperSecureIndividual_QNAME, String.class, null, value);
    }

}
