package com.test.openmeetings.calendarservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-03-02T11:51:07.420+08:00
 * Generated source version: 3.3.5
 *
 */
@WebServiceClient(name = "org.apache.openmeetings.webservice.CalendarWebService",
                  wsdlLocation = "http://192.168.0.25:5080/openmeetings/services/CalendarService?wsdl",
                  targetNamespace = "http://webservice.openmeetings.apache.org/")
public class OrgApacheOpenmeetingsWebserviceCalendarWebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.openmeetings.apache.org/", "org.apache.openmeetings.webservice.CalendarWebService");
    public final static QName CalendarWebServicePort = new QName("http://webservice.openmeetings.apache.org/", "CalendarWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.0.25:5080/openmeetings/services/CalendarService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrgApacheOpenmeetingsWebserviceCalendarWebService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://192.168.0.25:5080/openmeetings/services/CalendarService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrgApacheOpenmeetingsWebserviceCalendarWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrgApacheOpenmeetingsWebserviceCalendarWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrgApacheOpenmeetingsWebserviceCalendarWebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public OrgApacheOpenmeetingsWebserviceCalendarWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrgApacheOpenmeetingsWebserviceCalendarWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrgApacheOpenmeetingsWebserviceCalendarWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CalendarWebService
     */
    @WebEndpoint(name = "CalendarWebServicePort")
    public CalendarWebService getCalendarWebServicePort() {
        return super.getPort(CalendarWebServicePort, CalendarWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalendarWebService
     */
    @WebEndpoint(name = "CalendarWebServicePort")
    public CalendarWebService getCalendarWebServicePort(WebServiceFeature... features) {
        return super.getPort(CalendarWebServicePort, CalendarWebService.class, features);
    }

}
