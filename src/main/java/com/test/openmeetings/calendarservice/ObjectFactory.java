
package com.test.openmeetings.calendarservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.test.openmeetings.calendarservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AppointmentDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "appointmentDTO");
    private final static QName _Delete_QNAME = new QName("http://webservice.openmeetings.apache.org/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "deleteResponse");
    private final static QName _GetByRoom_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getByRoom");
    private final static QName _GetByRoomResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getByRoomResponse");
    private final static QName _GetByTitle_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getByTitle");
    private final static QName _GetByTitleResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getByTitleResponse");
    private final static QName _MeetingMemberDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "meetingMemberDTO");
    private final static QName _Next_QNAME = new QName("http://webservice.openmeetings.apache.org/", "next");
    private final static QName _NextForUser_QNAME = new QName("http://webservice.openmeetings.apache.org/", "nextForUser");
    private final static QName _NextForUserResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "nextForUserResponse");
    private final static QName _NextResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "nextResponse");
    private final static QName _Range_QNAME = new QName("http://webservice.openmeetings.apache.org/", "range");
    private final static QName _RangeForUser_QNAME = new QName("http://webservice.openmeetings.apache.org/", "rangeForUser");
    private final static QName _RangeForUserResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "rangeForUserResponse");
    private final static QName _RangeResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "rangeResponse");
    private final static QName _RoomDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "roomDTO");
    private final static QName _RoomFileDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "roomFileDTO");
    private final static QName _Save_QNAME = new QName("http://webservice.openmeetings.apache.org/", "save");
    private final static QName _SaveResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "saveResponse");
    private final static QName _ServiceResult_QNAME = new QName("http://webservice.openmeetings.apache.org/", "serviceResult");
    private final static QName _UserDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "userDTO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.test.openmeetings.calendarservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AppointmentDTO }
     * 
     */
    public AppointmentDTO createAppointmentDTO() {
        return new AppointmentDTO();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetByRoom }
     * 
     */
    public GetByRoom createGetByRoom() {
        return new GetByRoom();
    }

    /**
     * Create an instance of {@link GetByRoomResponse }
     * 
     */
    public GetByRoomResponse createGetByRoomResponse() {
        return new GetByRoomResponse();
    }

    /**
     * Create an instance of {@link GetByTitle }
     * 
     */
    public GetByTitle createGetByTitle() {
        return new GetByTitle();
    }

    /**
     * Create an instance of {@link GetByTitleResponse }
     * 
     */
    public GetByTitleResponse createGetByTitleResponse() {
        return new GetByTitleResponse();
    }

    /**
     * Create an instance of {@link MeetingMemberDTO }
     * 
     */
    public MeetingMemberDTO createMeetingMemberDTO() {
        return new MeetingMemberDTO();
    }

    /**
     * Create an instance of {@link Next }
     * 
     */
    public Next createNext() {
        return new Next();
    }

    /**
     * Create an instance of {@link NextForUser }
     * 
     */
    public NextForUser createNextForUser() {
        return new NextForUser();
    }

    /**
     * Create an instance of {@link NextForUserResponse }
     * 
     */
    public NextForUserResponse createNextForUserResponse() {
        return new NextForUserResponse();
    }

    /**
     * Create an instance of {@link NextResponse }
     * 
     */
    public NextResponse createNextResponse() {
        return new NextResponse();
    }

    /**
     * Create an instance of {@link Range }
     * 
     */
    public Range createRange() {
        return new Range();
    }

    /**
     * Create an instance of {@link RangeForUser }
     * 
     */
    public RangeForUser createRangeForUser() {
        return new RangeForUser();
    }

    /**
     * Create an instance of {@link RangeForUserResponse }
     * 
     */
    public RangeForUserResponse createRangeForUserResponse() {
        return new RangeForUserResponse();
    }

    /**
     * Create an instance of {@link RangeResponse }
     * 
     */
    public RangeResponse createRangeResponse() {
        return new RangeResponse();
    }

    /**
     * Create an instance of {@link RoomDTO }
     * 
     */
    public RoomDTO createRoomDTO() {
        return new RoomDTO();
    }

    /**
     * Create an instance of {@link RoomFileDTO }
     * 
     */
    public RoomFileDTO createRoomFileDTO() {
        return new RoomFileDTO();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link ServiceResult }
     * 
     */
    public ServiceResult createServiceResult() {
        return new ServiceResult();
    }

    /**
     * Create an instance of {@link UserDTO }
     * 
     */
    public UserDTO createUserDTO() {
        return new UserDTO();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppointmentDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppointmentDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "appointmentDTO")
    public JAXBElement<AppointmentDTO> createAppointmentDTO(AppointmentDTO value) {
        return new JAXBElement<AppointmentDTO>(_AppointmentDTO_QNAME, AppointmentDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByRoom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByRoom }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getByRoom")
    public JAXBElement<GetByRoom> createGetByRoom(GetByRoom value) {
        return new JAXBElement<GetByRoom>(_GetByRoom_QNAME, GetByRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByRoomResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByRoomResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getByRoomResponse")
    public JAXBElement<GetByRoomResponse> createGetByRoomResponse(GetByRoomResponse value) {
        return new JAXBElement<GetByRoomResponse>(_GetByRoomResponse_QNAME, GetByRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByTitle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByTitle }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getByTitle")
    public JAXBElement<GetByTitle> createGetByTitle(GetByTitle value) {
        return new JAXBElement<GetByTitle>(_GetByTitle_QNAME, GetByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByTitleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByTitleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getByTitleResponse")
    public JAXBElement<GetByTitleResponse> createGetByTitleResponse(GetByTitleResponse value) {
        return new JAXBElement<GetByTitleResponse>(_GetByTitleResponse_QNAME, GetByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeetingMemberDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeetingMemberDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "meetingMemberDTO")
    public JAXBElement<MeetingMemberDTO> createMeetingMemberDTO(MeetingMemberDTO value) {
        return new JAXBElement<MeetingMemberDTO>(_MeetingMemberDTO_QNAME, MeetingMemberDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Next }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Next }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "next")
    public JAXBElement<Next> createNext(Next value) {
        return new JAXBElement<Next>(_Next_QNAME, Next.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextForUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NextForUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "nextForUser")
    public JAXBElement<NextForUser> createNextForUser(NextForUser value) {
        return new JAXBElement<NextForUser>(_NextForUser_QNAME, NextForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextForUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NextForUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "nextForUserResponse")
    public JAXBElement<NextForUserResponse> createNextForUserResponse(NextForUserResponse value) {
        return new JAXBElement<NextForUserResponse>(_NextForUserResponse_QNAME, NextForUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NextResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "nextResponse")
    public JAXBElement<NextResponse> createNextResponse(NextResponse value) {
        return new JAXBElement<NextResponse>(_NextResponse_QNAME, NextResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Range }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Range }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "range")
    public JAXBElement<Range> createRange(Range value) {
        return new JAXBElement<Range>(_Range_QNAME, Range.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeForUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RangeForUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "rangeForUser")
    public JAXBElement<RangeForUser> createRangeForUser(RangeForUser value) {
        return new JAXBElement<RangeForUser>(_RangeForUser_QNAME, RangeForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeForUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RangeForUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "rangeForUserResponse")
    public JAXBElement<RangeForUserResponse> createRangeForUserResponse(RangeForUserResponse value) {
        return new JAXBElement<RangeForUserResponse>(_RangeForUserResponse_QNAME, RangeForUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RangeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "rangeResponse")
    public JAXBElement<RangeResponse> createRangeResponse(RangeResponse value) {
        return new JAXBElement<RangeResponse>(_RangeResponse_QNAME, RangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoomDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "roomDTO")
    public JAXBElement<RoomDTO> createRoomDTO(RoomDTO value) {
        return new JAXBElement<RoomDTO>(_RoomDTO_QNAME, RoomDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomFileDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoomFileDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "roomFileDTO")
    public JAXBElement<RoomFileDTO> createRoomFileDTO(RoomFileDTO value) {
        return new JAXBElement<RoomFileDTO>(_RoomFileDTO_QNAME, RoomFileDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "serviceResult")
    public JAXBElement<ServiceResult> createServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_ServiceResult_QNAME, ServiceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "userDTO")
    public JAXBElement<UserDTO> createUserDTO(UserDTO value) {
        return new JAXBElement<UserDTO>(_UserDTO_QNAME, UserDTO.class, null, value);
    }

}
