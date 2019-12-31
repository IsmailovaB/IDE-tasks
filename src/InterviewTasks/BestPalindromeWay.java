package InterviewTasks;

public class BestPalindromeWay {
    public static void main(String[] args) {
//        char[] c = new char[1000000];
//        c[0] = 'a';
//        String s = new String(c);
//        long start = System.currentTimeMillis();
        //System.out.println(isPalindrome(s));
        //System.out.println(isPalindromeBetterOne(s));
//        System.out.println(isPalindromeWithStringBuilder(s));
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
        System.out.println(polindromeWithNumbers(1242421));

       /*
       in order to test our Palindrome we should know as tester:

        String s = null;
        System.out.println(isPalindromeBetterOne("civic"));   true: Palindrome
        System.out.println(isPalindromeBetterOne("Civic"));   true: we should check keys sensitive (upperCase,lowerCase,ignoreCase)
        System.out.println(isPalindromeBetterOne(" civic"));  true : we should check spaces. if there is we use ".trim()" method
        System.out.println(isPalindromeBetterOne("civic1"));  false:
        System.out.println(isPalindromeBetterOne(""));        false:
        System.out.println(isPalindromeBetterOne(s));         false:

        */


    }

    static boolean isPalindromeBetterOne(String s) {
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    static boolean isPalindromeWithStringBuilder(String s) {
        StringBuilder sB = new StringBuilder(s);
        String reversed = sB.reverse().toString();
        return s.equals(reversed);

    }
//=================================================================================

    public static boolean isPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean polindromeWithNumbers(long nums) {

        long workingNum = nums;
        long reverse = 0;

        // num % 10 -> last digit of our number.

        while (workingNum != 0) {
           long last =  workingNum % 10;
            reverse = reverse * 10 + last;
            workingNum /= 10;
        }
        return nums == reverse;
    }
}



