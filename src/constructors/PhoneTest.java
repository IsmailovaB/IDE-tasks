package constructors;

public class PhoneTest {
    public static void main(String[] args) {
        Phone ph = new Phone("Iphone11", "white");
        ph.info();
        ph.memory=45;
        ph.info();
        Phone ph2 = new Phone("Samsung", "red", 128, true);
        ph2.info();
        System.out.println("--------------");
        ph.text(9134565467L, "Hello there!");
//        System.out.println(result);
        ph2.call(1234556677);
//        System.out.println(ph.model+"\n"+ph.color);
//        System.out.println("\n"+ph2.memory);
    }
}
