package customExceptions;

public class Store {
    public static void main(String[] args){

        Laptop laptop = new Laptop();


        try {
            laptop.setOs("Ma");
            laptop.turnOn();
        } catch (InvalidOsException | LaptopNotTurningOnException e) {
            e.printStackTrace();
        }finally {
            System.out.println(laptop.turnOn());
            System.out.println(laptop.getOs());
        }
    }
}
