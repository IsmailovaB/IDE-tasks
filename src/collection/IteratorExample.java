package collection;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many number you want");
        int num = scan.nextInt();
        scan.nextLine();
        Set<Integer> numbers = new HashSet<>();

        for (int i=0; i<num; i++){
            System.out.println("Enter the num "+(i+1));
            numbers.add(scan.nextInt());
        }
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()){
            if(it.next()%2==1){
                it.remove();
            }
        }
        System.out.println(numbers);

//        Set<String> names = new HashSet<>();
//        names.add("James");
//        names.add("Adam");
//        names.add("Jason");
//        names.add("Sarah");
//        names.add("Ben");
//
//        Iterator<String> it = names.iterator();
//        it.next();
//        while (it.hasNext()){
//            String name = it.next();
//            if (name.equalsIgnoreCase("Ben")){
//                it.remove();
//            }
//        }
//        System.out.println(names);

    }
}
