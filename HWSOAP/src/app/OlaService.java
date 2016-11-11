
package app;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author mayara.barbosa
 */

@WebService
public class OlaService {
    
    @WebMethod
    public String cumprimentar(String nome){
        return "Mayara informa, seu nome é, " + nome;
    }
    
}
