/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author HP
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dueño = "Zuzuki"; 
        String cedula = "11846454654"; 
        Automotor aut1 = new Automotor(dueño,cedula);
        aut1.establecerValorAuto(5000);
        aut1.establecerañoF(1998);
        aut1.calcularValorMatricula();
        System.out.printf("%s \n",aut1);
        
         
        Automotor aut2 = new Automotor();
        aut2.establecerCedula("11253687489");
        aut2.establecerMarca("Chevrolet Camaro");
        aut2.establecerValorAuto(85000);
        aut2.establecerañoF(1967);
        aut2.calcularValorMatricula();
        System.out.printf("%s \n",aut2);
        
    }
    
}
