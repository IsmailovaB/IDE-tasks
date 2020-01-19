package InterviewTasks;

public class RemoveCommonChar {
    public static void main(String[] args) {

        System.out.println(removeCommonChar("javape","applkejh"));
    }

    public static String  removeCommonChar(String s1, String s2) {


//        if (s1.length() < s2.length()) {
      String s = "";
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        s+=s1.charAt(i);
                    }
                }
            }
            for (int i=0; i<s.length(); i++) {
//                if (s1.contains(s.charAt(i)+"")){
                s1 = s1.replaceAll(s.charAt(i) + "", "");
                s2 = s2.replaceAll(s.charAt(i) + "", "");

                }
        return s1 + s2;
    }
}
