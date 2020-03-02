package com.test.openmeetings.calendarservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-03-02T11:51:07.412+08:00
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://webservice.openmeetings.apache.org/", name = "CalendarWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface CalendarWebService {

    @WebMethod
    @RequestWrapper(localName = "getByTitle", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.GetByTitle")
    @ResponseWrapper(localName = "getByTitleResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.GetByTitleResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.test.openmeetings.calendarservice.AppointmentDTO> getByTitle(

        @WebParam(name = "sid", targetNamespace = "")
        java.lang.String sid,
        @WebParam(name = "title", targetNamespace = "")
        java.lang.String title
    );

    @WebMethod
    @RequestWrapper(localName = "next", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.Next")
    @ResponseWrapper(localName = "nextResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.NextResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.test.openmeetings.calendarservice.AppointmentDTO next(

        @WebParam(name = "sid", targetNamespace = "")
        java.lang.String sid
    );

    @WebMethod
    @RequestWrapper(localName = "nextForUser", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.NextForUser")
    @ResponseWrapper(localName = "nextForUserResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.NextForUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.test.openmeetings.calendarservice.AppointmentDTO nextForUser(

        @WebParam(name = "sid", targetNamespace = "")
        java.lang.String sid,
        @WebParam(name = "userid", targetNamespace = "")
        long userid
    );

    @WebMethod
    @RequestWrapper(localName = "getByRoom", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.GetByRoom")
    @ResponseWrapper(localName = "getByRoomResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.GetByRoomResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.test.openmeetings.calendarservice.AppointmentDTO getByRoom(

        @WebParam(name = "sid", targetNamespace = "")
        java.lang.String sid,
        @WebParam(name = "roomid", targetNamespace = "")
        long roomid
    );

    @WebMethod
    @RequestWrapper(localName = "range", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.Range")
    @ResponseWrapper(localName = "rangeResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.RangeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.test.openmeetings.calendarservice.AppointmentDTO> range(

        @WebParam(name = "sid", targetNamespace = "")
        java.lang.String sid,
        @WebParam(name = "start", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar start,
        @WebParam(name = "end", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar end
    );

    @WebMethod
    @RequestWrapper(localName = "rangeForUser", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.RangeForUser")
    @ResponseWrapper(localName = "rangeForUserResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.RangeForUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.test.openmeetings.calendarservice.AppointmentDTO> rangeForUser(

        @WebParam(name = "sid", targetNamespace = "")
        java.lang.String sid,
        @WebParam(name = "userid", targetNamespace = "")
        long userid,
        @WebParam(name = "start", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar start,
        @WebParam(name = "end", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar end
    );

    @WebMethod
    @RequestWrapper(localName = "save", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.SaveResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.test.openmeetings.calendarservice.AppointmentDTO save(

        @WebParam(name = "sid", targetNamespace = "")
        java.lang.String sid,
        @WebParam(name = "appointment", targetNamespace = "")
        com.test.openmeetings.calendarservice.AppointmentDTO appointment
    );

    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "com.test.openmeetings.calendarservice.DeleteResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.test.openmeetings.calendarservice.ServiceResult delete(

        @WebParam(name = "sid", targetNamespace = "")
        java.lang.String sid,
        @WebParam(name = "id", targetNamespace = "")
        java.lang.Long id
    );
}