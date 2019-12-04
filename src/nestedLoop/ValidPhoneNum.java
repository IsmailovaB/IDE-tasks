package nestedLoop;

import java.util.Scanner;

public class ValidPhoneNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        boolean validLength =false;

//        String open = phoneNum.substring(0,1);
//        String close = phoneNum.substring(4,5);
        if(number.length()==10){
            validLength = true;
        }else if(number.length()==12){
            if(number.charAt(0)=='(' && number.charAt(4)==')'){
                validLength = true;
                number = number.replace("(","").replace(")","");
            }
        }
        int count = 0;
        if(validLength) {
            for (int i = 0; i < number.length(); i++) {
                char num = number.charAt(i);
                if (num >= 48 && num <= 57) {
                    count++;
                }
            }
        }
            if(count== number.length()){
                System.out.println("Valid number");
            } else{
            System.out.println("Invalid number format");
            }
        }
    }

