package Strings;

public class not {
    public static void main(String[] args) {
        String word = "Today is a nice day";

        boolean b = word.startsWith("Today");
        System.out.println(b);

        System.out.println(!word.startsWith("day"));  // answer is gonna be true because it starts with "Today"
        System.out.println(!word.endsWith("day"));
    }
}
