package staticClass;

public class LexusStore {
    public static void main(String[] args) {
        Lexus lexus1 = new Lexus("Toyota XL", 2019);
        lexus1.mileage = 60000;
        Lexus.evaluateCar(lexus1);
    }
}
