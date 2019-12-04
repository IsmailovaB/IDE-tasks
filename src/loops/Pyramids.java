package loops;

public class Pyramids {
    public static void main(String[] args) {
//         String pyramid= "*";
//         int num = 1;
//         while (num<=10) {
//             System.out.println(pyramid);
//             pyramid+="*";
//             num++;
//         }
//        System.out.println();
//         pyramid = "*";
//
//         while (pyramid.length()<=10){
//             System.out.println(pyramid);
//             pyramid+="*";

                int star = 4;

                for(int i=1; i<=star; i++){
                    for(int a=0; a<i;a++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i=star-1; i>0; i--){
                    for(int j=0; j<i; j++){
                        System.out.print("*");
                    }
                    System.out.println();


                }

            }
        }








