package InterviewTasks;

public class PrintHowManyLetters {
    public static void main(String[] args) {

        String str = "java is fun";
        str = str.replaceAll(" ","");
        String s = "";
        for(int i = 0; i < str.length(); i++){
            int count=0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                s+=str.charAt(i);
            }

            System.out.print(str.charAt(i)+":"+count+" ");
        }

    }
}
