
public class BMICalculator {

    private final String name;
    private final int weight;
    private final float height;
    private double bmi;

    public BMICalculator(String n, int w, float h) {
        name = n;
        weight = w;
        height = h;
    }

    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    public boolean isOverweight() {
        return (bmi > 25);
    }

    public String getName() {
        return name;
    }

    public String getBmiCategory() {
        String[] category = {
            "wygłodzenie",
            "wychudzenie",
            "niedowaga",
            "pożądana masa ciała",
            "nadwaga",
            "otyłość I stopnia",
            "otyłość II stopnia (duża)",
            "otyłość III stopnia (chorobliwa)"
        };

        double[] scale = {16, 16.99, 18.49, 24.99, 29.99, 34.99, 39.99};
        int currentIdx = 0;

        while (currentIdx < scale.length && bmi > scale[currentIdx]) {
            currentIdx++;
        }

        System.out.println(category[currentIdx]);

        System.out.println(bmi);
        return name;
    }

    public double getBMI() {
        return bmi;
    }

} 
