
package com.test.openmeetings.calendarservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>save complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="save"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appointment" type="{http://webservice.openmeetings.apache.org/}appointmentDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = {
    "sid",
    "appointment"
})
public class Save {

    protected String sid;
    protected AppointmentDTO appointment;

    /**
     * ��ȡsid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * ����sid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

    /**
     * ��ȡappointment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AppointmentDTO }
     *     
     */
    public AppointmentDTO getAppointment() {
        return appointment;
    }

    /**
     * ����appointment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentDTO }
     *     
     */
    public void setAppointment(AppointmentDTO value) {
        this.appointment = value;
    }

}
