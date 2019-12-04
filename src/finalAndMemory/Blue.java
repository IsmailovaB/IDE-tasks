package finalAndMemory;

public class Blue {
    final String name = "Jason";           // it's unchangeable. We can't change it anymore.

    public static void main(String[] args) {
        final int k;
        System.out.println("Program");
        k=23;
        System.out.println(k);
       // k = 32;                          // we can't reassign because we gave final value already.

        Blue b = new Blue();
        System.out.println(b.name);
       // b.name = "Mark";                 // we can't change the name because we gave final value already to instance var.
    }
}
