package arrays;

public class ForEachLoop {
    public static void main(String[] args) {
//        int[] numbers = {3, 30, 11, 6, 51, 20};
//
// //  Traditional loop
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                System.out.println(numbers[i]);
//            }
//        }
//        System.out.println();
//
// // For each loop
//
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                System.out.println(number);
//

//            }
//        }

       String [] foods = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
       int count =0;
       for(String food: foods){
           char start = food.charAt(0);
           // if(Character.isUpperCase(start)); we can use this as well to find the uppercase letter. => method takes character.
           if(start>=65&& start<=90){
               count++;

           }
       }
        System.out.println(count);

        }
    }

