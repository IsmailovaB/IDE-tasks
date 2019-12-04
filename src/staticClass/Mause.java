package staticClass;

public class Mause {
    String color;
    boolean condition;
    boolean wireless;
    int size;

    public Mause(String color, int size, boolean condition){    // initializing the value to an object.
    this.color = color;
    this.condition = true;
    this.size = size;

    }

    public Mause(){          // overloaded no argument constructor.(not default).

    }
    public static void main(String[] args) {

        Mause m1 = new Mause();
        m1.color = "White";
        Mause m2 = new Mause("Red", 55, true);
//        m2.color = "yellow";
        Mause m3 = m2;                 // we create another reference and stored m2's value in it.
        m2=m1;                         // we reassigned ref.m2 to m1. now m2 is pointing to m1 ref.
        m2.color = "Black";
        System.out.println(m1.color);
        System.out.println(m2.color);
        System.out.println(m3.color);
    }
}
