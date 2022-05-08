/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author HP
 */
public class Cheques {

    private String nombre;
    private String nombreB;
    private double vCheque;
    private double vComision;

    public Cheques(String n, String nB) {
        nombre = n;
        nombreB = nB;
    }

    public Cheques() {
        nombre = "Byron Castillo";
        nombreB = "Banco de Loja";
        vCheque = 10000000; 
        

    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerNombreBanco(String nB) {
        nombreB = nB;
    }

    public void establecerValorCheque(double vc) {
        vCheque = vc;
    }

    public void calcularValorComision() {
        vComision = ((vCheque * 0.003) / 100);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNombreBanco() {
        return nombreB;
    }

    public double obtenerValorCheque() {
        return vCheque;
    }

    public double ObtenerValorComision() {
        return vComision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Cheque\n"
                + "Nombre: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del cheque:%.2f\n"
                + "Valor de la comision:%.2f\n",
                obtenerNombre(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                ObtenerValorComision());
        return cadena;
    }

}
