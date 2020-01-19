package customExceptions;

public class InvalidOsException extends Exception {

    public InvalidOsException(){
    }

    public InvalidOsException(String s){
        super(s);
    }
}
