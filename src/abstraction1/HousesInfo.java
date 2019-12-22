package abstraction1;

public class HousesInfo {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();


//        Townhouse townhouse = new Townhouse();
//        townhouse.address = "501 E.Cicero 4565";
//        townhouse.maxNumOfGuess = 120;
//        townhouse.numOfRooms = 4;
//        townhouse.shareWithNeighbor();

        SingleHouse sh = new SingleHouse();
        sh.garageType = "Ceramic";
        sh.address = "4321 N Addison, IL";
        sh.numOfRooms = 3;
        sh.maxNumOfGuess = 10;
        sh.cook();
        sh.cutGrass();
        System.out.println(sh);
    }
}
