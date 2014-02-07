package org.mule.tck.testmodels.services;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;

@WebService
        /*(serviceName = "Calculator",
        portName="CalculatorPort",
        endpointInterface = "org.apache.geronimo.samples.jws.Calculator",
        targetNamespace = "http://jws.samples.geronimo.apache.org",
        wsdlLocation = "WEB-INF/wsdl/CalculatorService.wsdl")*/
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP11HTTP_BINDING)
public class CalculatorService implements Calculator {

    @Resource
    private WebServiceContext context;

    public int add(int value1, int value2) {
        System.out.println("User Principal: " + context.getUserPrincipal());
        return value1 + value2;
    }
}