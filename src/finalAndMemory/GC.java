package finalAndMemory;

public class GC {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Bag bag1 = new Bag();

        bag = bag1;

        System.out.println("Hello!");
        System.gc();
        System.out.println("End of the program");
    }
}
