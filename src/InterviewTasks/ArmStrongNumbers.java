package InterviewTasks;

import inheritance2.MacBook;

public class ArmStrongNumbers {
    public static void main(String[] args) {
        System.out.println(armStrongNum(153));
    }
 public static int armStrongNum(int num){   // ex: 153

     String nums = num + "";
     int power = nums.length();

     int sum = 0;

     for (int i = 0; i < power; i++ ){
         int digit = Integer.parseInt(nums.charAt(i)+"");
         // Math.pow(digit ^ power)     ex: Math.pow(1 * 1 * 1) + Math.pow(5 * 5 * 5)  +  Math.pow(3 * 3 * 3)   sum = 153 Armstrong
         sum += Math.pow(digit, power);
     }
       return sum;
 }
    }
