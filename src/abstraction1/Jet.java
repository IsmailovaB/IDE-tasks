package abstraction1;

public class Jet extends Plane implements Wifi,GoodFood{
    static String name = "sdsad";

    @Override
    public boolean isEatable() {
        return false;
    }

    @Override
    public void getFood() {
        System.out.println("Jet serving good foods");
    }

    @Override
    public void takeOff(){
        System.out.println("Jet taking off");
    }

    @Override
    public void turnWiFiOn() {
        System.out.println("Jet is turning on its wifi");
    }
}
