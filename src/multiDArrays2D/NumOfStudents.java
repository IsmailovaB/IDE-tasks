package multiDArrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class NumOfStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many groups do you have?");
        int groups = scanner.nextInt();
        scanner.nextLine();

        String[][] allGroup = new String[groups][];
        for (int i = 0; i < allGroup.length; i++) {
            System.out.println("Enter the number of students in group: "+(i+1));
            int students = scanner.nextInt();
            scanner.nextLine();

            String [] group = new String[students];
            for (int j = 0; j < group.length; j++) {
                System.out.println("Enter the name of student: "+(j+1));
                group[j] = scanner.nextLine();

            }
            allGroup[i]=group;
        }
        System.out.println(Arrays.deepToString(allGroup));
    }
}
