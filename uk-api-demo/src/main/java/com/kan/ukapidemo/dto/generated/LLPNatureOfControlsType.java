
package com.kan.ukapidemo.dto.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LLPNatureOfControlsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LLPNatureOfControlsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NatureOfControl" maxOccurs="24"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="160"/&gt;
 *               &lt;enumeration value="RIGHTTOSHARESURPLUSASSETS_25TO50PERCENT"/&gt;
 *               &lt;enumeration value="RIGHTTOSHARESURPLUSASSETS_50TO75PERCENT"/&gt;
 *               &lt;enumeration value="RIGHTTOSHARESURPLUSASSETS_75TO100PERCENT"/&gt;
 *               &lt;enumeration value="RIGHTTOSHARESURPLUSASSETS_25TO50PERCENT_AS_TRUST"/&gt;
 *               &lt;enumeration value="RIGHTTOSHARESURPLUSASSETS_50TO75PERCENT_AS_TRUST"/&gt;
 *               &lt;enumeration value="RIGHTTOSHARESURPLUSASSETS_75TO100PERCENT_AS_TRUST"/&gt;
 *               &lt;enumeration value="RIGHTTOSHARESURPLUSASSETS_25TO50PERCENT_AS_FIRM"/&gt;
 *               &lt;enumeration value="RIGHTTOSHARESURPLUSASSETS_50TO75PERCENT_AS_FIRM"/&gt;
 *               &lt;enumeration value="RIGHTTOSHARESURPLUSASSETS_75TO100PERCENT_AS_FIRM"/&gt;
 *               &lt;enumeration value="VOTINGRIGHTS_25TO50PERCENT"/&gt;
 *               &lt;enumeration value="VOTINGRIGHTS_50TO75PERCENT"/&gt;
 *               &lt;enumeration value="VOTINGRIGHTS_75TO100PERCENT"/&gt;
 *               &lt;enumeration value="VOTINGRIGHTS_25TO50PERCENT_AS_TRUST"/&gt;
 *               &lt;enumeration value="VOTINGRIGHTS_50TO75PERCENT_AS_TRUST"/&gt;
 *               &lt;enumeration value="VOTINGRIGHTS_75TO100PERCENT_AS_TRUST"/&gt;
 *               &lt;enumeration value="VOTINGRIGHTS_25TO50PERCENT_AS_FIRM"/&gt;
 *               &lt;enumeration value="VOTINGRIGHTS_50TO75PERCENT_AS_FIRM"/&gt;
 *               &lt;enumeration value="VOTINGRIGHTS_75TO100PERCENT_AS_FIRM"/&gt;
 *               &lt;enumeration value="RIGHTTOAPPOINTANDREMOVEMEMBERS"/&gt;
 *               &lt;enumeration value="RIGHTTOAPPOINTANDREMOVEMEMBERS_AS_TRUST"/&gt;
 *               &lt;enumeration value="RIGHTTOAPPOINTANDREMOVEMEMBERS_AS_FIRM"/&gt;
 *               &lt;enumeration value="SIGINFLUENCECONTROL"/&gt;
 *               &lt;enumeration value="SIGINFLUENCECONTROL_AS_TRUST"/&gt;
 *               &lt;enumeration value="SIGINFLUENCECONTROL_AS_FIRM"/&gt;
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
@XmlType(name = "LLPNatureOfControlsType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "natureOfControl"
})
public class LLPNatureOfControlsType {

    @XmlElement(name = "NatureOfControl", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected List<String> natureOfControl;

    /**
     * Gets the value of the natureOfControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the natureOfControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNatureOfControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNatureOfControl() {
        if (natureOfControl == null) {
            natureOfControl = new ArrayList<String>();
        }
        return this.natureOfControl;
    }

}
