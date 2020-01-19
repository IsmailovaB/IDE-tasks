package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set <String> cars = new HashSet<String>();
        cars.add("Bmw");
        cars.add("Lexus");
        cars.add("Bmw");
        cars.add("Toyota");
        cars.add("Tesla");

        System.out.println(cars);
        System.out.println(cars);

        List<String> list = new ArrayList<>(cars);
        System.out.println(list.get(1));


    }
}
