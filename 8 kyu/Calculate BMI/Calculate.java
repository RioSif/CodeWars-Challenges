public class Calculate {
    public static String bmi(double weight, double height) {
        String result = "";
        double bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);

        if (bmi <= 18.5) {
            result = "Underweight";
        } else if (bmi <= 25.0) {
            result = "Normal";
        } else if (bmi <= 30.0) {
            result = "Overweight";
        } else if (bmi > 30) {
            result = "Obese";
        }

        return result;
    }
}