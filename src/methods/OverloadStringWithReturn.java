package methods;

public class OverloadStringWithReturn {
    public static void main(String[] args) {
        System.out.println(firstChar("java"));
        System.out.println(firstChar("word",2));
        System.out.println(firstChar("Begimai",0,2));
    }
    public static char firstChar(String str) {

        return str.charAt(0);
    }
    public static char firstChar(String str, int index){

        return str.charAt(index);
    }
    public static int firstChar(String str, int num1, int num2){
        str=str.substring(num1,num2);
        return str.length();
    }
}
