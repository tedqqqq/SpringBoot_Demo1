
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
 * <p>appointmentDTO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取id属性的值。
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
     * 设置id属性的值。
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
     * 获取title属性的值。
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
     * 设置title属性的值。
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
     * 获取location属性的值。
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
     * 设置location属性的值。
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
     * 获取start属性的值。
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
     * 设置start属性的值。
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
     * 获取end属性的值。
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
     * 设置end属性的值。
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
     * 获取description属性的值。
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
     * 设置description属性的值。
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
     * 获取owner属性的值。
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
     * 设置owner属性的值。
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
     * 获取inserted属性的值。
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
     * 设置inserted属性的值。
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
     * 获取updated属性的值。
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
     * 设置updated属性的值。
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
     * 获取deleted属性的值。
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * 设置deleted属性的值。
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
    }

    /**
     * 获取reminder属性的值。
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
     * 设置reminder属性的值。
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
     * 获取room属性的值。
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
     * 设置room属性的值。
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
     * 获取icalId属性的值。
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
     * 设置icalId属性的值。
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
     * 获取languageId属性的值。
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
     * 设置languageId属性的值。
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
     * 获取password属性的值。
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
     * 设置password属性的值。
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
     * 获取passwordProtected属性的值。
     * 
     */
    public boolean isPasswordProtected() {
        return passwordProtected;
    }

    /**
     * 设置passwordProtected属性的值。
     * 
     */
    public void setPasswordProtected(boolean value) {
        this.passwordProtected = value;
    }

    /**
     * 获取connectedEvent属性的值。
     * 
     */
    public boolean isConnectedEvent() {
        return connectedEvent;
    }

    /**
     * 设置connectedEvent属性的值。
     * 
     */
    public void setConnectedEvent(boolean value) {
        this.connectedEvent = value;
    }

    /**
     * 获取reminderEmailSend属性的值。
     * 
     */
    public boolean isReminderEmailSend() {
        return reminderEmailSend;
    }

    /**
     * 设置reminderEmailSend属性的值。
     * 
     */
    public void setReminderEmailSend(boolean value) {
        this.reminderEmailSend = value;
    }

}
