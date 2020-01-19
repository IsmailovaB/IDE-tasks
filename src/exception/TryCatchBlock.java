package exception;

public class TryCatchBlock {
    public static void main(String[] args) {


        try {
            String s = "hello";
            System.out.println(s.charAt(30));
            System.out.println(3/0);
            System.out.println(new int []{3,45,3}[5]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index does not exist");
        }catch (ArithmeticException e){
            System.out.println("Invalid math");
        }catch (Exception e){
            System.out.println("Unknown Exception");
            System.out.println(e.toString());
        }
        System.out.println("End");
    }
}
