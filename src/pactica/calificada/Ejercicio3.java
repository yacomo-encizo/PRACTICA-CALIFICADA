/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pactica.calificada;

/**
 *
 * @author HP
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cursos []={"Diseño", "Estadistica","Ingles"}; 
int practicas []={14,17,11};
System.out.println("Promedio de Cursos");
System.out.println("CURSO NOTA");
System.out.println("------ ----- ");
int pp=(practicas[0]+practicas[1]+practicas[2])/3;
for (int s=0;s<cursos.length;s++){
System.out.println(cursos[s] + " "+practicas[s]); } System.out.println("Su Promedio es : " +pp);
    }
    
}
