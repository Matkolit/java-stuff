
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
    public String getRiskLevel() {
        double[] scale = {18.49, 24.99, 29.99, 34.99, 39.99};

        String[] riskLevels = {
            "minimalne, ale zwiększony poziom wystąpenia innych problemów zdrowotnych",
            "minimalne",
            "średnie",
            "wysokie",
            "bardzo wysokie",
            "ekstremalny poziom ryzyka"
        };

        return riskLevels[getColumnIndex(scale)];
    }

    public String getName() {
        return name;
    }

    public String getBmiCategory() {
        double[] scale = {16, 16.99, 18.49, 24.99, 29.99, 34.99, 39.99};

        String[] categories = {
            "wygłodzenie",
            "wychudzenie",
            "niedowaga",
            "pożądana masa ciała",
            "nadwaga",
            "otyłość I stopnia",
            "otyłość II stopnia (duża)",
            "otyłość III stopnia (chorobliwa)"
        };
        return categories[getColumnIndex(scale)];
    }

    public double getBMI() {
        return bmi;
    }

    private int getColumnIndex(double[] scale) {

        int currentIdx = 0;
        while (currentIdx < scale.length && bmi > scale[currentIdx]) {
            currentIdx++;
        }
        return currentIdx;
    }
}
