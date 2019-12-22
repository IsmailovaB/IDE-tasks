package inheritance;

public class PetSmart {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.name = "Rex";
        husky.age = 3;
        husky.bark();
        husky.eat();
        husky.furType = "special fur";

        LabradorHusky labradorHusky = new LabradorHusky();
        labradorHusky.name = "Bingo";
        labradorHusky.bark();
        labradorHusky.eat();
}

}
