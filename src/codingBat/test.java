package codingBat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int [] n={2,3,13,3,4,13};
        System.out.println(sum13(n));
    }
    public static int sum13(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        int sum=0;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i] == 13){
                i++;
            }else {
                sum += nums[i];
            }
        }
        return sum;
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

