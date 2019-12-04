package utilities;

import java.util.ArrayList;     // utility is a tool, that makes our life easy. It's our library. We can create our own utility.
import java.util.Scanner;

public class MyCollection {
    public static void main(String[] args) {

//        System.out.println(getStringList());
//        System.out.println(getIntegerList());
        ArrayList<String> words = new ArrayList<>();
        words.add("sdgedb");
        words.add("sdgb");
        words.add("sdgedb");
        words.add("sddbe");
        words.add("gedb");
        words.add("sdgedb");
//        filterList(words,7);
        ArrayList<String> str = MyCollection.removeDuplicates(words);
        System.out.println(str);
//        ArrayList<String> arr = filterList(words,5);
//        System.out.println(arr);
//

    }

    /**
     * This method creates List of String from the User.
     * Method doesn't take anything. It uses Scanner to fill the list
     * @return  ArrayList of String.
     */
    public static ArrayList<String> getStringList() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        String answer = "";
        do {
            System.out.println("Please enter your String");
//            String word = scan.nextLine();
            strings.add(scan.nextLine());
            System.out.println("Do you want to enter more? Y/N");
            answer = scan.nextLine();

        } while (answer.equalsIgnoreCase("y"));

        return strings;
    }
//==============================================================================

    /**
     * This method creates List of Integer from the User.
     * Method doesn't take anything. It uses Scanner to fill the List.
     * @return ArrayList of Integer.
     */
    public static ArrayList<Integer> getIntegerList(){
        Scanner scan = new Scanner(System.in);
       ArrayList<Integer> numbers = new ArrayList<>();
       String answer = "";

       do{
           System.out.println("Please enter your Integer");
           int num = scan.nextInt();
           numbers.add(num);
           scan.nextLine();
           System.out.println("Do you want to enter more? Y/N");
           answer = scan.nextLine();

       }while(answer.equalsIgnoreCase("y"));

       return numbers;
    }
 //=============================================================================

public static ArrayList<String> filterList(ArrayList<String> words, int num){
        ArrayList<String> newArr = new ArrayList<>();
        for(String s: words){
            if(s.length()==num){
                newArr.add(s);
            }
        }
//        for(int i=0; i<words.size(); i++){
//            if(words.get(i).length()==num){
//                newArr.add(words.get(i));
//            }
//        }
    return newArr;
}
//==============================================================================

    /**
     * This method creates List of String. It removes duplicates.
     * @param word
     * @return ArrayList of String with unique Strings.
     */
    public static ArrayList<String> removeDuplicates(ArrayList<String> word){

        ArrayList<String> newWords = new ArrayList<>();
        for(String str: word){
            if(newWords.contains(str)){
                continue;
            }
            newWords.add(str);
        }
//        for(int i=0; i<word.size(); i++){
//            int count =0;
//           for(int j=0; j<word.size(); j++ ){
//               if(word.get(i).equalsIgnoreCase(word.get(j))){
//                   count++;
//                   if(count>=2){
//                       word.remove(j);
//                       word.remove(i);
//                   }
//               }
//           }
//        }
        return newWords;
    }
}
