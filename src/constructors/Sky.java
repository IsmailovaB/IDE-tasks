package constructors;

public class Sky {
    public Sky(String colorCode){                                 // public Sky - CONSTRUCTOR.
    this.color = colorCode;

    }
    public Sky (String color, int numberStars){
        this.color = color;
        this.visibleStars = numberStars;
    }
    String color;
    int visibleStars;

    public static void main(String[] args){

        Sky sky = new Sky("Blue");// new Sky() - is an object. It should be same as Class name. Creating a new object.
        System.out.println(sky.color);                         // sky - is just a reference.

        Sky sky2 = new Sky("Red", 55);
        System.out.println(sky.color);
        System.out.println(sky.visibleStars);
    }
}
