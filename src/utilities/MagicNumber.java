package utilities;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {

    ArrayList<Integer> numbers = new ArrayList<>();

    Random ran = new Random();
    public void generateNumbers(int size){
        numbers.clear();
        for (int i=0; i<size; i++) {
//            int num = ran.nextInt(1000);
            this.numbers.add(ran.nextInt(1000));
        }
//        System.out.println(numbers);
    }

    public void generateEvens(int evens){
        numbers.clear();
        while(true){                        // infinite loop.

         int num = ran.nextInt(100);
                if (num % 2 == 0) {
                    this.numbers.add(num);
            }
                if(numbers.size()==evens){   // when it reachs the evens number 5 it will break the loop.
                    break;
                }
        }
    }
    public static void main(String[] args) {
        MagicNumber m = new MagicNumber();
        m.generateNumbers(10);
        System.out.println(m.numbers);
        m.generateEvens(8);
        System.out.println(m.numbers);
    }
}
