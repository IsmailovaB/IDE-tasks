package methods;

public class ArrInReturn {
    public static boolean loginMethod(String username, String password){

        String validUser = "james123";
        String validPass = "password";
        if(validUser.equals(username)&&validPass.equals(password)){
            return true;
        }
        // if condition is not true it will return false.
            return false;
    }
    public static void main(String[] args) {
        if(loginMethod("james123","password")){
            System.out.println("Logged in");
        }else{
            System.out.println("invalid credentials");
        }
    }
}
