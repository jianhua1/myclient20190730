package com.re01.myclient.server_package;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.9
 * 2019-07-30T09:29:22.314+08:00
 * Generated source version: 3.2.9
 *
 */
@WebServiceClient(name = "MyServer",
                  wsdlLocation = "http://localhost:8080/services/api?wsdl",
                  targetNamespace = "http://service.jh.re01.com/")
public class MyServer extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.jh.re01.com/", "MyServer");
    public final static QName MyServerImplPort = new QName("http://service.jh.re01.com/", "MyServerImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/api?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MyServer.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/api?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MyServer(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MyServer(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyServer() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MyServer(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MyServer(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MyServer(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IMyServer
     */
    @WebEndpoint(name = "MyServerImplPort")
    public IMyServer getMyServerImplPort() {
        return super.getPort(MyServerImplPort, IMyServer.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMyServer
     */
    @WebEndpoint(name = "MyServerImplPort")
    public IMyServer getMyServerImplPort(WebServiceFeature... features) {
        return super.getPort(MyServerImplPort, IMyServer.class, features);
    }

}
