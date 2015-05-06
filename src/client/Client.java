package client;


import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;



public class Client {
	public static void sayHello(){
		String url="http://localhost/axis1.4_service/services/helloService?wsdl";
		try {
			RPCServiceClient client=new RPCServiceClient();
			Options options=client.getOptions();
			EndpointReference targetEPR=new EndpointReference(url);
			options.setTo(targetEPR);
			options.setCallTransportCleanup(true);
			String ns="http://localhost/axis1.4_service/services/helloService";
			String action="sayHello";
			QName opAction=new QName(ns,action);
			//invokeBlocking(QName,参数,返回值类型)
			Object [] result=client.invokeBlocking(opAction, new Object[]{"Lovercy"},new Class[]{String.class});
			System.out.println(result[0]);
		} catch (AxisFault e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sayHello();

	}

}
