/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pactica.calificada;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
int c=0; System.out.println("Escriba una palabra");
String palabra=dato.nextLine();
 char caracteres[]=new char[palabra.length()];
for(int i=0;i<palabra.length();i++){ 
c=c+1; 
caracteres[i]=palabra.charAt(i); System.out.println(caracteres[i]); 
} 
System.out.println("la cantidad de caracteres es : "+c);
    }
    
}
