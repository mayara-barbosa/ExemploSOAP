
package app;

import java.util.Scanner;

/**
 *
 * @author mayara.barbosa
 */
public class Program {

    
    public static void main(String[] args) {
        
        Scanner sc;
        sc = new Scanner(System.in);
        String n;
        System.out.println("Infoprme seu nome");
        n= sc.nextLine();
        
        OlaServiceService fabrica;
        fabrica = new OlaServiceService();
        OlaService servico;
        servico = fabrica.getOlaServicePort();
        
        String r;
        r= servico.cumprimentar(n);
        System.out.println(r);
        
    }
    
}
