public class Ejercicio17 {
    public static void main(String[] args) {
        int evaluacion1 = 8;
        int evaluacion2 = 6;
        int evaluacion3 = 9;

        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3.0;

        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        int sumaPares = 0;

        if (evaluacion1 % 2 == 0) {
            sumaPares += evaluacion1;
        }
        if (evaluacion2 % 2 == 0) {
            sumaPares += evaluacion2;
        }
        if (evaluacion3 % 2 == 0) {
            sumaPares += evaluacion3;
        }

        System.out.println("Suma de los valores pares: " + sumaPares);
    }
}
