/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomb = "Pedrito Perez"; 
        double nota1 = 5.5; 
        double nota2 = 8.5;  
        Estudiante est1 = new Estudiante( nomb, nota1,nota2);
        est1.establecerCalificacion3(10);
        est1.calcularValorFactura();
        
        System.out.printf("%s\n", est1);
        
        Estudiante est2 = new Estudiante();
        est2.establecerNombre("Juanita Mercedez");
        est2.establecerCalificacion1(8.5);
        est2.establecerCalificacion2(7.5);
        est2.establecerCalificacion3(5.5);
        est2.calcularValorFactura();
    
        System.out.printf("%s\n", est2);
    }
    
}
