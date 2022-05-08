/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

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
        String dueño = "Gonzalo Mbappé"; 
        String banco = "Pichincha"; 
        Cheques cheque1 = new Cheques(dueño,banco);
        cheque1.establecerValorCheque(4587921.50);
        cheque1.calcularValorComision();
        System.out.printf("%s \n",cheque1);
        
         
        Cheques cheque2 = new Cheques();
        cheque2.calcularValorComision();
        System.out.printf("%s \n",cheque2);
    }
    
}
