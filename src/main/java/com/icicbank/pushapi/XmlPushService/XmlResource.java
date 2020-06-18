package com.icicbank.pushapi.XmlPushService;

import java.io.IOException;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.icicbank.pushapi.XmlPushService.model.FIXML;
import com.icicbank.pushapi.XmlPushService.model.ResponseModel;
import com.icicbank.pushapi.XmlPushService.service.XmlPushService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/xmlPushService")
public class XmlResource {
	
	XmlPushService xmlPushService = new XmlPushService();

	ResponseModel responseModel = new ResponseModel();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public ResponseModel pushXmlRecord() {
    	
    	
    	try {
			FIXML xmlresponse = xmlPushService.pushXmlRecords();
			responseModel.setStatus("Success");
			responseModel.setFixml(xmlresponse);
		} catch (SQLException | IOException e) {
			responseModel.setStatus("Fail");
			responseModel.setErrorMessage(e.getMessage());
		}
    	
    	
        return responseModel;
    }
}
