package stringBuilder;

public class StringBuilderTasks {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Civic"));
        System.out.println(deleteWord("I want to concat."));
        System.out.println(deleteWord("I want to concat the word","to"));

    }
    //        Create a static method isPalindrome. Method takes a String and check if the String is palindrome or not.
    //        Return true if it is palindrome and false if it is not. Use StringBuilder.

    public static boolean isPalindrome(String str){

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equalsIgnoreCase(sb.toString())){
            return true;
        }
        return false;
    }

    public static String deleteWord(String str){

        StringBuilder sb = new StringBuilder(str);
        int index = sb.indexOf("con");
        if(index>=0) {
            sb.delete(index,index+3);
        }
        return sb.toString();
    }

    public static String deleteWord(String str, String str2){

        StringBuilder sb = new StringBuilder(str);
        int index = sb.indexOf(str2);
        if(index>=0){
            sb.delete(index,index+str2.length());
        }
        return sb.toString();
    }
}
