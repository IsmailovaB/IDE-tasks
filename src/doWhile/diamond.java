package doWhile;

public class diamond {
    public static void main(String[] arg) {

        for (int i = 1; i<=4;i++){
            for(int z = 4-i; z>0; z-- ){
                System.out.println(" ");
            }for(int y=1+1; y<=i*2; y++){
                System.out.println("*");
            }
            System.out.println();

        }
    }
}
