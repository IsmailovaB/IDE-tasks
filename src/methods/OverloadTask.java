package methods;

public class OverloadTask {
    public static void main(String[] args) {
//        System.out.println(twoWords("day","name"));
//        System.out.println(twoWords("day","name",0));
        System.out.println(firstBeginsWithSecond("JavaFun","java"));
        System.out.println(firstBeginsWithSecond("Djamesjail","ja",2));
    }
    public static String twoWords(String word1,String word2){
//        String result = word1+word2+word1;
        return word1+word2+word1;
    }


    public static String twoWords(String w1,String w2,int num){

//       Only neew this condition with substring. to check if num is 0 or negative.
//        if(num<=0){
//            return "";
//        }

        String r = "";
        for(int i=0; i<num; i++){
            r+=w1;
            if(i==num-1){
                break;
            }
            r+=w2;

        }
        return r;

//        return r.substring(0,r.length()-w2.length());        <- String example.
    }



    public static boolean firstBeginsWithSecond(String word1,String word2){

            return word1.toLowerCase().startsWith(word2.toLowerCase());
    }



    public static boolean firstBeginsWithSecond(String word1,String word2, int num) {

        int count=0;
        for (int i = 0; i < word1.length()-word2.length()+1; i++) {    // +1 i in order to include the last character.
            String sub = word1.substring(i,i+word2.length());          // each time it will check from i to word2 length.

            System.out.println(sub);
            if(sub.equals(word2)){        // and in each iteration if sub equals to word2 it will count.
                count++;
            }
        }
        if(count==num) {                   // and if count is equals to num it means it's TRUE.
            return true;

        } return  false;
    }




}
