public class EvaluacionesAlumno {
    public static void main(String[] args) {
        int evaluacion1 = 8;
        int evaluacion2 = 6;
        int evaluacion3 = 9;

        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3.0;

        String estado = (promedio >= 7) ? "Aprobado" : "Reprobado";
        System.out.println(estado);

        int sumaPares = ((evaluacion1 % 2 == 0) ? evaluacion1 : 0) +
                        ((evaluacion2 % 2 == 0) ? evaluacion2 : 0) +
                        ((evaluacion3 % 2 == 0) ? evaluacion3 : 0);
        System.out.println("Suma de los valores pares: " + sumaPares);
    }
}
