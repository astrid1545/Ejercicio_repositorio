/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class Caminar {
    
   String nombre;
   String CaminoRecorrido;
   public  void caminar(){
   Scanner teclado=new Scanner(System.in);
       String nombre,nombre2;
        int CaminoRecorrido,CaminoRecorrido2=0;
        System.out.print("Ingrese el nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese kilometros caminados:");
        CaminoRecorrido=teclado.nextInt();
        System.out.print("Ingrese el nombre:");
        nombre2=teclado.next();
        System.out.print("Ingrese kilometros caminados:");
        CaminoRecorrido=teclado.nextInt();
        System.out.print("La persona de mayor kilometros camino es:");
        if (CaminoRecorrido>CaminoRecorrido2) {
            System.out.println(nombre);
        } else {
            System.out.println(nombre2);
        }
   
   
   }
    
}
