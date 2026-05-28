/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.class001;

/**
 *
 * @author lajch
 */
public class Recibo {
  // Atributos
    private int numeroRecibo;
    private String nombre;
    private float monto;

    public Recibo(int numeroRecibo, String nombre, float monto) {
        this.numeroRecibo = numeroRecibo;
        this.nombre = nombre;
        this.monto = monto;
    }

    public int getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(int numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
        
        
        
    }

    @Override
    public String toString() {
        return "Recibo{" + "numeroRecibo=" + numeroRecibo + ", nombre=" + nombre + ", monto=" + monto + '}';
    }

   
    
}