package accessModifiers;

public class Chair {
    private int size;
    public String model;

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
        else{
            System.out.println("not invalid size");
        }
    }
    public int getSize() {
        if (model.equalsIgnoreCase("IKEA")) {
            return size;
        }
       else{
            System.out.println("Sorry, it's not an IKEA");
        }
       return -1;
    }

public void info(){
    System.out.println("Model: "+model);
    System.out.println("Size: "+size);
}
}
