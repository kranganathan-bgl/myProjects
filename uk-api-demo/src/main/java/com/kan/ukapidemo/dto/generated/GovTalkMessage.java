
package com.kan.ukapidemo.dto.generated;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import com.kan.ukapidemo.adapters.LocalDateTimeXmlAdapter;
import com.kan.ukapidemo.adapters.LongXmlAdapter;
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
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *                                 &lt;restriction base="{http://www.govtalk.gov.uk/CM/envelope}UnicodeNameString"&gt;
 *                                   &lt;maxLength value="32"/&gt;
 *                                   &lt;minLength value="4"/&gt;
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
 *                             &lt;element name="Function" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="list"/&gt;
 *                                   &lt;enumeration value="read"/&gt;
 *                                   &lt;enumeration value="delete"/&gt;
 *                                   &lt;enumeration value="add"/&gt;
 *                                   &lt;enumeration value="submit"/&gt;
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
 *                                     &lt;attribute name="PollInterval" type="{http://www.w3.org/2001/XMLSchema}integer" default="2" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Transformation" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="XML"/&gt;
 *                                   &lt;enumeration value="HTML"/&gt;
 *                                   &lt;enumeration value="text"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GatewayTest" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="GatewayTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SenderDetails" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.govtalk.gov.uk/CM/envelope}IDAuthentication" minOccurs="0"/&gt;
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
 *                   &lt;element name="Keys" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Key" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.govtalk.gov.uk/CM/envelope&gt;UnicodeNameString"&gt;
 *                                     &lt;attribute name="Type" use="required" type="{http://www.govtalk.gov.uk/CM/envelope}UnicodeNameString" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TargetDetails" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Organisation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="64"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
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
 *                   &lt;element name="ChannelRouting" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Channel"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;choice&gt;
 *                                         &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                                         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/choice&gt;
 *                                       &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ID" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
 *                   &lt;element name="GatewayAdditions" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;any namespace=''/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;anyAttribute namespace=''/&gt;
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
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlRootElement(name = "GovTalkMessage", namespace = "http://www.govtalk.gov.uk/CM/envelope")
public class GovTalkMessage {

    @XmlElement(name = "EnvelopeVersion", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
    protected String envelopeVersion;
    @XmlElement(name = "Header", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
    protected GovTalkMessage.Header header;
    @XmlElement(name = "GovTalkDetails", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
    protected GovTalkMessage.GovTalkDetails govTalkDetails;
    @XmlElement(name = "Body", namespace = "http://www.govtalk.gov.uk/CM/envelope")
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
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "any"
    })
    public static class Body {

        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
     *         &lt;element name="Keys" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Key" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.govtalk.gov.uk/CM/envelope&gt;UnicodeNameString"&gt;
     *                           &lt;attribute name="Type" use="required" type="{http://www.govtalk.gov.uk/CM/envelope}UnicodeNameString" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TargetDetails" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Organisation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="64"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
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
     *         &lt;element name="ChannelRouting" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Channel"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;choice&gt;
     *                               &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *                               &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/choice&gt;
     *                             &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ID" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
     *         &lt;element name="GatewayAdditions" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;any namespace=''/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;anyAttribute namespace=''/&gt;
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
        "targetDetails",
        "gatewayValidation",
        "channelRouting",
        "govTalkErrors",
        "gatewayAdditions"
    })
    public static class GovTalkDetails {

        @XmlElement(name = "Keys", namespace = "http://www.govtalk.gov.uk/CM/envelope")
        protected GovTalkMessage.GovTalkDetails.Keys keys;
        @XmlElement(name = "TargetDetails", namespace = "http://www.govtalk.gov.uk/CM/envelope")
        protected GovTalkMessage.GovTalkDetails.TargetDetails targetDetails;
        @XmlElement(name = "GatewayValidation", namespace = "http://www.govtalk.gov.uk/CM/envelope")
        protected GovTalkMessage.GovTalkDetails.GatewayValidation gatewayValidation;
        @XmlElement(name = "ChannelRouting", namespace = "http://www.govtalk.gov.uk/CM/envelope")
        protected List<GovTalkMessage.GovTalkDetails.ChannelRouting> channelRouting;
        @XmlElement(name = "GovTalkErrors", namespace = "http://www.govtalk.gov.uk/CM/envelope")
        protected GovTalkMessage.GovTalkDetails.GovTalkErrors govTalkErrors;
        @XmlElement(name = "GatewayAdditions", namespace = "http://www.govtalk.gov.uk/CM/envelope")
        protected GovTalkMessage.GovTalkDetails.GatewayAdditions gatewayAdditions;

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
         * Gets the value of the targetDetails property.
         * 
         * @return
         *     possible object is
         *     {@link GovTalkMessage.GovTalkDetails.TargetDetails }
         *     
         */
        public GovTalkMessage.GovTalkDetails.TargetDetails getTargetDetails() {
            return targetDetails;
        }

