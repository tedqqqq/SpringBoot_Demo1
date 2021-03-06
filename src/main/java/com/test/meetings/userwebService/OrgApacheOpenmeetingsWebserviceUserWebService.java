package com.test.meetings.userwebService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-02-23T15:14:08.190+08:00
 * Generated source version: 3.3.5
 *
 */
@WebServiceClient(name = "org.apache.openmeetings.webservice.UserWebService",
                  wsdlLocation = "http://192.168.0.25:5080/openmeetings/services/UserService?wsdl",
                  targetNamespace = "http://webservice.openmeetings.apache.org/")
public class OrgApacheOpenmeetingsWebserviceUserWebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.openmeetings.apache.org/", "org.apache.openmeetings.webservice.UserWebService");
    public final static QName UserService = new QName("http://webservice.openmeetings.apache.org/", "UserService");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.0.25:5080/openmeetings/services/UserService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrgApacheOpenmeetingsWebserviceUserWebService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://192.168.0.25:5080/openmeetings/services/UserService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns UserWebService
     */
    @WebEndpoint(name = "UserService")
    public UserWebService getUserService() {
        return super.getPort(UserService, UserWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserWebService
     */
    @WebEndpoint(name = "UserService")
    public UserWebService getUserService(WebServiceFeature... features) {
        return super.getPort(UserService, UserWebService.class, features);
    }

}
