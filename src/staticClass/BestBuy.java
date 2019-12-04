package staticClass;

public class BestBuy {
    String location;
   static int numOfComputers;        // static variables always belong to the Class, not to Objects. all the Objects will share same static vars.
   static String day;

    static{
        numOfComputers=50;
        System.out.println("running first");  // Always run first!!!
        day="Tuesday";
    }

    static {
        System.out.println("running second");
        numOfComputers=100;
        if(day.equals("Monday")){
            numOfComputers=90;
        }
        else{
            numOfComputers=50;
        }
    }
public BestBuy(String location){
    this.location=location;
}
public void info(){
    System.out.println(location+" has "+numOfComputers+" computers on "+day);
}

}
