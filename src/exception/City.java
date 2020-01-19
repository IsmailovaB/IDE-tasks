package exception;

import java.util.InputMismatchException;

public class City {

    public static void main(String[] args) {
        Driver driver = new Driver();
        try {
            driver.setAge(19);
            driver.setName("James");
            driver.setLocation("vsfk78");
        }catch (InvalidNameException | InvalidLocationException | InvalidAgeException e){
            e.printStackTrace();
        }finally {
            System.out.println(driver.getAge());
            System.out.println(driver.getName());
            System.out.println(driver.getLocation());
        }
    }
}
