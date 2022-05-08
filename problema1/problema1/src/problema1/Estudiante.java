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
public class Estudiante {
    private String nomb;
    private double calif1;
    private double calif2;
    private double calif3;
    private double promedio;
    
    public Estudiante(String n,double c1,double c2){
        nomb = n;
        calif1= c1;
        calif2= c2;                      
    }
    public Estudiante(){
        nomb = "Estudiante";
        calif1= 0;
        calif2= 0;       
        calif3= 0;
    }
    
    public void establecerNombre(String n) {
        nomb = n;
    }

    public void establecerCalificacion1(double c1) {
        calif1 = c1;
    }

    public void establecerCalificacion2(double c2) {
        calif2 = c2;
    }
    
    public void establecerCalificacion3(double c3) {
        calif3 = c3;
    }

    public void calcularValorFactura() {
        promedio = (calif1 + calif2 + calif3)/3;
    }

    public String obtenerNombre() {
        return nomb;
    }

    public double obtenerCalificacion1() {
        return calif1;
    }

    public double obtenerCalificacion2() {
        return calif2;
    }
    public double obtenerCalificacion3() {
        return calif3;
    }

    public double obtenerPromedio() {
        return promedio;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Los datos del Estudiante\n"
                + "Nombre: %s\n"
                + "Calificacion 1:%.2f\n"
                + "Calificacion 2:%.2f\n"
                + "Calificacion 3:%.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombre(),
                obtenerCalificacion1(),
                obtenerCalificacion2(),
                obtenerCalificacion3(),
                obtenerPromedio());
        return cadena;
    }
    
    
}
