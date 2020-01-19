package exception;

import ClassesObjects.Dog;

public class ThrowsException {
    public static void main(String[] args) throws Exception {

        Dog d = new Dog();
        try {
            d.setAge(5);
        }catch (Exception e ){
            e.printStackTrace();
        }
        System.out.println(d.age);
//        Dog.bark();
//        System.out.println("5");
    }
}
