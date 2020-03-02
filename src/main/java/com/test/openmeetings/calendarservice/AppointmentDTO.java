
package com.test.openmeetings.calendarservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>appointmentDTO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="appointmentDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="owner" type="{http://webservice.openmeetings.apache.org/}userDTO" minOccurs="0"/&gt;
 *         &lt;element name="inserted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="reminder" type="{http://webservice.openmeetings.apache.org/}reminder" minOccurs="0"/&gt;
 *         &lt;element name="room" type="{http://webservice.openmeetings.apache.org/}roomDTO" minOccurs="0"/&gt;
 *         &lt;element name="icalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meetingMembers" type="{http://webservice.openmeetings.apache.org/}meetingMemberDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="languageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passwordProtected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="connectedEvent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="reminderEmailSend" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appointmentDTO", propOrder = {
    "id",
    "title",
    "location",
    "start",
    "end",
    "description",
    "owner",
    "inserted",
    "updated",
    "deleted",
    "reminder",
    "room",
    "icalId",
    "meetingMembers",
    "languageId",
    "password",
    "passwordProtected",
    "connectedEvent",
    "reminderEmailSend"
})
public class AppointmentDTO {

    protected Long id;
    protected String title;
    protected String location;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    protected String description;
    protected UserDTO owner;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inserted;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    protected boolean deleted;
    @XmlSchemaType(name = "string")
    protected Reminder reminder;
    protected RoomDTO room;
    protected String icalId;
    @XmlElement(nillable = true)
    protected List<MeetingMemberDTO> meetingMembers;
    protected Long languageId;
    protected String password;
    protected boolean passwordProtected;
    protected boolean connectedEvent;
    protected boolean reminderEmailSend;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * ��ȡtitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * ����title���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * ��ȡstart���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * ����start���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * ��ȡend���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * ����end���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡowner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UserDTO }
     *     
     */
    public UserDTO getOwner() {
        return owner;
    }

    /**
     * ����owner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UserDTO }
     *     
     */
    public void setOwner(UserDTO value) {
        this.owner = value;
    }

    /**
     * ��ȡinserted���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInserted() {
        return inserted;
    }

    /**
     * ����inserted���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInserted(XMLGregorianCalendar value) {
        this.inserted = value;
    }

    /**
     * ��ȡupdated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * ����updated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * ��ȡdeleted���Ե�ֵ��
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * ����deleted���Ե�ֵ��
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
    }

    /**
     * ��ȡreminder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Reminder }
     *     
     */
    public Reminder getReminder() {
        return reminder;
    }

    /**
     * ����reminder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Reminder }
     *     
     */
    public void setReminder(Reminder value) {
        this.reminder = value;
    }

    /**
     * ��ȡroom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RoomDTO }
     *     
     */
    public RoomDTO getRoom() {
        return room;
    }

    /**
     * ����room���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RoomDTO }
     *     
     */
    public void setRoom(RoomDTO value) {
        this.room = value;
    }

    /**
     * ��ȡicalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcalId() {
        return icalId;
    }

    /**
     * ����icalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcalId(String value) {
        this.icalId = value;
    }

    /**
     * Gets the value of the meetingMembers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingMembers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingMemberDTO }
     * 
     * 
     */
    public List<MeetingMemberDTO> getMeetingMembers() {
        if (meetingMembers == null) {
            meetingMembers = new ArrayList<MeetingMemberDTO>();
        }
        return this.meetingMembers;
    }

    /**
     * ��ȡlanguageId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLanguageId() {
        return languageId;
    }

    /**
     * ����languageId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLanguageId(Long value) {
        this.languageId = value;
    }

    /**
     * ��ȡpassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����password���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * ��ȡpasswordProtected���Ե�ֵ��
     * 
     */
    public boolean isPasswordProtected() {
        return passwordProtected;
    }

    /**
     * ����passwordProtected���Ե�ֵ��
     * 
     */
    public void setPasswordProtected(boolean value) {
        this.passwordProtected = value;
    }

    /**
     * ��ȡconnectedEvent���Ե�ֵ��
     * 
     */
    public boolean isConnectedEvent() {
        return connectedEvent;
    }

    /**
     * ����connectedEvent���Ե�ֵ��
     * 
     */
    public void setConnectedEvent(boolean value) {
        this.connectedEvent = value;
    }

    /**
     * ��ȡreminderEmailSend���Ե�ֵ��
     * 
     */
    public boolean isReminderEmailSend() {
        return reminderEmailSend;
    }

    /**
     * ����reminderEmailSend���Ե�ֵ��
     * 
     */
    public void setReminderEmailSend(boolean value) {
        this.reminderEmailSend = value;
    }

}
