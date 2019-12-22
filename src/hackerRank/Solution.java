package hackerRank;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line

                    for(int k=0; k<18-x; k++){
                        System.out.println(s1+"           "+x);

                }
                System.out.println();
            }
            System.out.println("================================");

        }

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String str = "";
        if(s.toUpperCase().substring(s.length()-2).equals("PM")){
            String [] arr = s.split(":");
            for(int i = 0, j=1; i<12; i++,j++){
                if(arr[0].equals(i+"")){
                    str+="0"+j;
                }
            }
        }
       return str;
    }




    }

