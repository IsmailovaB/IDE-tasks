package methods;

public class ReverseString {
    public static void main(String[] args) {
//        System.out.println(reverseString("Java"));
        System.out.println(palindrome("Java"));

    }

//    public static String reverseString(String word) {
//        String reverse = "";
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reverse += word.charAt(i);
//
//        }
//        return reverse;
//
//    }

    public static String palindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);

        }
        if (reverse.equals(word)) {
           return "Palindrome";
        }
        return "not polindrome";

    }
}
