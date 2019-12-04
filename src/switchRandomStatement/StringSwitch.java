package switchRandomStatement;

public class StringSwitch {
    public static void main(String[] args) {
        String fruit = "apple";

        switch(fruit){
            case "oranges":
                System.out.println("Oranges are sweet.");
                break;
            case "apple":
            case "banana":
                System.out.println("My favorite.");
            default:
                System.out.println("Not a fruit.");
        }
    }
}
