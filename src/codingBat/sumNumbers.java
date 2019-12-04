package codingBat;

public class sumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("sdf45h64s"));
    }
    public static int sumNumbers(String str) {
        int sum = 0;
        out: for(int i=0; i < str.length(); i++){

            if(Character.isDigit(str.charAt(i))) {
                String temp = "";
                temp += str.charAt(i);
                for(int j = i+1; j < str.length(); j++) {
                    if(Character.isDigit(str.charAt(j))) {
                        if(j == str.length()-1) {
                            // break out;
                            i = j+1;
                        }
                        temp += str.charAt(j);
                    } else {
                        i = j;
                        break;
                    }

                }

                sum += Integer.valueOf(temp);
            }


        }
        return sum;
    }
}
