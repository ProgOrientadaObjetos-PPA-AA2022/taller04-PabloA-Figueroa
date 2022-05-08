/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author HP
 */
public class Automotor {
    private String marca;
    private String cedula;
    private int añoF;
    private double vAuto;
    private double vMatri;
    
    
    public Automotor(String n,String c){
        marca = n;
        cedula = c;
         
    }
    public Automotor(){
        marca = "KIA";
        añoF = 2022;
        cedula = "00000000000";
        vAuto = 0;
        vMatri = 0.00;
    }
    
    public void establecerMarca(String c) {
        marca = c;
    }
    public void establecerañoF(int a) {
        añoF = a;
    }
    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerValorAuto(double va) {
        vAuto = va;
    }
    
    public void calcularValorMatricula() {
        vMatri = ((vAuto * 0.002)/100) * (2022 - añoF) ;
    }

    public String obtenerMarca() {
        return marca;      
    }
    
    public int obtenerañoF() {
        return añoF;
        
    }
    public String obtenerCedula() {
        return cedula;
    }
    
    public double obtenerValorAuto() {
        return vAuto;
    }
    
    public double ObtenerValorMatricula() {
        return vMatri;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Los datos del Automovil\n"
                + "Marca: %s\n"
                + "Cedula: %s\n"
                + "Año de Fabricacion: %s\n"
                + "Valor del automovil:%.2f\n"
                + "Valor de la matricula:%.2f\n",
                obtenerMarca(),
                obtenerCedula(),
                obtenerañoF(),
                obtenerValorAuto(),
                ObtenerValorMatricula());
        return cadena;
    }
}
