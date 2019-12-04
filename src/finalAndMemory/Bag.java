package finalAndMemory;

public class Bag {

    final String color;               // final has to happen when we declaring.
    final int size;
    final static int totalBag;

    static {
        totalBag = 45;
    }

    {
        size = 4;                       // this block is for instance initializer.(Initializer Block).
                                        // Whu we use it?  - We could be running few diff. codes to get a value to initialize.
                                        // instance initializer block we can write any code. But we can't write any code at instance variable.
    }

   public Bag (){
       this.color = "red";
   }
   public Bag(String color){
       this.color = color;
   }

    public static void main(String[] args) {
        Bag b = new Bag("Red");
        System.out.println(b.color);

        /**
         * two different Bag objects can have different final variables(value),
         * but once it is initialized then value cannot be changed.
         *
         * Option1. Initialize it rightaway. Give the value when declaring the instance variable.
         * Option2. Initialize it within the constructor.Because instance var. cannot be used without creating an object.
         * Option3. Instance Initializer. it is used to initialize instance variables. It is same as static block but it's for non-static variables.
         * Instance initializer block gets executed right before constructor..
         */
        Bag b2 = new Bag("Black");
        System.out.println(b2.color);
    }
}
