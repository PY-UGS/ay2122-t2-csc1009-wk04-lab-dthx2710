import java.util.*;

public class BMIMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        BMI bmiTest = new BMI(weight, height);
        System.out.println("BMI is: " + bmiTest.calcBMI());
        System.out.println(bmiTest.getBMI());
    }
}
