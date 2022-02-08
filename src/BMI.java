import static java.lang.Math.*;

public class BMI {
    private double height;
    private double weight;

    public BMI(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calcBMI(){
        double weightKg = this.weight * 0.45359237;
        double heightM = this.height * 0.0254;
        double BMI = weightKg/pow(heightM,2);
        return BMI;
    }

    public String getBMI(){
        String bmiString;
        if (calcBMI() >= 30.0){
            bmiString = "Obese";
        }
        else if (calcBMI() >= 25.0){
            bmiString = "Overweight";
        }
        else if (calcBMI() >= 18.5){
            bmiString = "Normal";
        }
        else{
            bmiString = "Underweight";
        }
        return bmiString;
    }
}
