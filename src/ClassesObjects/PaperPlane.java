package ClassesObjects;

public class PaperPlane {
    public static void main(String[] args) {


        Flag f1 = new Flag();
        f1.color = "Red and Yellow";
        f1.material = "cotton";
        f1.size = 5;
        f1.country = "Kyrgyzstan";


        Flag f2 = new Flag();
        f2.color = f1.color;
        f2.material = f1.material;
        f2.size = f1.size;
        f2.country = f1.country;

        f1.color = "a";
        f1.material = "a";
        f1.size = 0;
        f1.country = "a";

        f1.info();
        System.out.println();
        f2.info();
        System.out.println();

        f1.upgrade(225,"Gold");
        f1.info();
        System.out.println();
        f2.upgrade(123, "diamond");
        f2.info();
    }
}
