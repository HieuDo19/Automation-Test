package lab_02;

import java.util.Scanner;

public class Lab02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the weight (kg): ");
        float weight = scanner.nextFloat();
        System.out.print("Please enter the height (m): ");
        float height = scanner.nextFloat();
        float BMI = weight/(height*height);
        final float MIN_WEIGHT = 18.5f*height*height;
        final float MAX_WEIGHT = 24.9f*height*height;
        if (BMI < 18.5) {
            System.out.println("Underweight");
            System.out.printf("You need increase %f kg", MIN_WEIGHT - weight);
        } else if (BMI <= 24.9) {
            System.out.println("Normal weight");
            System.out.println("You are perfect");
        } else if ( BMI <= 29.9) {
            System.out.println("Overweight");
            System.out.printf("You need decrease %f kg", MAX_WEIGHT - weight);
        } else {
            System.out.println("Obesity");
            System.out.printf("You need decrease %f kg", MAX_WEIGHT - weight);
        }
    }
}
