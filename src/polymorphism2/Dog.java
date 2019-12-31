package polymorphism2;

public class Dog extends Animal {
int age =5;
    boolean isMale;

    public  void run(){
        System.out.println("Dog is Running");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
