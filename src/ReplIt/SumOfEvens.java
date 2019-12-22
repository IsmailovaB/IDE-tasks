package ReplIt;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfEvens {
    public static void main(String[] args) {

//        int sum = 0;
//       for(int i = 2; i<=20; i=i+2) {
//          sum+=i;
//            while (i % 2 == 0) {
//
//                break;
//            }
//
//        } System.out.println(sum);
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));


        removeAll(wordList,"hi");

    }
    public static void removeAll(ArrayList<String> wordList, String targetWord){

        for(int i=0; i<wordList.size(); i++){
            if(wordList.get(i).equals(targetWord)){
                wordList.remove(targetWord);
                i--;
            }
        }
        System.out.println(wordList);
    }
}
