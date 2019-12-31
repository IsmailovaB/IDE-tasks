package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

//        String [] arr = {"dog","cAT", "cow"};
        ArrayList <Integer> arrayList = new ArrayList<>();
                arrayList.add(23);
                arrayList.add(3);
                 arrayList.add(43);
                  arrayList.add(2);
                    arrayList.add(450);
                   arrayList.add(409);
                   arrayList.add(345004);
                   arrayList.add(2303);
        removeZero(arrayList);

    }
   public static void removeZero(ArrayList<Integer> arr){

      for (int i = 0; i<arr.size(); i++){
          String s = arr.get(i)+"";
          if(s.contains("0")) {
              s = s.replaceAll("0", "");
              int num = Integer.parseInt(s);
              arr.set(i,num);
          }

      }
       System.out.println(arr);

   }
}
