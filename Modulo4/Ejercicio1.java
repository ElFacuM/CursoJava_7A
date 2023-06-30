public class EvaluacionesAlumno {
    public static void main(String[] args) {
        double evaluacion1 = 6.5;
        double evaluacion2 = 7.8;
        double evaluacion3 = 8.2;

        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}