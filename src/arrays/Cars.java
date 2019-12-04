package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of cars: ");
        int num = scan.nextInt();
        scan.nextLine();
        String store = "";
        String [] cars = new String[num];
        for(int i=0; i<cars.length; i++){
            System.out.println("Enter car "+ (i+1));
        String nameOfCar = scan.nextLine();
        cars[i]=nameOfCar;
        }
        System.out.println(Arrays.toString(cars));
    }
}
