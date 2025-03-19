
public class Roots {

    public static void main(String args[]) {

        try {
            double a = Double.parseDouble(args[0]);
            if (a == 0) {
                System.out.println("Nieprawidłowe dane, spróbuj ponownie");
                return;
            }
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            double[] results = getRoots(a, b, c);
            String[] resultMsg = {"Liczba rzeczywistych pierwiastków: ", "x1 = ", "x2 = "};
            
            for (int i = 0; i < results.length; i++){
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
        } else {
            roots[0] = delta == 0 ? 1 : 2;
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            roots[2] = (-b + Math.sqrt(delta)) / (2 * a);
        }
        return roots;
    }
}
