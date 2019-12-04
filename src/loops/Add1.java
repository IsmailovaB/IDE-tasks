package loops;

public class Add1 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int num = 0;
//        System.out.println("Would you like to add 1?");
//        String n = scan.nextLine();
//
//        while(n.equalsIgnoreCase("yes")||n.equalsIgnoreCase("y")) {
//            num++;
//            System.out.println("Would you like to add 1?");
//            n = scan.nextLine();
//        }
//        System.out.println("Your number is: "+ num);
//        System.out.println("Enter word:");

//
//        String str1 = input.next();
//        int len =str1.length();
//        int num =0;
//        if(str1.length()<3||str1.length()>100){
//            System.out.println("Invalid enter");
//        }if(str1.length()>=3&&str1.length()<=100) {
//            for(int i=0; i<str1.length(); i++){
//                str1=str1.substring();
//                if (str1.charAt(i)>=48&& str1.charAt(i)<=57) {
//                    num++;
//                }
//                    System.out.print(num);
//                }
//                }
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//
//        String answer = "";
//        do{
//            System.out.println("Enter a number:");
//            int num = input.nextInt();
//            if(num==0){
//                zero++;
//            }else if(num>0){
//                positive++;
//            }else if(num<0){
//                negative++;
//            }
//            System.out.println("Do you want to continue? ");
//
//            String answer1 = input.nextLine();
//
//        }while(answer.equals("yes"));
//
//
//        System.out.println("Positive numbers: "+positive);
//        System.out.println("Negative numbers: "+ negative);
//        System.out.println("Zero numbers: "+ zero);

        for(int i =0; i<3; i++){
            for(char letter = 'A'; letter<='Z'; letter++){
                System.out.print(letter+ " ");
            }
            System.out.println();
        }

        for (int i =0; i<52; i++) {
            System.out.print("*");
        }
    }
}
