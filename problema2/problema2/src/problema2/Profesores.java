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
public class Profesores {
    private String nomb;
    private String apellido;
    private double suelb;
    private double suelt;
    private String cedula;
    
    public Profesores(String n,String c,String a){
        nomb = n;
        cedula = c;
        apellido = a; 
    }
    public Profesores(double sb){
        suelb = sb;
        nomb = "Leonaldo";
        cedula = "1106072545";
        apellido = "Penaldo";
    }
    
    public void establecerNombre(String c) {
        nomb = c;
    }
    public void establecerApellido(String a) {
        apellido = a;
    }
    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerSueldoBasico(double c) {
        suelb = c;
    }
    
    public void calcularSueldoTotal() {
        suelt = suelb + (suelb*0.2) ;
    }

    public String obtenerNombre() {
        return nomb;      
    }
    
    public String obtenerApellido() {
        return apellido;
        
    }
    public String obtenerCedula() {
        return cedula;
    }
    

    public double obtenerSueldoBasico() {
        return suelb;
    }

    
    public double ObtenerSueldoTotal() {
        return suelt;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Los datos del Profesor\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Cedula: %s\n"
                + "Sueldo Basico:%.2f\n"
                + "Sueldo Total:%.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                ObtenerSueldoTotal());
        return cadena;
    }
}
