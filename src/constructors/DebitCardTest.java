package constructors;

public class DebitCardTest {
    public static void main(String[] args) {
        DebitCard dC = new DebitCard(1232778374813452L,"John Kim",450.99);
        dC.info();

        System.out.println();

        DebitCard dc2 = new DebitCard(1233452343L, "Karry Mills", "",1234, 1000.55);
        dc2.info();

    }
}
