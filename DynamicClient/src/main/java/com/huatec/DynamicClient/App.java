package com.huatec.DynamicClient;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		DynamicClientFactory factory = DynamicClientFactory.newInstance();
		Client client = factory.createClient("http://localhost:8080/SoapSpringCxf/ws/soap/hello?wsdl");
		
		Object[] objs = client.invoke("sayHello","worldye");
		for (Object obj: objs) {
			System.out.println(obj);
		}
	}
}
