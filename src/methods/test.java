package methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        countWord();
//        login();
       // System.out.println(isPalindrome("solos"));
//        System.out.println(resultCount("About 9,210,000 results (0.60 seconds)"));
        System.out.println(isAnagram("listen","silent"));
        // System.out.println(doesContain("asdgfqra. asdfasfg. asdmassa"));
    }


    public static void countWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to be analyzed:");
        String word = scanner.nextLine();
        String [] arr = word.trim().split(" ");
        System.out.println("Words in this string are as followed: "+ Arrays.toString(arr));
        System.out.println("The number of words in this sentence is: "+arr.length);

    }
         void methods(){
        }


    public static void login(){
        String expectedId = "johnJava";
        String expectedPassword = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have clicked to login button!");
        System.out.println("Please enter account name:");
        String acName = scanner.nextLine();
        System.out.println("Please enter a password:");
        String password = scanner.nextLine();


        if(expectedId.equalsIgnoreCase(acName) && (expectedPassword.equals(password))){
            System.out.println("Login successful");
        }

        else{
            System.out.println("Either of your data not correct.");
        }
    }

    public static boolean isPalindrome(String word){

        for (int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }


    public static String resultCount(String str,int nums){

        String [] arr = str.split(" ");
        String s =arr[1].replace(",","");

        String r = arr[arr.length-2].replace("(","")+" "+arr[arr.length-1].replace(")","");
        return r;
    }

    public static boolean doesContain(String str){
        String [] arr = str.split("\\.");
        String sen3 = arr[2];
            if(!sen3.contains("massa")){
            return  false;
        }
        else{
            return true;
        }
    }
    public static boolean isAnagram(String str1, String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        char[] arr = str1.toCharArray();       // became l,i,s,t,e,n
        char[] arr2 = str2.toCharArray();      // become s,i,l,e,n,t

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        return Arrays.equals(arr, arr2);
    }


}
