package arrayList;

import java.util.ArrayList;

public class Speaker {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Adam");
//        names.add("Jason");
//        names.add(0, "Kate");
//        System.out.println(names);
//        System.out.println(names.get(1));
//        names.remove(2);           // removing index 2.
//        System.out.println(names);

        //  How to use List for any Objects.
        ArrayList<Cat>catsForSale = new ArrayList<>();
        Cat cat1 = new Cat();
        cat1.color = "White";
        cat1.age = 3;
        catsForSale.add(cat1);


        Cat cat2 = new Cat();
        cat2.color = "Black";
        cat2.age = 2;
        catsForSale.add(cat2);

        System.out.println(catsForSale.size());  //  the size of ArrayList  : 2
        System.out.println();


//        for(Cat check: catsForSale){
//            System.out.print(check.color+" cat, age:");
//            System.out.println(check.age);
//        }

        for(int i=0; i<catsForSale.size(); i++){
            System.out.println("\nCat #"+(i+1));
            System.out.println("Color: "+catsForSale.get(i).color);
            System.out.println("Age: "+catsForSale.get(i).age);
        }

    }
}
