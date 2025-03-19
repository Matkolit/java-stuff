
import java.util.Scanner;

public class LargestDivisor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Wprowadź cyfrę A: ");
            int a = in.nextInt();
            System.out.print("Wprowadź cyfrę B: ");
            int b = in.nextInt();

            int LargestDivisor = a > b ? findGCD(a, b): findGCD(b, a);
            System.out.print("divisor: " + LargestDivisor);

        } catch (Exception e) {
            System.out.println("Exception" + e);
        }

    }
    private static int findGCD(int a, int b) {
        do { 
            int temp = b;
            b = a % b;
            a = temp;

        } while (b != 0);

        return a;
    }
}
