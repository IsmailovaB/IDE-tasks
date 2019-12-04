package loops;

import java.util.Scanner;

public class HelloBye {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       for(; ;) {
          String userInput = scan.nextLine();

          if(userInput.equalsIgnoreCase("hi")) {
              System.out.println("Hello");
          }else if (userInput.equalsIgnoreCase("bye")){
              System.out.println("Good Bye!");
          }else{
              break;
          }

       }
    }
}
