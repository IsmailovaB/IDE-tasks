package javaTasks;

import java.util.Scanner;

public class Student {

        String firstName;
        String lastName;
        Student(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName; }
        public static void main(String[] args){
            Student student = new Student("John", "Doe");
            System.out.println(student);
        }


}
