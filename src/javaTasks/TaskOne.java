package javaTasks;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        char gender = scan.nextLine().charAt(0);
        int age = scan.nextInt();
        long phoneNumber = scan.nextLong();
        double gpa = scan.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Gpa: " + gpa);


    }
}
