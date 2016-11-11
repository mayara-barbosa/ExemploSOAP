package app;

import javax.xml.ws.Endpoint;

public class Program {
 //soa expert
 //wsdl descreve o serviço(mensagens, operações, endpoint)
    
    public static void main(String[] args) {
        
        Endpoint.publish("http://10.96.26.42:1234/ola", 
                new OlaService());
    }
    
}
