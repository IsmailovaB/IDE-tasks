package methods;

public class DataTransfer {
    public static void main(String[] args) {
//        printName("James");
//        printName("John");
//        goTo("London","China");
          makeEmail("begimai","ismailova", 29);
    }
    public static void printName(String name){
        System.out.println(name);
        firstChar(name);   // write the first char of each word.
    }


    public static void firstChar(String name){
        System.out.println(name.charAt(0));
    }
    public static void goTo(String origin, String newLocation){
        System.out.println("You start from "+ origin);
        System.out.println("And you're going to "+newLocation);
    }
    public static void makeEmail(String firstName, String lastName, int age){
        String email = firstName+age+lastName+"@cybertek.com";
        System.out.println(email);
    }
}
