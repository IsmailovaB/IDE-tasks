package codingBat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        System.out.println(starOut("He**bhj***l*lo")
        System.out.println(oneTwo("asdnldvbjk"));
    }
        public static String oneTwo(String str) {
            String s="";
            if(str.length()<3) return "";
//            str = str.substring(1)+str.charAt(0);
            if(str.length()>=4){
                for(int i=0; i<str.length()-3; i+=3){
                    s+=str.substring(i+1,i+3)+str.substring(i);
                }
            }
            return str;
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

