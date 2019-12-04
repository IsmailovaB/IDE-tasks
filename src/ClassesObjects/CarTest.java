package ClassesObjects;

public class CarTest {
    public static void main(String[] args) {
        Car test1 = new Car();
        test1.make = "Toyota";      // assignment for instance variable make.
        test1.mileage = 10000;
        test1.sportEdition = false;
        test1.year = 2019;

        System.out.println(test1.mileage);

        test1.drive();
        test1.drive("New York");
        System.out.println(test1.mileage);
        test1.drive(50);
        System.out.println(test1.mileage);

    }
}
