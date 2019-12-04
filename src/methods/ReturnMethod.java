package methods;

import java.util.Scanner;

public class ReturnMethod {    // All the actions, codes should be inside this class!!!

    public static int getThree(){
        return 3;
    }
    public static String getDate(){
        String date = "11/3/2019";
        return date;
    }
    public static String name(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;  // After return statement the method is ends. Anything after return statement never run!
    }
    public static void main(String[] args) {
        int a = getThree()+7;
        System.out.println(a);
        System.out.println(getThree());

        String date = getDate().replace("/",".");
        System.out.println(date);

        System.out.println(name().substring(0,1));
    }
}
