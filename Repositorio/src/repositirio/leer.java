/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositirio;

import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class leer {
     
    
    public void leer(){
        Scanner teclado=new Scanner(System.in);
        String letra1,letra2;
        
        System.out.print("Ingrese la letra1:");
        letra1=teclado.next();
        System.out.print("Ingrese la letra2");
        letra2=teclado.next();
        
        System.out.print("La letra que ingreso fue" +letra1+letra2);
        
    }
    
}