        /**
         * Sets the value of the targetDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link GovTalkMessage.GovTalkDetails.TargetDetails }
         *     
         */
        public void setTargetDetails(GovTalkMessage.GovTalkDetails.TargetDetails value) {
            this.targetDetails = value;
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
         * Gets the value of the channelRouting property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the channelRouting property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChannelRouting().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GovTalkMessage.GovTalkDetails.ChannelRouting }
         * 
         * 
         */
        public List<GovTalkMessage.GovTalkDetails.ChannelRouting> getChannelRouting() {
            if (channelRouting == null) {
                channelRouting = new ArrayList<GovTalkMessage.GovTalkDetails.ChannelRouting>();
            }
            return this.channelRouting;
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
         * Gets the value of the gatewayAdditions property.
         * 
         * @return
         *     possible object is
         *     {@link GovTalkMessage.GovTalkDetails.GatewayAdditions }
         *     
         */
        public GovTalkMessage.GovTalkDetails.GatewayAdditions getGatewayAdditions() {
            return gatewayAdditions;
        }

        /**
         * Sets the value of the gatewayAdditions property.
         * 
         * @param value
         *     allowed object is
         *     {@link GovTalkMessage.GovTalkDetails.GatewayAdditions }
         *     
         */
        public void setGatewayAdditions(GovTalkMessage.GovTalkDetails.GatewayAdditions value) {
            this.gatewayAdditions = value;
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
         *         &lt;element name="Channel"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;choice&gt;
         *                     &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
         *                     &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/choice&gt;
         *                   &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ID" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
            "channel",
            "id",
            "timestamp"
        })
        public static class ChannelRouting {

