
package com.re01.myclient.server_package;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.re01.myclient.server_package package. 
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

    private final static QName _SendInfo_QNAME = new QName("http://service.jh.re01.com/", "sendInfo");
    private final static QName _SendInfoResponse_QNAME = new QName("http://service.jh.re01.com/", "sendInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.re01.myclient.server_package
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendInfo }
     * 
     */
    public SendInfo createSendInfo() {
        return new SendInfo();
    }

    /**
     * Create an instance of {@link SendInfoResponse }
     * 
     */
    public SendInfoResponse createSendInfoResponse() {
        return new SendInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jh.re01.com/", name = "sendInfo")
    public JAXBElement<SendInfo> createSendInfo(SendInfo value) {
        return new JAXBElement<SendInfo>(_SendInfo_QNAME, SendInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jh.re01.com/", name = "sendInfoResponse")
    public JAXBElement<SendInfoResponse> createSendInfoResponse(SendInfoResponse value) {
        return new JAXBElement<SendInfoResponse>(_SendInfoResponse_QNAME, SendInfoResponse.class, null, value);
    }

}
