package ReplIt;

public class SumOfEvens {
    public static void main(String[] args) {

        int sum = 0;
       for(int i = 2; i<=20; i=i+2) {
          sum+=i;
            while (i % 2 == 0) {

                break;
            }

        } System.out.println(sum);
    }
}
