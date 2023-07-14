
package com.kan.ukapidemo.dto.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import org.w3c.dom.Element;


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
 *         &lt;element name="EnvelopeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Header"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MessageDetails"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Class"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="32"/&gt;
 *                                   &lt;minLength value="4"/&gt;
 *                                   &lt;pattern value="[A-Za-z0-9_\-]{4,32}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Qualifier"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="request"/&gt;
 *                                   &lt;enumeration value="acknowledgement"/&gt;
 *                                   &lt;enumeration value="response"/&gt;
 *                                   &lt;enumeration value="poll"/&gt;
 *                                   &lt;enumeration value="error"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TransactionID" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="0"/&gt;
 *                                   &lt;maxLength value="32"/&gt;
 *                                   &lt;pattern value="[0-9A-F]{0,32}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AuditID" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="0"/&gt;
 *                                   &lt;maxLength value="32"/&gt;
 *                                   &lt;pattern value="[A-F0-9]{0,32}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CorrelationID" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="0"/&gt;
 *                                   &lt;maxLength value="32"/&gt;
 *                                   &lt;pattern value="[0-9A-F]{0,32}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ResponseEndPoint" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="PollInterval" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GatewayTest" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="GatewayTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SenderDetails"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IDAuthentication" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Authentication" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Method"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value="clear"/&gt;
 *                                                       &lt;enumeration value="CHMD5"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;choice&gt;
 *                                                   &lt;element name="Value"&gt;
 *                                                     &lt;simpleType&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                         &lt;maxLength value="32"/&gt;
 *                                                         &lt;minLength value="0"/&gt;
 *                                                         &lt;pattern value="[0-9a-f]{0,32}"/&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/simpleType&gt;
 *                                                   &lt;/element&gt;
 *                                                   &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *                                                 &lt;/choice&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="X509Certificate" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="EmailAddress" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="129"/&gt;
 *                                   &lt;minLength value="3"/&gt;
 *                                   &lt;pattern value="[A-Za-z0-9\.\-_]{1,64}@[A-Za-z0-9\.\-_]{1,64}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="GovTalkDetails"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Keys"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Key" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GatewayValidation" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Processed"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="no"/&gt;
 *                                   &lt;enumeration value="yes"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Result"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="pass"/&gt;
 *                                   &lt;enumeration value="fail"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GovTalkErrors" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Error" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="RaisedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="Type"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="fatal"/&gt;
 *                                             &lt;enumeration value="recoverable"/&gt;
 *                                             &lt;enumeration value="business"/&gt;
 *                                             &lt;enumeration value="warning"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="Body" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax'/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;anyAttribute/&gt;
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
    "envelopeVersion",
    "header",
    "govTalkDetails",
    "body"
})
@XmlRootElement(name = "GovTalkMessage", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
public class GovTalkMessage {

    @XmlElement(name = "EnvelopeVersion", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
    protected String envelopeVersion;
    @XmlElement(name = "Header", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
    protected GovTalkMessage.Header header;
    @XmlElement(name = "GovTalkDetails", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
    protected GovTalkMessage.GovTalkDetails govTalkDetails;
    @XmlElement(name = "Body", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
    protected GovTalkMessage.Body body;


    /**
     * Gets the value of the envelopeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvelopeVersion() {
        return envelopeVersion;
    }

    /**
     * Sets the value of the envelopeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvelopeVersion(String value) {
        this.envelopeVersion = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link GovTalkMessage.Header }
     *     
     */
    public GovTalkMessage.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovTalkMessage.Header }
     *     
     */
    public void setHeader(GovTalkMessage.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the govTalkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GovTalkMessage.GovTalkDetails }
     *     
     */
    public GovTalkMessage.GovTalkDetails getGovTalkDetails() {
        return govTalkDetails;
    }

    /**
     * Sets the value of the govTalkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovTalkMessage.GovTalkDetails }
     *     
     */
    public void setGovTalkDetails(GovTalkMessage.GovTalkDetails value) {
        this.govTalkDetails = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link GovTalkMessage.Body }
     *     
     */
    public GovTalkMessage.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovTalkMessage.Body }
     *     
     */
    public void setBody(GovTalkMessage.Body value) {
        this.body = value;
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
     *         &lt;any processContents='lax'/&gt;
     *       &lt;/sequence&gt;
     *       &lt;anyAttribute/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
//        "companyDetailsRequest",
        "any"
    })
    public static class Body {

//        @XmlAnyElement(lax = true)
//        protected CompanyDetailsRequest companyDetailsRequest;

        @XmlAnyElement(lax = true)
        protected Object any;

        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

//        public CompanyDetailsRequest getCompanyDetailsRequest() {
//            return companyDetailsRequest;
//        }
//
//        public void setCompanyDetailsRequest(CompanyDetailsRequest companyDetailsRequest) {
//            this.companyDetailsRequest = companyDetailsRequest;
//        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
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
     *         &lt;element name="Keys"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Key" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="GatewayValidation" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Processed"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="no"/&gt;
     *                         &lt;enumeration value="yes"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Result"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="pass"/&gt;
     *                         &lt;enumeration value="fail"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="GovTalkErrors" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Error" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="RaisedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="Type"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="fatal"/&gt;
     *                                   &lt;enumeration value="recoverable"/&gt;
     *                                   &lt;enumeration value="business"/&gt;
     *                                   &lt;enumeration value="warning"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "keys",
        "gatewayValidation",
        "govTalkErrors"
    })
    public static class GovTalkDetails {

        @XmlElement(name = "Keys", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
        protected GovTalkMessage.GovTalkDetails.Keys keys;
        @XmlElement(name = "GatewayValidation", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
        protected GovTalkMessage.GovTalkDetails.GatewayValidation gatewayValidation;
        @XmlElement(name = "GovTalkErrors", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
        protected GovTalkMessage.GovTalkDetails.GovTalkErrors govTalkErrors;

        /**
         * Gets the value of the keys property.
         * 
         * @return
         *     possible object is
         *     {@link GovTalkMessage.GovTalkDetails.Keys }
         *     
         */
        public GovTalkMessage.GovTalkDetails.Keys getKeys() {
            return keys;
        }

        /**
         * Sets the value of the keys property.
         * 
         * @param value
         *     allowed object is
         *     {@link GovTalkMessage.GovTalkDetails.Keys }
         *     
         */
        public void setKeys(GovTalkMessage.GovTalkDetails.Keys value) {
            this.keys = value;
        }

        /**
         * Gets the value of the gatewayValidation property.
         * 
         * @return
         *     possible object is
         *     {@link GovTalkMessage.GovTalkDetails.GatewayValidation }
         *     
         */
        public GovTalkMessage.GovTalkDetails.GatewayValidation getGatewayValidation() {
            return gatewayValidation;
        }

        /**
         * Sets the value of the gatewayValidation property.
         * 
         * @param value
         *     allowed object is
         *     {@link GovTalkMessage.GovTalkDetails.GatewayValidation }
         *     
         */
        public void setGatewayValidation(GovTalkMessage.GovTalkDetails.GatewayValidation value) {
            this.gatewayValidation = value;
        }

        /**
         * Gets the value of the govTalkErrors property.
         * 
         * @return
         *     possible object is
         *     {@link GovTalkMessage.GovTalkDetails.GovTalkErrors }
         *     
         */
        public GovTalkMessage.GovTalkDetails.GovTalkErrors getGovTalkErrors() {
            return govTalkErrors;
        }

        /**
         * Sets the value of the govTalkErrors property.
         * 
         * @param value
         *     allowed object is
         *     {@link GovTalkMessage.GovTalkDetails.GovTalkErrors }
         *     
         */
        public void setGovTalkErrors(GovTalkMessage.GovTalkDetails.GovTalkErrors value) {
            this.govTalkErrors = value;
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
         *         &lt;element name="Processed"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="no"/&gt;
         *               &lt;enumeration value="yes"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Result"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="pass"/&gt;
         *               &lt;enumeration value="fail"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
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
            "processed",
            "result"
        })
        public static class GatewayValidation {

            @XmlElement(name = "Processed", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
            protected String processed;
            @XmlElement(name = "Result", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
            protected String result;

            /**
             * Gets the value of the processed property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcessed() {
                return processed;
            }

            /**
             * Sets the value of the processed property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcessed(String value) {
                this.processed = value;
            }

            /**
             * Gets the value of the result property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResult() {
                return result;
            }

            /**
             * Sets the value of the result property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResult(String value) {
                this.result = value;
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
         *         &lt;element name="Error" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="RaisedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="Type"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="fatal"/&gt;
         *                         &lt;enumeration value="recoverable"/&gt;
         *                         &lt;enumeration value="business"/&gt;
         *                         &lt;enumeration value="warning"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "error"
        })
        public static class GovTalkErrors {

            @XmlElement(name = "Error", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
            protected List<GovTalkMessage.GovTalkDetails.GovTalkErrors.Error> error;

            /**
             * Gets the value of the error property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the error property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getError().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GovTalkMessage.GovTalkDetails.GovTalkErrors.Error }
             * 
             * 
             */
            public List<GovTalkMessage.GovTalkDetails.GovTalkErrors.Error> getError() {
                if (error == null) {
                    error = new ArrayList<GovTalkMessage.GovTalkDetails.GovTalkErrors.Error>();
                }
                return this.error;
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
             *         &lt;element name="RaisedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="Type"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="fatal"/&gt;
             *               &lt;enumeration value="recoverable"/&gt;
             *               &lt;enumeration value="business"/&gt;
             *               &lt;enumeration value="warning"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "raisedBy",
                "number",
                "type",
                "text",
                "location"
            })
            public static class Error {

                @XmlElement(name = "RaisedBy", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
                protected String raisedBy;
                @XmlElement(name = "Number", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
                protected BigInteger number;
                @XmlElement(name = "Type", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
                protected String type;
                @XmlElement(name = "Text", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
                protected List<String> text;
                @XmlElement(name = "Location", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
                protected List<String> location;

                /**
                 * Gets the value of the raisedBy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRaisedBy() {
                    return raisedBy;
                }

                /**
                 * Sets the value of the raisedBy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRaisedBy(String value) {
                    this.raisedBy = value;
                }

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumber(BigInteger value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the text property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the text property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getText().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getText() {
                    if (text == null) {
                        text = new ArrayList<String>();
                    }
                    return this.text;
                }

                /**
                 * Gets the value of the location property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the location property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLocation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getLocation() {
                    if (location == null) {
                        location = new ArrayList<String>();
                    }
                    return this.location;
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
         *         &lt;element name="Key" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
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
            "key"
        })
        public static class Keys {

            @XmlElement(name = "Key", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
            protected List<GovTalkMessage.GovTalkDetails.Keys.Key> key;

            /**
             * Gets the value of the key property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the key property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKey().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GovTalkMessage.GovTalkDetails.Keys.Key }
             * 
             * 
             */
            public List<GovTalkMessage.GovTalkDetails.Keys.Key> getKey() {
                if (key == null) {
                    key = new ArrayList<GovTalkMessage.GovTalkDetails.Keys.Key>();
                }
                return this.key;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Key {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Type", required = true)
                protected String type;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
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
     *         &lt;element name="MessageDetails"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Class"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="32"/&gt;
     *                         &lt;minLength value="4"/&gt;
     *                         &lt;pattern value="[A-Za-z0-9_\-]{4,32}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Qualifier"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="request"/&gt;
     *                         &lt;enumeration value="acknowledgement"/&gt;
     *                         &lt;enumeration value="response"/&gt;
     *                         &lt;enumeration value="poll"/&gt;
     *                         &lt;enumeration value="error"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TransactionID" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="0"/&gt;
     *                         &lt;maxLength value="32"/&gt;
     *                         &lt;pattern value="[0-9A-F]{0,32}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AuditID" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="0"/&gt;
     *                         &lt;maxLength value="32"/&gt;
     *                         &lt;pattern value="[A-F0-9]{0,32}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CorrelationID" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="0"/&gt;
     *                         &lt;maxLength value="32"/&gt;
     *                         &lt;pattern value="[0-9A-F]{0,32}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ResponseEndPoint" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="PollInterval" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="GatewayTest" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="GatewayTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SenderDetails"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IDAuthentication" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Authentication" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Method"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value="clear"/&gt;
     *                                             &lt;enumeration value="CHMD5"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;choice&gt;
     *                                         &lt;element name="Value"&gt;
     *                                           &lt;simpleType&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                               &lt;maxLength value="32"/&gt;
     *                                               &lt;minLength value="0"/&gt;
     *                                               &lt;pattern value="[0-9a-f]{0,32}"/&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/simpleType&gt;
     *                                         &lt;/element&gt;
     *                                         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
     *                                       &lt;/choice&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="X509Certificate" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="EmailAddress" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="129"/&gt;
     *                         &lt;minLength value="3"/&gt;
     *                         &lt;pattern value="[A-Za-z0-9\.\-_]{1,64}@[A-Za-z0-9\.\-_]{1,64}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
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
        "messageDetails",
        "senderDetails"
    })
    public static class Header {

        @XmlElement(name = "MessageDetails", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
        protected GovTalkMessage.Header.MessageDetails messageDetails;
        @XmlElement(name = "SenderDetails", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
        protected GovTalkMessage.Header.SenderDetails senderDetails;

        /**
         * Gets the value of the messageDetails property.
         * 
         * @return
         *     possible object is
         *     {@link GovTalkMessage.Header.MessageDetails }
         *     
         */
        public GovTalkMessage.Header.MessageDetails getMessageDetails() {
            return messageDetails;
        }

        /**
         * Sets the value of the messageDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link GovTalkMessage.Header.MessageDetails }
         *     
         */
        public void setMessageDetails(GovTalkMessage.Header.MessageDetails value) {
            this.messageDetails = value;
        }

        /**
         * Gets the value of the senderDetails property.
         * 
         * @return
         *     possible object is
         *     {@link GovTalkMessage.Header.SenderDetails }
         *     
         */
        public GovTalkMessage.Header.SenderDetails getSenderDetails() {
            return senderDetails;
        }

        /**
         * Sets the value of the senderDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link GovTalkMessage.Header.SenderDetails }
         *     
         */
        public void setSenderDetails(GovTalkMessage.Header.SenderDetails value) {
            this.senderDetails = value;
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
         *         &lt;element name="Class"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="32"/&gt;
         *               &lt;minLength value="4"/&gt;
         *               &lt;pattern value="[A-Za-z0-9_\-]{4,32}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Qualifier"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="request"/&gt;
         *               &lt;enumeration value="acknowledgement"/&gt;
         *               &lt;enumeration value="response"/&gt;
         *               &lt;enumeration value="poll"/&gt;
         *               &lt;enumeration value="error"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TransactionID" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="0"/&gt;
         *               &lt;maxLength value="32"/&gt;
         *               &lt;pattern value="[0-9A-F]{0,32}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AuditID" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="0"/&gt;
         *               &lt;maxLength value="32"/&gt;
         *               &lt;pattern value="[A-F0-9]{0,32}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CorrelationID" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="0"/&gt;
         *               &lt;maxLength value="32"/&gt;
         *               &lt;pattern value="[0-9A-F]{0,32}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ResponseEndPoint" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="PollInterval" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="GatewayTest" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="GatewayTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
            "clazz",
            "qualifier",
            "transactionID",
            "auditID",
            "correlationID",
            "responseEndPoint",
            "gatewayTest",
            "gatewayTimestamp"
        })
        public static class MessageDetails {

            @XmlElement(name = "Class", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
            protected String clazz;
            @XmlElement(name = "Qualifier", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
            protected String qualifier;
            @XmlElement(name = "TransactionID", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
            protected String transactionID;
            @XmlElement(name = "AuditID", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
            protected String auditID;
            @XmlElement(name = "CorrelationID", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
            protected String correlationID;
            @XmlElement(name = "ResponseEndPoint", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
            protected GovTalkMessage.Header.MessageDetails.ResponseEndPoint responseEndPoint;
            @XmlElement(name = "GatewayTest", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
            protected BigInteger gatewayTest;
            @XmlElement(name = "GatewayTimestamp", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar gatewayTimestamp;

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClazz(String value) {
                this.clazz = value;
            }

            /**
             * Gets the value of the qualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQualifier() {
                return qualifier;
            }

            /**
             * Sets the value of the qualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQualifier(String value) {
                this.qualifier = value;
            }

            /**
             * Gets the value of the transactionID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransactionID() {
                return transactionID;
            }

            /**
             * Sets the value of the transactionID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransactionID(String value) {
                this.transactionID = value;
            }

            /**
             * Gets the value of the auditID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuditID() {
                return auditID;
            }

            /**
             * Sets the value of the auditID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuditID(String value) {
                this.auditID = value;
            }

            /**
             * Gets the value of the correlationID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorrelationID() {
                return correlationID;
            }

            /**
             * Sets the value of the correlationID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorrelationID(String value) {
                this.correlationID = value;
            }

            /**
             * Gets the value of the responseEndPoint property.
             * 
             * @return
             *     possible object is
             *     {@link GovTalkMessage.Header.MessageDetails.ResponseEndPoint }
             *     
             */
            public GovTalkMessage.Header.MessageDetails.ResponseEndPoint getResponseEndPoint() {
                return responseEndPoint;
            }

            /**
             * Sets the value of the responseEndPoint property.
             * 
             * @param value
             *     allowed object is
             *     {@link GovTalkMessage.Header.MessageDetails.ResponseEndPoint }
             *     
             */
            public void setResponseEndPoint(GovTalkMessage.Header.MessageDetails.ResponseEndPoint value) {
                this.responseEndPoint = value;
            }

            /**
             * Gets the value of the gatewayTest property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getGatewayTest() {
                return gatewayTest;
            }

            /**
             * Sets the value of the gatewayTest property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setGatewayTest(BigInteger value) {
                this.gatewayTest = value;
            }

            /**
             * Gets the value of the gatewayTimestamp property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getGatewayTimestamp() {
                return gatewayTimestamp;
            }

            /**
             * Sets the value of the gatewayTimestamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setGatewayTimestamp(XMLGregorianCalendar value) {
                this.gatewayTimestamp = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="PollInterval" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ResponseEndPoint {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "PollInterval")
                protected BigInteger pollInterval;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the pollInterval property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPollInterval() {
                    return pollInterval;
                }

                /**
                 * Sets the value of the pollInterval property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPollInterval(BigInteger value) {
                    this.pollInterval = value;
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
         *         &lt;element name="IDAuthentication" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Authentication" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Method"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;enumeration value="clear"/&gt;
         *                                   &lt;enumeration value="CHMD5"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;choice&gt;
         *                               &lt;element name="Value"&gt;
         *                                 &lt;simpleType&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                     &lt;maxLength value="32"/&gt;
         *                                     &lt;minLength value="0"/&gt;
         *                                     &lt;pattern value="[0-9a-f]{0,32}"/&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/simpleType&gt;
         *                               &lt;/element&gt;
         *                               &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
         *                             &lt;/choice&gt;
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
         *         &lt;element name="X509Certificate" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="EmailAddress" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="129"/&gt;
         *               &lt;minLength value="3"/&gt;
         *               &lt;pattern value="[A-Za-z0-9\.\-_]{1,64}@[A-Za-z0-9\.\-_]{1,64}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
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
            "idAuthentication",
            "x509Certificate",
            "emailAddress"
        })
        public static class SenderDetails {

            @XmlElement(name = "IDAuthentication", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
            protected GovTalkMessage.Header.SenderDetails.IDAuthentication idAuthentication;
            @XmlElement(name = "X509Certificate", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
            protected byte[] x509Certificate;
            @XmlElement(name = "EmailAddress", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
            protected String emailAddress;

            /**
             * Gets the value of the idAuthentication property.
             * 
             * @return
             *     possible object is
             *     {@link GovTalkMessage.Header.SenderDetails.IDAuthentication }
             *     
             */
            public GovTalkMessage.Header.SenderDetails.IDAuthentication getIDAuthentication() {
                return idAuthentication;
            }

            /**
             * Sets the value of the idAuthentication property.
             * 
             * @param value
             *     allowed object is
             *     {@link GovTalkMessage.Header.SenderDetails.IDAuthentication }
             *     
             */
            public void setIDAuthentication(GovTalkMessage.Header.SenderDetails.IDAuthentication value) {
                this.idAuthentication = value;
            }

            /**
             * Gets the value of the x509Certificate property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getX509Certificate() {
                return x509Certificate;
            }

            /**
             * Sets the value of the x509Certificate property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setX509Certificate(byte[] value) {
                this.x509Certificate = value;
            }

            /**
             * Gets the value of the emailAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailAddress() {
                return emailAddress;
            }

            /**
             * Sets the value of the emailAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailAddress(String value) {
                this.emailAddress = value;
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
             *         &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Authentication" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Method"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;enumeration value="clear"/&gt;
             *                         &lt;enumeration value="CHMD5"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;choice&gt;
             *                     &lt;element name="Value"&gt;
             *                       &lt;simpleType&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                           &lt;maxLength value="32"/&gt;
             *                           &lt;minLength value="0"/&gt;
             *                           &lt;pattern value="[0-9a-f]{0,32}"/&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/simpleType&gt;
             *                     &lt;/element&gt;
             *                     &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
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
                "senderID",
                "authentication"
            })
            public static class IDAuthentication {

                @XmlElement(name = "SenderID", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
                protected String senderID;
                @XmlElement(name = "Authentication", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
                protected List<GovTalkMessage.Header.SenderDetails.IDAuthentication.Authentication> authentication;

                /**
                 * Gets the value of the senderID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSenderID() {
                    return senderID;
                }

                /**
                 * Sets the value of the senderID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSenderID(String value) {
                    this.senderID = value;
                }

                /**
                 * Gets the value of the authentication property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the authentication property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAuthentication().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GovTalkMessage.Header.SenderDetails.IDAuthentication.Authentication }
                 * 
                 * 
                 */
                public List<GovTalkMessage.Header.SenderDetails.IDAuthentication.Authentication> getAuthentication() {
                    if (authentication == null) {
                        authentication = new ArrayList<GovTalkMessage.Header.SenderDetails.IDAuthentication.Authentication>();
                    }
                    return this.authentication;
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
                 *         &lt;element name="Method"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;enumeration value="clear"/&gt;
                 *               &lt;enumeration value="CHMD5"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;choice&gt;
                 *           &lt;element name="Value"&gt;
                 *             &lt;simpleType&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                 &lt;maxLength value="32"/&gt;
                 *                 &lt;minLength value="0"/&gt;
                 *                 &lt;pattern value="[0-9a-f]{0,32}"/&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/simpleType&gt;
                 *           &lt;/element&gt;
                 *           &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
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
                    "method",
                    "role",
                    "value",
                    "signature"
                })
                public static class Authentication {

                    @XmlElement(name = "Method", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader", required = true)
                    protected String method;
                    @XmlElement(name = "Role", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
                    protected String role;
                    @XmlElement(name = "Value", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
                    protected String value;
                    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
                    protected SignatureType signature;

                    /**
                     * Gets the value of the method property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMethod() {
                        return method;
                    }

                    /**
                     * Sets the value of the method property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMethod(String value) {
                        this.method = value;
                    }

                    /**
                     * Gets the value of the role property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRole() {
                        return role;
                    }

                    /**
                     * Sets the value of the role property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRole(String value) {
                        this.role = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the signature property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SignatureType }
                     *     
                     */
                    public SignatureType getSignature() {
                        return signature;
                    }

                    /**
                     * Sets the value of the signature property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SignatureType }
                     *     
                     */
                    public void setSignature(SignatureType value) {
                        this.signature = value;
                    }

                }

            }

        }

    }

}
