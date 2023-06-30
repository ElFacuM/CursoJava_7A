public class CalculadoraSueldo {
    public static void main(String[] args) {
        String categoria = "A";
        int antiguedad = 8;
        double sueldo = 2000;

        double sueldoNeto = sueldo;

        for (int i = 1; i <= antiguedad; i++) {
            if (i >= 1 && i <= 5) {
                sueldoNeto += sueldo * 0.05;
            } else if (i >= 6 && i <= 10) {
                sueldoNeto += sueldo * 0.1;
            } else if (i > 10) {
                sueldoNeto += sueldo * 0.3;
            }
        }

        switch (categoria) {
            case "A":
                sueldoNeto += 1000;
                break;
            case "B":
                sueldoNeto += 2000;
                break;
            case "C":
                sueldoNeto += 3000;
                break;
        }

        System.out.println("Sueldo Neto: " + sueldoNeto);
    }
}
