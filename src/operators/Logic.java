package operators;

public class Logic {
    public static void main(String[] args) {
        System.out.println(5 > 4);
        System.out.println(4 < 3);
        System.out.println(6>4 && 4<5);
        System.out.println(3< 2 || false);
        boolean b = 5>1 && 6>3; // && needs to be all true if we want to see true. If there is one false it will read false.
        boolean d = 3<2 || 4>2; // || at least one true should be in order to get true.
        System.out.println(b);
        System.out.println(d);

    }
}
