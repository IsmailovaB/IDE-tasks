package ReplIt;

public class fullTree {
    public static void main(String[] args) {
//        for(int i=0; i<6; i++) {
//            for (int a = 0; a < i; a++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=0; i<=6; i++){
//            for(int j =6; j>i; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        printHollowRect();
        int n = 8;

        for (int i = 2; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1 * i - 1; k++) {
                System.out.print("# ");
            }

            System.out.println();
        }


//
//        public static void printHollowRect() {
//        // your code here
////        System.out.println("1");
//        int l=0;
//     for(int i =1; i<=5;i++){
//         for(int j=0; j<i; j++){
//             System.out.print(++l+" ");
////             for (int k=j)
//         }
//         System.out.println();
//     }
//    }
//


    }
}
