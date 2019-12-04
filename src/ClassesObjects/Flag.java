package ClassesObjects;

public class Flag {

    String country;
    int size;
    String color;
    String material;


    public void info(){
        System.out.println("Country: "+ country);
        System.out.println("Size: "+size);
        System.out.println("Color: "+color);
        System.out.println("Material: "+material);
        upgrade(3,"cotton");
    }

    public void flap (){
        System.out.println("Flag is flapping");
        upgrade(3,"cotton");
    }

    public void upgrade(int size, String material){
//        System.out.println("Country: "+ country);
//        System.out.println("Size: "+size);
//        System.out.println("Color: "+color);
//        System.out.println("Material: "+material);
        this.size=size;                        // reassigning size on top with size in upgrade.
        this.material=material;
    }


}
