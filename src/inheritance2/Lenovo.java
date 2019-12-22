package inheritance2;

public class Lenovo extends Laptop{

    @Override
    public void turnOn(){
        System.out.println(this.model+" is turning on in Lenovo class");
    }
}