            @XmlElement(name = "Channel", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
            protected GovTalkMessage.GovTalkDetails.ChannelRouting.Channel channel;
            @XmlElement(name = "ID", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected List<GovTalkMessage.GovTalkDetails.ChannelRouting.ID> id;
            @XmlElement(name = "Timestamp", namespace = "http://www.govtalk.gov.uk/CM/envelope", type = String.class)
            @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
            @XmlSchemaType(name = "dateTime")
            protected LocalDateTime timestamp;

            /**
             * Gets the value of the channel property.
             * 
             * @return
             *     possible object is
             *     {@link GovTalkMessage.GovTalkDetails.ChannelRouting.Channel }
             *     
             */
            public GovTalkMessage.GovTalkDetails.ChannelRouting.Channel getChannel() {
                return channel;
            }

            /**
             * Sets the value of the channel property.
             * 
             * @param value
             *     allowed object is
             *     {@link GovTalkMessage.GovTalkDetails.ChannelRouting.Channel }
             *     
             */
            public void setChannel(GovTalkMessage.GovTalkDetails.ChannelRouting.Channel value) {
                this.channel = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the id property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GovTalkMessage.GovTalkDetails.ChannelRouting.ID }
             * 
             * 
             */
            public List<GovTalkMessage.GovTalkDetails.ChannelRouting.ID> getID() {
                if (id == null) {
                    id = new ArrayList<GovTalkMessage.GovTalkDetails.ChannelRouting.ID>();
                }
                return this.id;
            }

            /**
             * Gets the value of the timestamp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public LocalDateTime getTimestamp() {
                return timestamp;
            }

            /**
             * Sets the value of the timestamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTimestamp(LocalDateTime value) {
                this.timestamp = value;
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
             *         &lt;choice&gt;
             *           &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
             *           &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/choice&gt;
             *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "uri",
                "name",
                "product",
                "version"
            })
            public static class Channel {

                @XmlElement(name = "URI", namespace = "http://www.govtalk.gov.uk/CM/envelope")
                @XmlSchemaType(name = "anyURI")
                protected String uri;
                @XmlElement(name = "Name", namespace = "http://www.govtalk.gov.uk/CM/envelope")
                protected String name;
                @XmlElement(name = "Product", namespace = "http://www.govtalk.gov.uk/CM/envelope")
                protected String product;
                @XmlElement(name = "Version", namespace = "http://www.govtalk.gov.uk/CM/envelope")
                protected String version;

                /**
                 * Gets the value of the uri property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getURI() {
                    return uri;
                }

                /**
                 * Sets the value of the uri property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setURI(String value) {
                    this.uri = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the product property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProduct() {
                    return product;
                }

                /**
                 * Sets the value of the product property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProduct(String value) {
                    this.product = value;
                }

                /**
                 * Gets the value of the version property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVersion() {
                    return version;
                }

                /**
                 * Sets the value of the version property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVersion(String value) {
                    this.version = value;
                }

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
            public static class ID {

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
         *         &lt;any namespace=''/&gt;
         *       &lt;/sequence&gt;
         *       &lt;anyAttribute namespace=''/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class GatewayAdditions {

            @XmlAnyElement(lax = true)
            protected Object any;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the any property.
             * 
             * @return
             *     possible object is
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

            @XmlElement(name = "Processed", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
            protected String processed;
            @XmlElement(name = "Result", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
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

            @XmlElement(name = "Error", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
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

                @XmlElement(name = "RaisedBy", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
                protected String raisedBy;
                @XmlElement(name = "Number", namespace = "http://www.govtalk.gov.uk/CM/envelope", type = String.class)
                @XmlJavaTypeAdapter(LongXmlAdapter.class)
                @XmlSchemaType(name = "integer")
                protected Long number;
                @XmlElement(name = "Type", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
                protected String type;
                @XmlElement(name = "Text", namespace = "http://www.govtalk.gov.uk/CM/envelope")
                protected List<String> text;
                @XmlElement(name = "Location", namespace = "http://www.govtalk.gov.uk/CM/envelope")
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
                 *     {@link String }
                 *     
                 */
                public Long getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumber(Long value) {
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
         *               &lt;extension base="&lt;http://www.govtalk.gov.uk/CM/envelope&gt;UnicodeNameString"&gt;
         *                 &lt;attribute name="Type" use="required" type="{http://www.govtalk.gov.uk/CM/envelope}UnicodeNameString" /&gt;
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

            @XmlElement(name = "Key", namespace = "http://www.govtalk.gov.uk/CM/envelope")
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
             *     &lt;extension base="&lt;http://www.govtalk.gov.uk/CM/envelope&gt;UnicodeNameString"&gt;
             *       &lt;attribute name="Type" use="required" type="{http://www.govtalk.gov.uk/CM/envelope}UnicodeNameString" /&gt;
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
         *         &lt;element name="Organisation" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="64"/&gt;
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
            "organisation"
        })
        public static class TargetDetails {

            @XmlElement(name = "Organisation", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected List<String> organisation;

            /**
             * Gets the value of the organisation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the organisation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrganisation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getOrganisation() {
                if (organisation == null) {
                    organisation = new ArrayList<String>();
                }
                return this.organisation;
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
     *                       &lt;restriction base="{http://www.govtalk.gov.uk/CM/envelope}UnicodeNameString"&gt;
     *                         &lt;maxLength value="32"/&gt;
     *                         &lt;minLength value="4"/&gt;
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
     *                   &lt;element name="Function" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="list"/&gt;
     *                         &lt;enumeration value="read"/&gt;
     *                         &lt;enumeration value="delete"/&gt;
     *                         &lt;enumeration value="add"/&gt;
     *                         &lt;enumeration value="submit"/&gt;
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
     *                           &lt;attribute name="PollInterval" type="{http://www.w3.org/2001/XMLSchema}integer" default="2" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Transformation" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="XML"/&gt;
     *                         &lt;enumeration value="HTML"/&gt;
     *                         &lt;enumeration value="text"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="GatewayTest" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="GatewayTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SenderDetails" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.govtalk.gov.uk/CM/envelope}IDAuthentication" minOccurs="0"/&gt;
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

        @XmlElement(name = "MessageDetails", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
        protected GovTalkMessage.Header.MessageDetails messageDetails;
        @XmlElement(name = "SenderDetails", namespace = "http://www.govtalk.gov.uk/CM/envelope")
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
         *             &lt;restriction base="{http://www.govtalk.gov.uk/CM/envelope}UnicodeNameString"&gt;
         *               &lt;maxLength value="32"/&gt;
         *               &lt;minLength value="4"/&gt;
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
         *         &lt;element name="Function" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="list"/&gt;
         *               &lt;enumeration value="read"/&gt;
         *               &lt;enumeration value="delete"/&gt;
         *               &lt;enumeration value="add"/&gt;
         *               &lt;enumeration value="submit"/&gt;
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
         *                 &lt;attribute name="PollInterval" type="{http://www.w3.org/2001/XMLSchema}integer" default="2" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Transformation" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="XML"/&gt;
         *               &lt;enumeration value="HTML"/&gt;
         *               &lt;enumeration value="text"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
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
            "function",
            "transactionID",
            "auditID",
            "correlationID",
            "responseEndPoint",
            "transformation",
            "gatewayTest",
            "gatewayTimestamp"
        })
        public static class MessageDetails {

            @XmlElement(name = "Class", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
            protected String clazz;
            @XmlElement(name = "Qualifier", namespace = "http://www.govtalk.gov.uk/CM/envelope", required = true)
            protected String qualifier;
            @XmlElement(name = "Function", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected String function;
            @XmlElement(name = "TransactionID", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected String transactionID;
            @XmlElement(name = "AuditID", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected String auditID;
            @XmlElement(name = "CorrelationID", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected String correlationID;
            @XmlElement(name = "ResponseEndPoint", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected GovTalkMessage.Header.MessageDetails.ResponseEndPoint responseEndPoint;
            @XmlElement(name = "Transformation", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected String transformation;
            @XmlElement(name = "GatewayTest", namespace = "http://www.govtalk.gov.uk/CM/envelope", type = String.class)
            @XmlJavaTypeAdapter(LongXmlAdapter.class)
            @XmlSchemaType(name = "integer")
            protected Long gatewayTest;
            @XmlElement(name = "GatewayTimestamp", namespace = "http://www.govtalk.gov.uk/CM/envelope", type = String.class)
            @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
            @XmlSchemaType(name = "dateTime")
            protected LocalDateTime gatewayTimestamp;

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
             * Gets the value of the function property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFunction() {
                return function;
            }

            /**
             * Sets the value of the function property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFunction(String value) {
                this.function = value;
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
             * Gets the value of the transformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransformation() {
                return transformation;
            }

            /**
             * Sets the value of the transformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransformation(String value) {
                this.transformation = value;
            }

            /**
             * Gets the value of the gatewayTest property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Long getGatewayTest() {
                return gatewayTest;
            }

            /**
             * Sets the value of the gatewayTest property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGatewayTest(Long value) {
                this.gatewayTest = value;
            }

            /**
             * Gets the value of the gatewayTimestamp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public LocalDateTime getGatewayTimestamp() {
                return gatewayTimestamp;
            }

            /**
             * Sets the value of the gatewayTimestamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGatewayTimestamp(LocalDateTime value) {
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
             *       &lt;attribute name="PollInterval" type="{http://www.w3.org/2001/XMLSchema}integer" default="2" /&gt;
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
                @XmlJavaTypeAdapter(LongXmlAdapter.class)
                @XmlSchemaType(name = "integer")
                protected Long pollInterval;

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
                 *     {@link String }
                 *     
                 */
                public long getPollInterval() {
                    if (pollInterval == null) {
                        return new LongXmlAdapter().unmarshal("2");
                    } else {
                        return pollInterval;
                    }
                }

                /**
                 * Sets the value of the pollInterval property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPollInterval(Long value) {
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
         *         &lt;element ref="{http://www.govtalk.gov.uk/CM/envelope}IDAuthentication" minOccurs="0"/&gt;
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

            @XmlElement(name = "IDAuthentication", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected IDAuthentication idAuthentication;
            @XmlElement(name = "X509Certificate", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected byte[] x509Certificate;
            @XmlElement(name = "EmailAddress", namespace = "http://www.govtalk.gov.uk/CM/envelope")
            protected String emailAddress;

            /**
             * Gets the value of the idAuthentication property.
             * 
             * @return
             *     possible object is
             *     {@link IDAuthentication }
             *     
             */
            public IDAuthentication getIDAuthentication() {
                return idAuthentication;
            }

            /**
             * Sets the value of the idAuthentication property.
             * 
             * @param value
             *     allowed object is
             *     {@link IDAuthentication }
             *     
             */
            public void setIDAuthentication(IDAuthentication value) {
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

        }

    }

}
