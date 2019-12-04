package Project;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }


        // days i use for counting days
        //sumOfPpl = used for counting sumOfPpl.

        int day=0;
        int sumOfPpl =0;

        int [] nextDay = Arrays.copyOf(inhabitants, inhabitants.length);
        System.out.println("Day "+ day+" "+ Arrays.toString(inhabitants));

        do{
            day++;
            sumOfPpl=0;

            for (int i =0; i<inhabitants.length; i++) {
                if (i != 0 &&i!=inhabitants.length-1&&inhabitants[i]==0){
                    nextDay[i-1]=inhabitants[i-1]/2;
                    nextDay[i+1]=inhabitants[i+1]/2;
                }
                if(i==0&&inhabitants[i]==0){
                    nextDay[i+1]=inhabitants[i+1]/2;
                }
                if(i==inhabitants.length-1&&inhabitants[i]==0){
                    nextDay[i-1]=inhabitants[i-1]/2;
                }
            }
            System.out.println("Day "+ day+" "+ Arrays.toString(nextDay));

            for (int i =0; i<inhabitants.length; i++){
                inhabitants[i]=nextDay[i];
                sumOfPpl+=inhabitants[i];
            }

        }while (sumOfPpl!=0);
        System.out.println("-------Exit-----");
    }
}
