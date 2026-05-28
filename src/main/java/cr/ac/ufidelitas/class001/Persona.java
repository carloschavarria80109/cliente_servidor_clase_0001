/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.class001;

/** Clase Persona
 ** Carlos Chavarria Jimenez
 * @author lajch
 */
public class Persona {
    
    private int idPersona;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "La Persona{" + "idPersona=" + idPersona + 
                ", nombre=" + nombre + 
                ", primerApellido=" + primerApellido + 
                ", segundoApellido=" + segundoApellido + 
                ", edad=" + edad + '}';
    }
    
    
    
    
    
    
    
}
