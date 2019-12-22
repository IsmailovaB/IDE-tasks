package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class CarType {
    public static void main(String[] args) {

//        String[] cars = {"mercedes", "bmw", "toyota", "ferrari"};
//        for (int i = 0; i < cars.length; i++) {
//            if (cars[i].equalsIgnoreCase("Mercedes")) {
//                System.out.println(cars[i] + ": Luxury-Comfort");
//            } else if (cars[i].equalsIgnoreCase("bmw")) {
//                System.out.println(cars[i] + ": Luxury-Sport");
//            } else if (cars[i].equalsIgnoreCase("toyota")) {
//                System.out.println(cars[i] + ": Reliable-Cheap");
//            } else if (cars[i].equalsIgnoreCase("ferrari")) {
//                System.out.println(cars[i] + ": Super car-Super expensive");
//            }
//            Arrays.sort(cars);
//        }

        //   BinarySearch
//
//        String [] groceryList = {"apple", "carrot", "orange", "cherry", "strawberry"};
//        Arrays.sort(groceryList);
//        System.out.println("Index number of apple is: "+Arrays.binarySearch(groceryList,"apple"));      // output will be 0
//        System.out.println("Index number of cherry is: "+Arrays.binarySearch(groceryList, "cherry"));   // output will 2

        //-----------------------------------------------------


        int [] [] numbers = {
                {44,62,12,51,33},
                {33,66,54,12,25},
                {65,78,56,42,22},
                {14,12,15,16,14}};

        for(int row = 0; row<numbers.length; row++){
            for (int col=0; col<numbers[row].length; col++){
                System.out.print(numbers[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
