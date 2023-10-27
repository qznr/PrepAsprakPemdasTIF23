package Praktikum;
import java.util.Scanner;

public class BMIIndex {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("BMI Calculator");
        System.out.print("Input your weight (kg)\t: "); double weight = in.nextDouble();
        System.out.print("Input your height (m)\t: "); double height = in.nextDouble();
        double BMI = weight/Math.pow(height,2);
        String weightClass = "";
        if (BMI <= 18.5) {
            weightClass = "Underweight";
        } else if (18.5 < BMI && BMI <= 25) {
            weightClass = "Normal";
        } else if (25 < BMI && BMI <= 30) {
            weightClass = "Overweight";
        } else if (BMI > 30) {
            weightClass = "Very Overweight";
        } 
        System.out.printf("BMI = %-8.2f(%s)\n-----------------------------\n",BMI,weightClass);
    }
}
