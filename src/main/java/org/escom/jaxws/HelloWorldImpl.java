
package org.escom.jaxws;

import java.time.LocalDateTime;

import javax.jws.WebService;

@WebService(endpointInterface = "org.escom.jaxws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text + "Son las: " + LocalDateTime.now();
    }
}

