public class Ejercicio7 {
    public static void main(String[] args) {
        int variable1 = 10;
        int variable2 = 20;
        int variable3 = 15;

        if (variable1 >= variable2 && variable1 >= variable3) {
            System.out.println("La variable de mayor valor es: " + variable1);
        } else if (variable2 >= variable1 && variable2 >= variable3) {
            System.out.println("La variable de mayor valor es: " + variable2);
        } else {
            System.out.println("La variable de mayor valor es: " + variable3);
        }
    }
}
