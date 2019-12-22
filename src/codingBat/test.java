package codingBat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        System.out.println(starOut("He**bhj***l*lo"));
       int [] make = {4, 5} ;
        int [] make1 = {1, 2, 3};
        System.out.println(Arrays.toString(make2(make, make1)));
    }


    public static int[] make2(int[] a, int[] b) {
        int [] nums = new int [2];
        int min=nums[0];
        int max=nums[0];
        for(int i=0; i<a.length+b.length; i++){
            if(min>nums[i]){
                min = nums[i];
            }
            if(max<nums[i]){
                max = nums[i];
            }
        }
        nums[0] = min;
        nums[1] = max;
        return nums;
    }


//             if (str.charAt(i) == '*') {
//                 continue;
//             }
//             if (str.charAt(i + 1) == '*') {
//                 continue;
//             }


//             s += str.charAt(i);

         }

//          s+=str.substring(0,)
//            int i = 0;
//            i = str.indexOf("*");
//            int j=0;
//            j = str.lastIndexOf("*");
////            str = str.replaceAll("*","");
//            s+=str.substring(0,i-1)+str.substring(j+2);
////            s+=str.replace("*","");
//        }
        // }
//        return s;

