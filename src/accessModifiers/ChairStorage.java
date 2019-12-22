package accessModifiers;

public class ChairStorage {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.model = "Home Depot";
        chair.setSize(45);
        System.out.println(chair.getSize());

//        chair.info();
    }
}
