/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author SALA I
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Angelito "; 
        String cedula = "1105456465";
        String apellido = "Di Maria";
        double sueldoB = 500; 
        Profesores prf1 = new Profesores(nombre, cedula, apellido);
        prf1.establecerSueldoBasico(400);
        prf1.calcularSueldoTotal();
        System.out.printf("%s\n", prf1);
        
        Profesores prf2 = new Profesores(sueldoB);
        prf2.establecerSueldoBasico(800);  
        prf2.calcularSueldoTotal();
        System.out.printf("%s\n", prf2);
        
    }
    
}
