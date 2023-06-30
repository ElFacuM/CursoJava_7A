public class Ejercicio3 {
    public static void main(String[] args) {
        String nombreMes = "noviembre";

        int cantidadDias;

        if (nombreMes.equals("febrero")) {
            cantidadDias = 28;
        } else if (nombreMes.equals("abril") || nombreMes.equals("junio") || nombreMes.equals("septiembre") || nombreMes.equals("noviembre")) {
            cantidadDias = 30;
        } else {
            cantidadDias = 31;
        }

        System.out.println(nombreMes + " tiene " + cantidadDias + " días.");
    }
}
