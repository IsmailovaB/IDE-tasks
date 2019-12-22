package abstraction1;

public class Apartment extends Home {

    @Override
    public void throwPart() {
        System.out.println("We cant throw party in the Apartment");
    }

    @Override
    public void lock() {
        System.out.println("Locking my apartment");
    }

    @Override
    public void unlock() {
        System.out.println("Opening my apartment");
    }

    @Override
    public void cook() {
        System.out.println("I'm cooking in my apartment");
    }
}
