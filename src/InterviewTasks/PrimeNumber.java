package InterviewTasks;


import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {

//        System.out.println(primeNumbers(50));
        System.out.println(prime(50));
    }

//     HELPER METHOD
    public static boolean isPrime(int nums) {

        for (int i = 2; i < nums; i++) {
            if (nums % i == 0) return false;
        }
        return true;
    }

    // checking the prime number.
    public static ArrayList<Integer> primeNumbers(int num) {

        ArrayList <Integer> primes = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static String prime(int num){
        String s = "";
        for (int i = 1; i<num; i++){

            int count = 0;
            for (int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                s+=i+" ";
            }
        }
        return s.trim();
    }
}
