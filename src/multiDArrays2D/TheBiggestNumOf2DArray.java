package multiDArrays2D;

public class TheBiggestNumOf2DArray {
    public static void main(String[] args) {
        int [][] arr = {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};
        biggestNum(arr);
    }
    public static void biggestNum(int [][] arr){

        int max=0;
        for(int [] big : arr){
            for(int biggest: big){
                if(biggest>max){
                    max+=biggest;
                }
            }
        }
        System.out.println(max);
    }

    //--------------------------------------------------------------------
}
