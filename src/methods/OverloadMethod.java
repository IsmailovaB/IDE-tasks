package methods;

public class OverloadMethod {
    public static void main(String[] args) {
//     jump("nike");
//     jump(8);
//     jump();
//     String [] arr = {"Begimai"};
//        System.out.println(jump(arr));   // in order to see whatever in the array we should call array Arrays.toString(arr) in main method.
//
    int a=45;
    calc(a);  // comp.will look for which one is matches



    }
    public static void jump(){
        System.out.println("You don't get far");
    }
    public static void jump(int distance){
        System.out.println("You jumped "+distance);
    }
    public static void jump(String shoes) {
        System.out.println("The shoes made you go further");
    }
    public static String [] jump (String[] arr){
        return arr;           // in order to see whatever in the array we should call array Arrays.toString(arr) in main method.
    }
    //----------------------------------------------------------


    //Datatype parameters Promotion


    public static void calc(double d){
        System.out.println("using double");
    }public static void calc(float f){
        System.out.println("using float");
    }
    public static void calc(int i){
        System.out.println("using integer");
    }
    public static void calc(byte b){

    }


}
