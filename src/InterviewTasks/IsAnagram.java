package InterviewTasks;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram2("march", "charm"));

    }

    public static boolean isAnagr(String word1, String word2){
        boolean check = false;
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int counter =0;
        int counter1 =0;
        for(int i=0; i<word1.length(); i++){
            counter=0;
            for(int k=0; k<word2.length(); k++){
                if(word1.charAt(i) == word2.charAt(k) ){
                    counter++;
                }
            }
            if(counter == 1){
                counter1++;
            }
        }
        if (counter1 == word1.length() && counter1 == word2.length() ){
            check = true;
        }
        return true;
    }

//=================================================================================================================
    public  static boolean isAnagram(String a, String b) {
        int count = 0;

        int len = a.length();
        if (a.length() != b.length()) return false;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if ((a.charAt(i) + "").equalsIgnoreCase(b.charAt(j) + "")) {
                    b = b.replaceFirst(b.charAt(j) + "", " ");
                    count++;
                    break;
                }
            }
        }
        if (count == len) return true;
        else return false;
    }
    //=================================================================================

        public static boolean isAnagram2 (String str1, String str2){

            if (str1.length() != str2.length()) {
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

