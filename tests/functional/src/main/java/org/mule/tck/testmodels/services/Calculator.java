package org.mule.tck.testmodels.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(name="CalculatorPortType",
        targetNamespace = "http://jws.samples.geronimo.apache.org")
public interface Calculator {

    @WebMethod
    public int add(@WebParam(name = "value1") int value1,
                   @WebParam(name = "value2") int value2);

}
