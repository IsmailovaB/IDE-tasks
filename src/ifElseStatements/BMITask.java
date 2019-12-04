package ifElseStatements;

import java.util.Scanner;

public class BMITask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your mass");
        double mass = scan.nextDouble();
        System.out.println("Enter your height");
        double height = scan.nextDouble();

        Double BMI= (mass/(height*height));

        if(BMI<18.5){
            System.out.println("Underweight");
        }
        else if(BMI>=18.5&&BMI<25){
            System.out.println("Normal weight");
        }
        else if(BMI>=25&&BMI<30){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
