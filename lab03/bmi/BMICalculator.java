
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

    public double getBMI() {
        return bmi;
    }

}
