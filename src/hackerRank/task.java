package hackerRank;

public class task {
    public static void main(String[] args) {
        System.out.println(repeatedString("av",10047095L));
        int n = 55543;
        short num = (short) n;


    }


    public static long repeatedString(String s, long n) {
        long result = 0;
        String str = "";
        for (int i = 0;; i++) {

            str += s.charAt(i)+"";
           if (i == s.length() - 1) {
                i=i-s.length();

            }
           if(str.length()==n){
               break;
           }
        }
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'a') {
                result++;
            }
        }
        return result;
    }
}
