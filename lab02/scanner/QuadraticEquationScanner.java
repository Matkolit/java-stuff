
import java.util.Scanner;

public class QuadraticEquationScanner {

    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("\nRozwiązywanie równania kwadratowego.");

            String[] values = {"a", "b", "c"};
            double[] coefficients = new double[3];

            for (int i = 0; i < values.length; i++) {  
                System.out.print("\n Podaj " + values[i] + " = ");
                coefficients[i] = in.nextDouble();
            }

            double a = coefficients[0];
            double b = coefficients[1];
            double c = coefficients[2];

            double[] results = getRoots(a, b, c);
            String[] resultMsg = {"Liczba rzeczywistych pierwiastków: ", "x1 = ", "x2 = "};

            for (int i = 0; i < results.length; i++) {
                System.out.println(resultMsg[i] + Math.round(results[i]));
            }
        } catch (NumberFormatException e) {
            System.out.println("Wyjątek:" + e.getMessage());
        }
    }

    public static double[] getRoots(double a, double b, double c) {
        double[] roots = new double[3];
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            roots[0] = 0;
            throw new Error("Liczba jest ujemna");
        } else {
            roots[0] = delta == 0 ? 1 : 2;
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            roots[2] = (-b + Math.sqrt(delta)) / (2 * a);
        }
        return roots;
    }
}
