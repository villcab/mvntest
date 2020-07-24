
package com.tigo.xmlns.tigobusiness.service.getclientaccountgeneralinfomobile.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PS_GetClientAccountGeneralInfoMobile", targetNamespace = "http://xmlns.tigo.com/TigoBusiness/Service/GetClientAccountGeneralInfoMobile/V1", wsdlLocation = "https://oracleapigw.tigo.net.bo/Regional/TigoBusinessOnline/GetClientAccountGeneralInfoMobile?wsdl")
public class PSGetClientAccountGeneralInfoMobile_Service
    extends Service
{

    private final static URL PSGETCLIENTACCOUNTGENERALINFOMOBILE_WSDL_LOCATION;
    private final static WebServiceException PSGETCLIENTACCOUNTGENERALINFOMOBILE_EXCEPTION;
    private final static QName PSGETCLIENTACCOUNTGENERALINFOMOBILE_QNAME = new QName("http://xmlns.tigo.com/TigoBusiness/Service/GetClientAccountGeneralInfoMobile/V1", "PS_GetClientAccountGeneralInfoMobile");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://oracleapigw.tigo.net.bo/Regional/TigoBusinessOnline/GetClientAccountGeneralInfoMobile?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PSGETCLIENTACCOUNTGENERALINFOMOBILE_WSDL_LOCATION = url;
        PSGETCLIENTACCOUNTGENERALINFOMOBILE_EXCEPTION = e;
    }

    public PSGetClientAccountGeneralInfoMobile_Service() {
        super(__getWsdlLocation(), PSGETCLIENTACCOUNTGENERALINFOMOBILE_QNAME);
    }

    public PSGetClientAccountGeneralInfoMobile_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PSGETCLIENTACCOUNTGENERALINFOMOBILE_QNAME, features);
    }

    public PSGetClientAccountGeneralInfoMobile_Service(URL wsdlLocation) {
        super(wsdlLocation, PSGETCLIENTACCOUNTGENERALINFOMOBILE_QNAME);
    }

    public PSGetClientAccountGeneralInfoMobile_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PSGETCLIENTACCOUNTGENERALINFOMOBILE_QNAME, features);
    }

    public PSGetClientAccountGeneralInfoMobile_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PSGetClientAccountGeneralInfoMobile_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PSGetClientAccountGeneralInfoMobile
     */
    @WebEndpoint(name = "PS_GetClientAccountGeneralInfoMobileSOAP")
    public PSGetClientAccountGeneralInfoMobile getPSGetClientAccountGeneralInfoMobileSOAP() {
        return super.getPort(new QName("http://xmlns.tigo.com/TigoBusiness/Service/GetClientAccountGeneralInfoMobile/V1", "PS_GetClientAccountGeneralInfoMobileSOAP"), PSGetClientAccountGeneralInfoMobile.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PSGetClientAccountGeneralInfoMobile
     */
    @WebEndpoint(name = "PS_GetClientAccountGeneralInfoMobileSOAP")
    public PSGetClientAccountGeneralInfoMobile getPSGetClientAccountGeneralInfoMobileSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.tigo.com/TigoBusiness/Service/GetClientAccountGeneralInfoMobile/V1", "PS_GetClientAccountGeneralInfoMobileSOAP"), PSGetClientAccountGeneralInfoMobile.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PSGETCLIENTACCOUNTGENERALINFOMOBILE_EXCEPTION!= null) {
            throw PSGETCLIENTACCOUNTGENERALINFOMOBILE_EXCEPTION;
        }
        return PSGETCLIENTACCOUNTGENERALINFOMOBILE_WSDL_LOCATION;
    }

}