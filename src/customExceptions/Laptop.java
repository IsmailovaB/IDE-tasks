package customExceptions;

import java.util.Random;

public class Laptop {
     private String os;

     public boolean turnOn(){
         Random ran = new Random();
         int num = ran.nextInt(11);
         System.out.println(num);
         if(num >= 8){
            throw new LaptopNotTurningOnException();
            // laptop doesn't turn on
         }
          return true;
     }

    public String getOs() {
        return os;
    }

    public void setOs(String os) throws InvalidOsException {
        switch (os.toLowerCase()){
            case "windows":
            case "linux":
            case "mac":
                this.os = os;
                break;
            default:
                throw new InvalidOsException(os+" is an Invalid Os");
        }

    }
}
