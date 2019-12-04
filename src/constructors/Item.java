package constructors;

public class Item {

   public String name;
   public  double price;
    int size;

    public Item(String name, double price){
    this.name=name;
    this.price=price;
    }
    public Item(String name, double price, int size){
        this(name,price);                 // calling cons. in another constr. "constructor chaining".
        this.size=size;
    }

    public void info(){
        System.out.println("\nName of the item: "+name);
        System.out.println("Price is: "+price);
    }
}
