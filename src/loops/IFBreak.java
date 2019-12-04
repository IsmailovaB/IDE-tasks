package loops;

public class IFBreak {
    public static void main(String[] args) {
        for ( int i = 0; i<=50; i++){
            if(i==20){
                i=29;
                continue; // break
            }if(i==45){
                break;
            }
            if(i%2==1){
                System.out.println(i);
            }else{
                System.out.println("Even number here ");
            }
        }
    }
}
