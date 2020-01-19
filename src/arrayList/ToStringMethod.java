package arrayList;

public class ToStringMethod {
    String name;
    public ToStringMethod(String name){
        this.name = name;
    }

    public String toString(){
        return String.format("Student name is %s",this.name);
    }
    public static void main(String[] args) {
        ToStringMethod ts = new ToStringMethod("John");
        System.out.println(ts);
        ToStringMethod ts2 = new ToStringMethod("John");
        System.out.println(ts2);
    }
}
