package constructors;

public class Phone {
    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public Phone(String model, String color){
        this.model=model;
        this.color = color;
    }
    public Phone(String model2, String color2, int memory, boolean touchscreen){
        this(model2,color2);   // just calling from first construction, model and color.
//        this.model=model2;
//        this.color=color2;
        this.touchscreen=touchscreen;
        if(memory<=0){
            System.err.println("\ninvalid memory");
        }
        else{
            this.memory=memory;
        }
    }
    public void info(){
        System.out.println("\nModel: "+model);
        System.out.println("Color: "+color);
        System.out.println("Memory: "+memory);
        System.out.println("Touchscreen: "+touchscreen);
        System.out.println("Phone Number: "+phoneNumber);
    }

    public boolean text(long phoneNum, String text1){
//        String lon = phoneNumber+"";
        String lon = Long.toString(phoneNum);
        if(lon.length()==10&&!text1.isEmpty()){
            System.out.println(text1+" sent to "+phoneNum);
            return true;
        }else{
            System.out.println("Invalid Phone Number or text body.");
            return false;
        }
    }
    public void call(long phoneNumber){
//        String lon = Long.toString(phoneNumber);
        String lon = phoneNumber+"";
        if(lon.length()==10){
            System.out.println("Calling to "+phoneNumber);
        }
        else{
            System.err.println("Invalid Phone Number");
        }

    }

}
