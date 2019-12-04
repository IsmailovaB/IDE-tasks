package stringBuilder;

import org.w3c.dom.ls.LSOutput;
import utilities.MyCollection;

import java.util.ArrayList;

public class StrBuilderInsertWord {
    public static void main(String[] args) {
        ArrayList<String> sb = new ArrayList<>();
        sb.add("java");
        sb.add("abc");
        sb.add("book");
        System.out.println(insertMethod(sb));

        ArrayList<String> sb2 = new ArrayList<>();
        sb2.add("java");
        sb2.add("abc");
        sb2.add("book");
        System.out.println(insertMethod(sb2,"BYE"));

    }

    public static ArrayList<String> insertMethod(ArrayList<String> arr){

        for(int i = 0; i<arr.size(); i++){

            if(arr.get(i).length() % 2 == 0){
                StringBuilder sb = new StringBuilder(arr.get(i));
//                int half = sb.length()/2;
               sb.insert(sb.length()/2,"HELLO");
               arr.set(i,sb.toString());
            }
        }
        return arr;
    }

    public static ArrayList<String> insertMethod(ArrayList<String> arr2, String str){

        for(int i = 0; i<arr2.size(); i++) {

            if (arr2.get(i).length() % 2 == 0) {
                StringBuilder sb = new StringBuilder(arr2.get(i));
//                int half = sb.length()/2;
                sb.insert(sb.length()/2,str);
                arr2.set(i,sb.toString());
            }
        }
                return  arr2;
    }
}
