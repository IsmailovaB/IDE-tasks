package loops;

public class TreeCm {
    public static void main(String[] args) {
        int add = 0;
        for (int i = 1; i <= 3; i++) {
            add++;
            System.out.println("year " + i + " - growth 1 cm");
            System.out.println("tree size: " + i + "cm");
        }
        for (int j = 4; j <= 10; j++) {
            add = add + 2;
            System.out.println("year " + j + " - growth 2 cm");
            System.out.println("tree size: " + add + "cm");

        }
    }
}
