package com.re01.myclient.server_package;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.9
 * 2019-07-30T09:29:22.309+08:00
 * Generated source version: 3.2.9
 *
 */
@WebService(targetNamespace = "http://service.jh.re01.com/", name = "IMyServer")
@XmlSeeAlso({ObjectFactory.class})
public interface IMyServer {

    @WebMethod
    @RequestWrapper(localName = "sendInfo", targetNamespace = "http://service.jh.re01.com/", className = "com.re01.myclient.server_package.SendInfo")
    @ResponseWrapper(localName = "sendInfoResponse", targetNamespace = "http://service.jh.re01.com/", className = "com.re01.myclient.server_package.SendInfoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String sendInfo();
}
