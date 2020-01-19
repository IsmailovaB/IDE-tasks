package exception;



import java.sql.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {

      ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
      for ( ; ;){
          try{
              System.out.println("Enter a number");
              numbers.add(scanner.nextInt());
          }catch (InputMismatchException e){
            break;
          }
      }
        System.out.println(numbers);
    }
}
