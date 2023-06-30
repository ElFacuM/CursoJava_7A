public class JuegoPPT {
    public static void main(String[] args) {
        int competidor1 = 1; // Piedra
        int competidor2 = 2; // Tijera

        if ((competidor1 == 0 && competidor2 == 2) || (competidor1 == 1 && competidor2 == 0) || (competidor1 == 2 && competidor2 == 1)) {
            System.out.println("Competidor 1 es el ganador");
        } else if ((competidor2 == 0 && competidor1 == 2) || (competidor2 == 1 && competidor1 == 0) || (competidor2 == 2 && competidor1 == 1)) {
            System.out.println("Competidor 2 es el ganador");
        } else {
            System.out.println("Empate");
        }
    }
}
