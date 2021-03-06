
package com.test.openmeetings.roomservice;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-02-23T15:06:02.540+08:00
 * Generated source version: 3.3.5
 *
 */

public class RoomWebService_RoomWebServicePort_Server{

    protected RoomWebService_RoomWebServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new RoomWebServicePortImpl();
        String address = "http://192.168.0.25:5080/openmeetings/services/RoomService";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new RoomWebService_RoomWebServicePort_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
