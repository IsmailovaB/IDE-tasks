package polymorphism;

public interface WiFi {
String name = "WiFi";
   public abstract void wifisearch();

    static void n(){
        System.out.println("abvc");
    }

    default int m(int n){
        return n;
    }
}
