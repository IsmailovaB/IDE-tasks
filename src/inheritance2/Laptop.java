package inheritance2;

import inheritance.Lenovo;

public class Laptop {

    public String model;
    int memorySize;
    protected String color;
    public static int numOfLaptops;

    public void turnOn(){
        System.out.println("Laptop is turning On");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Laptop.numOfLaptops = 56;
        System.out.println(Laptop.numOfLaptops);


    }

}
