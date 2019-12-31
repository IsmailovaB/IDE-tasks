package abstraction1;

public interface Wifi {
String name = "sd";
 void turnWiFiOn();

 public static void fiveG(){
     System.out.println("It has 5G");
 }

 public default void getAlt(){

 }

}
