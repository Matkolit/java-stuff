
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        MyData.info();

        try {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("\nPodaj imię: ");
                String name = sc.nextLine();

                System.out.print("Podaj wzrost(m): ");
                float height = Float.parseFloat(sc.nextLine());

                System.out.print("Podaj masę(kg): ");
                int weight = Integer.parseInt(sc.nextLine());

                BMICalculator calc1 = new BMICalculator(name, weight, height);

                calc1.calculateBMI();

                System.out.print(calc1.getName() + " - twoje BMI: ");
                System.out.format("%.2f\n", calc1.getBMI());
                System.out.println("Kategoria wagowa: " + calc1.getBmiCategory());
                System.out.println("Ryzyko zachorowań: " + calc1.getRiskLevel());

                System.out.print("\nPodaj imię: ");
                name = sc.nextLine();
                System.out.print("Podaj wzrost(m): ");
                height = Float.parseFloat(sc.nextLine());
                System.out.print("Podaj masę(kg): ");
                weight = Integer.parseInt(sc.nextLine());

                BMICalculator calc2 = new BMICalculator(name, weight, height);
                calc2.calculateBMI();

                System.out.print(calc2.getName() + " - twoje BMI: ");
                System.out.format("%.2f\n", calc2.getBMI());
                System.out.println("Kategoria wagowa: " + calc2.getBmiCategory());
                System.out.println("Ryzyko zachorowań: " + calc2.getRiskLevel());
            }

        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
