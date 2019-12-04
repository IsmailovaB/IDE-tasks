package nestedLoop;

import java.util.Random;

public class RanUniqueNum {
    public static void main(String[] args) {
        Random ran = new Random();

        String number = "";   // We use String because(when) we use methods. We use methods only with Strings.

            for(int i =0; i<6; i++){
                int ranNum = ran.nextInt(10);
//               if(number.contains(num+"")){
//                   num = ran.nextInt(10)+1;
        while(number.contains(ranNum +"")) {  //      (+"") - this is we converting number into String.
//            System.out.println(ranNum);
              ranNum = ran.nextInt(10);
        }
        number+=ranNum;
        }
        System.out.println(number);
    }
}
