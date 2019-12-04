package ClassesObjects;

public class Testing {
    public static void main(String[] args) {
        String name = "James";
        Flag f1 = new Flag();

        f1.country = "USA";                // country is instance variable.
        f1.color = "Red/White";            // color is instance variable.
        f1.size = 5;                       // size is instance var.
        f1.material = "wood";              // material is instance var.

        System.out.println(f1.country);
        f1.flap();

        System.out.println();

        Flag f2 = new Flag();
//        f2.country = "Kyrgyzstan";
//        f2.size= 15;
//        f2.color = "red and yellow";
//        f1.material = "Cotton";
       f1.info();
       f1.info();


    }
}
