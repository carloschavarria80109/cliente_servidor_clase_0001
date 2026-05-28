package cr.ac.ufidelitas.class001;

/**
 *
 * @author lajch
 */
public class Equipo {

    // Atributos de la clase
    private String nombre;
    private String ciudad;
    private int fundacion;
    private String estadio;
    private int cantidadTitulos;

    // Constructor con todos los atributos
    public Equipo(String nombre, String ciudad, int fundacion, String estadio, int cantidadTitulos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.estadio = estadio;
        this.cantidadTitulos = cantidadTitulos;
    }

    // Constructor sin cantidad de titulos
    public Equipo(String nombre, String ciudad, int fundacion, String estadio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.estadio = estadio;
        this.cantidadTitulos = 0;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getCantidadTitulos() {
        return cantidadTitulos;
    }

    public void setCantidadTitulos(int cantidadTitulos) {
        this.cantidadTitulos = cantidadTitulos;
    }

    @Override
    public String toString() {
        return "Equipo{" + 
                "nombre=" + nombre + 
                ", ciudad=" + ciudad + 
                ", fundacion=" + fundacion + 
                ", estadio=" + estadio + 
                ", cantidadTitulos=" + cantidadTitulos + 
                '}';
    }
}