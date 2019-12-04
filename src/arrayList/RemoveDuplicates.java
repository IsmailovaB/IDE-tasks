package arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {




    public static ArrayList<String> removeDuplicates(ArrayList<String> word){

        for(int i=0; i<word.size(); i++) {
            int count = 0;
            for (int j = 0; j < word.size(); j++) {
                if (word.get(i).equals(word.get(j))) {
                    count++;
                    if (count > 1) {
                        word.remove(j);
                        word.remove(i);
                    }
                }
            }
        }
        return word;
        }

    public static void main(String[] args) {

        ArrayList<String> word1 = new ArrayList<>();
        word1.add("hello");
        word1.add("hi");
        word1.add("asfag");
        word1.add("hi");

        System.out.println(removeDuplicates(word1));
    }



}
