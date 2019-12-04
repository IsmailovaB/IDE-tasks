package methods;

public class VoidMethodTask {
    public static void main(String[] args) {
        //   Create a method that prints “Hello” 50 times
        //    Create a method that print odd numbers up to 100.
        hello();
        System.out.println();
        oddNumbers();

    }
    public static void hello(){
        for(int i=0; i<50; i++){
            System.out.println(i+1+" Hello");
        }
    }

    public static void oddNumbers(){
        for(int i=1; i<100; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
