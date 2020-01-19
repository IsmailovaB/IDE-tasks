package collection;

import staticClass.Lexus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("Bmw");
        cars.add("Lexus");
        cars.add("Bmw");
        cars.add("Toyota");

        System.out.println(cars);
        System.out.println(cars.get(1));
//        Iterator<String> it = cars.iterator();

//        System.out.println(cars);
    }
}
