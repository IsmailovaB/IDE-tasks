package methods;

public class StringIntEqual {
    public static void main(String[] args) {
        matchingOrNot("Begimai",7);

    }
    public static void matchingOrNot(String str, int num){
        if(str.length()==num){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

    }
}
