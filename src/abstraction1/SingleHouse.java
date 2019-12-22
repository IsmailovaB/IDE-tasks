package abstraction1;

public class SingleHouse extends Home {

    String garageType;


    @Override
    public void throwPart() {
        System.out.println("Can't have throw Party");
    }

    @Override
    public void lock() {
        System.out.println("Locking singleHouse");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking singleHouse");
    }

    @Override
    public void cook() {
        System.out.println("we can cook in Single House");
    }

    public void cutGrass(){
        System.out.println("Cutting grasses in singleHouse");
    }

    public void shovelSnow(){
        System.out.println("Shoveling Snow in SingleHouse");
    }
    @Override
    public String toString(){
    String result = super.toString()+"\n"+garageType;
        return result;
    }
}
