package abstraction1;

public abstract class Home {
    int numOfRooms;
    String address;
    int maxNumOfGuess;

    public abstract void throwPart();

    public abstract void lock();

    public abstract void unlock();

    public abstract void cook();

    @Override
    public String toString(){
        return "Address: "+address+" \nNumber of rooms: "+numOfRooms+" \nMaximum Guests: "+maxNumOfGuess;
    }

}
