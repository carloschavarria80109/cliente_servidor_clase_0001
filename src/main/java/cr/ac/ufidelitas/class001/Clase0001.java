package cr.ac.ufidelitas.class001;

/**
 *
 * @author lajch
 */
public class Clase0001 {

    public static void main(String[] args) {

        String estadio = "Santiago Bernabeu";

        Equipo equipo1 = new Equipo("Real Madrid", "Madrid", 1902, estadio, 36);
        Equipo equipo2 = new Equipo("FC Barcelona", "Barcelona", 1899, "Camp Nou", 29);

        System.out.println("Cantidad de Titulos");
        System.out.println(equipo1.getCantidadTitulos());

        System.out.println("Cantidad de Titulos");
        System.out.println(equipo2.getCantidadTitulos());

        equipo2.setCantidadTitulos(27);

        System.out.println("Nueva cantidad de titulos del FC Barcelona");
        System.out.println(equipo2.getCantidadTitulos());

        System.out.println(equipo1.toString());
        System.out.println(equipo2.toString());
    }
}