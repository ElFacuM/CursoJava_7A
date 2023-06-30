import java.util.Random;

public class Ejercicio20 {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Números aleatorios:");

        do {
            int numero = random.nextInt(100);
            System.out.println(numero);
            
            if (numero > maximo) {
                maximo = numero;
            }
            
            if (numero < minimo) {
                minimo = numero;
            }

            contador++;
        } while (contador < 10);

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
