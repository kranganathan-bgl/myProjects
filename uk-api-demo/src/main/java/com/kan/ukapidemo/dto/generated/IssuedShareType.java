
package com.kan.ukapidemo.dto.generated;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuedShareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuedShareType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}ShareQuantityClassType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}AggregrateNominalValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedShareType", namespace = "http://xmlgw.companieshouse.gov.uk", propOrder = {
    "aggregrateNominalValue"
})
public class IssuedShareType
    extends ShareQuantityClassType
{

    @XmlElement(name = "AggregrateNominalValue", namespace = "http://xmlgw.companieshouse.gov.uk", required = true)
    protected BigDecimal aggregrateNominalValue;

    /**
     * Gets the value of the aggregrateNominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAggregrateNominalValue() {
        return aggregrateNominalValue;
    }

    /**
     * Sets the value of the aggregrateNominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAggregrateNominalValue(BigDecimal value) {
        this.aggregrateNominalValue = value;
    }

}
