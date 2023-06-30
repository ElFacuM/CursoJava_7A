import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int suma = 0;

        System.out.println("Números aleatorios:");

        while (contador < 10) {
            int numero = random.nextInt(100);
            System.out.println(numero);
            suma += numero;
            contador++;
        }

        double promedio = (double) suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
