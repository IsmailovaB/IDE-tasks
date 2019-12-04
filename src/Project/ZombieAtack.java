package Project;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAtack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        // Take every number from the array and divide by 2, and store some index

        int day=0;
        int sumOffPeople=0;

        do{
            day++;
            sumOffPeople=0;
            for(int i=0; i<inhabitants.length; i++){
                inhabitants[i]=inhabitants[i]/2;
                sumOffPeople+=inhabitants[i];
            }
            System.out.println("Day "+day+" "+ Arrays.toString(inhabitants));

        }while (sumOffPeople!=0);
        System.out.println("------Exit-----");






//        for (int i = 0; i < inhabitants.length; i++) {
//            inhabitants[i] = input.nextInt();
//        }
//        for (int i = 0; i < inhabitants.length; i++) {
//            while (inhabitants[i] > 0) {
//                for (int j = 0; j < inhabitants.length; j++) {
//                    if (inhabitants[j] == 0) {
//                        if (j == 0) {
//                            inhabitants[j + 1] = inhabitants[j + 1] / 2;
//                        } else if (j == inhabitants.length - 1) {
//                            inhabitants[j - 1] = inhabitants[j - 1] / 2;
//                        } else {
//                            inhabitants[j + 1] = inhabitants[j + 1] / 2;
//                            inhabitants[j - 1] = inhabitants[j - 1] / 2;
//                        }
//
//                        System.out.println(Arrays.toString(inhabitants));
//                    }
//                }
//            }
//        }
    }
}