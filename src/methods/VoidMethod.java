package methods;

public class VoidMethod {
    public static void main(String[] args) {
        sayHello(); // calling the void method in main method.
                    // And do the action whatever inside the void method.
        sayBye();  // then it will come here and do the action whatever inside the void sayBye method.
        sayHello();
    }
    public static void sayHello(){
        for(int i=0; i<5; i++){
            System.out.println("Hello");
        }
        sayBye();//
    }

    public static void sayBye(){
        System.out.println("Bye");
    }

}
