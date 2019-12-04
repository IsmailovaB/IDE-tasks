package ClassesObjects;

import java.util.Scanner;

public class House {
    String type;
    String address;
    int numRooms;

    public void info(){
        System.out.println("Type of the house is: "+this.type+"\nAddress is:  "+this.address+"\nNumber of rooms: "+this.numRooms);
    }

    public static void main(String[] args) {
        House test=new House();

        Scanner scan = new Scanner(System.in);
        test.type = scan.nextLine();
        test.address = scan.nextLine();
        test.numRooms = scan.nextInt();


        test.info();
    }

}
