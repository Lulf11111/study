
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetFrameUserinfoKBDTResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getFrameUserinfoKBDTResult"
})
@XmlRootElement(name = "GetFrameUserinfoKBDTResponse")
public class GetFrameUserinfoKBDTResponse {

    @XmlElement(name = "GetFrameUserinfoKBDTResult")
    protected String getFrameUserinfoKBDTResult;

    /**
     * ��ȡgetFrameUserinfoKBDTResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetFrameUserinfoKBDTResult() {
        return getFrameUserinfoKBDTResult;
    }

    /**
     * ����getFrameUserinfoKBDTResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetFrameUserinfoKBDTResult(String value) {
        this.getFrameUserinfoKBDTResult = value;
    }

}