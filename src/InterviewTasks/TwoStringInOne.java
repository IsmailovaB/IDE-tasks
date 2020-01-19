package InterviewTasks;

public class TwoStringInOne {
    public static void main(String[] args) {

        String word = "Java";
        String number = "1234567";
        String str = "";

        for(int i = 0; i < word.length()||i<number.length(); i++){
            if(i < word.length()){
                str+=word.charAt(i);
            }
            if(i < number.length()){
                str+=number.charAt(i);
            }
        }
        System.out.println(str);
    }
}


