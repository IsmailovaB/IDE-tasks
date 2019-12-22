package abstraction1;

public class Townhouse extends Home {

    @Override
    public void throwPart() {
        System.out.println(" we can throw a Party in townHouse");
    }
    @Override
    public void lock() {
        System.out.println("Locking my townHouse");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking my townHouse");
    }

    @Override
    public void cook() {
        System.out.println("In town house I cook");
    }

    public void shareWithNeighbor(){
        System.out.println("Sharing is caring ");
    }
}
