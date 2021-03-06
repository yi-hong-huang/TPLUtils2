
package tw.gov.tpl.holdnotice_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNoPrivDaysResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNoPrivDaysResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://holdnotice-service.tpl.gov.tw}userHoldPriv" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNoPrivDaysResponse", namespace = "http://holdnotice-service.tpl.gov.tw", propOrder = {
    "_return"
})
public class GetNoPrivDaysResponse {

    @XmlElement(name = "return")
    protected UserHoldPriv _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UserHoldPriv }
     *     
     */
    public UserHoldPriv getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserHoldPriv }
     *     
     */
    public void setReturn(UserHoldPriv value) {
        this._return = value;
    }

}
