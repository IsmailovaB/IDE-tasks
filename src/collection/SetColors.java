package collection;

import java.util.*;

public class SetColors {
    public static void main(String[] args) {

        Set<String> color1 = new HashSet<>();
        Collections.addAll(color1,"red","blue","green","white");
        Set<String> color2 = new HashSet<>();
        Collections.addAll(color2, "red","yellow","white","pink");

        String same = "";
       for (String color: color1){
           if (color2.contains(color)){
               same+=color+" ";
           }
       }
        System.out.println(same);
        System.out.println(color1);
        System.out.println(color2);
    }
}
