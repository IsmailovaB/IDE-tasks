package arrays;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {

//        Main m = new Main();
        ArrayList<String[]>  arr = new ArrayList<String[]>();
        arr.add(new String[]{"1","title 1","content"});
        arr.add(new String[]{"2","title 2","content"});
        arr.add(new String[]{"3","title 3","content3"});

        System.out.println(blogDb(arr,"3"));
//        System.out.print(post);
    }
    public static String blogDb(ArrayList<String[]> r, String id)  {


        for(String [] s: r){
            for(int i=0; i<s.length; i++) {
                if (s[i].equalsIgnoreCase(id)) {
                    return s[1]+s[2];

                }
            }
        }
      return null;
    }
}
