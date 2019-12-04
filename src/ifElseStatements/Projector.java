package ifElseStatements;

public class Projector {
    public static void main(String[] args) {
        System.out.println("3" + 5+2); // when  string is first, it will read everything as a string. Result is "352"
        System.out.println(5/4); // 1
        System.out.println(5.0/4); // 1,25
        System.out.println('a' + 1); // ASCII table is working to find the "a". a has 97.+ 1 = 98



        if (4==5){
            System.out.println("Ok then"); // we cant see anything, because it's false.
        }
        else{
            System.out.println("Thank you");// it will run and we'll see "Thank you".
        }

        if(2>90) {
            System.out.println("Perfect");
            System.out.println("Come again");
        }
    }
}
