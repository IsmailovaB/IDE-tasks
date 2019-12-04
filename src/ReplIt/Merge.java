package ReplIt;

public class Merge {
    public static void main(String[] args) {
        System.out.println(mergeStrings("12345","abcdesdkfnvkav"));
    }
    public static String mergeStrings(String one, String two) {
        String merge = "";
//        int leng =0;

//        if(one.length()>=two.length()){
           int leng=one.length();
//        }else{
            int leng1=two.length();
//        }
        for(int i=0; i<leng1||i<leng; i++){
            if(i<one.length()){
                merge+=one.charAt(i);
            }
            if(i<two.length()){
                merge+=two.charAt(i);
            }
        }
        return merge;
    }
}
