
package tw.gov.tpl.holdnotice_service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "HoldnoticeService", targetNamespace = "http://holdnotice-service.tpl.gov.tw", wsdlLocation = "http://localhost:8080/tpl.notice.hold.service/HoldnoticeService?wsdl")
public class HoldnoticeService
    extends Service
{

    private final static URL HOLDNOTICESERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://webcat4.tpml.edu.tw/tpl.notice.hold.service/HoldnoticeService?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HOLDNOTICESERVICE_WSDL_LOCATION = url;
    }

    public HoldnoticeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HoldnoticeService() {
        super(HOLDNOTICESERVICE_WSDL_LOCATION, new QName("http://holdnotice-service.tpl.gov.tw", "HoldnoticeService"));
    }

    /**
     * 
     * @return
     *     returns HoldnoticeServicePortType
     */
    @WebEndpoint(name = "HoldnoticeServicePort")
    public HoldnoticeServicePortType getHoldnoticeServicePort() {
        return (HoldnoticeServicePortType)super.getPort(new QName("http://holdnotice-service.tpl.gov.tw", "HoldnoticeServicePort"), HoldnoticeServicePortType.class);
    }

}
