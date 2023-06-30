public class JuegoPPT {
    public static void main(String[] args) {
        int competidor1 = 1; // Piedra
        int competidor2 = 2; // Tijera

        if (competidor1 == competidor2) {
            System.out.println("Empate");
        } else if (competidor1 == 0 && competidor2 == 2) {
            System.out.println("Competidor 1 gana con Piedra");
        } else if (competidor1 == 1 && competidor2 == 0) {
            System.out.println("Competidor 1 gana con Papel");
        } else if (competidor1 == 2 && competidor2 == 1) {
            System.out.println("Competidor 1 gana con Tijera");
        } else {
            System.out.println("Competidor 2 gana");
        }
    }
}
