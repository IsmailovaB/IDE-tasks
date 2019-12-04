package InterviewTasks;

public class swapString {
    public static void main(String[] args) {
//reverseString("abracadabra");
        System.out.println(isPalindrome("Nurses Run"));
    }

    //    public static void reverseString(String s) {
//        char[] arr = s.toCharArray();
//        for (int i = 0; i < s.length() / 2; i++) {
//            char temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//
//
//        }
//        String reversed = new String(arr);
//        System.out.println(arr);
//

    public static boolean isPalindrome(String check) {
        check = check.toLowerCase();
        if (check.contains(" ")) {
            check=check.replace(" ","");
        }
        for (int i =0; i<check.length()/2; i++) {

        if(check.charAt(i)!=check.charAt(check.length()-1-i)){

            return false;
        }
        }
        return true;
    }
}

