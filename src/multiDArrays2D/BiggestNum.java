package multiDArrays2D;

public class BiggestNum {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 2, 421, 4, 23}, {43, 32, 732, 32, 43}, {43, 435, 263, 323}};
        System.out.println(biggestNum(arr));
    }

    public static int biggestNum(int[][] arr) {
        int biggestIndex = 0;
        int big=0;
        for (int i = 0; i < arr.length; i++) {
             int sum=0;

            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
                }
                if (sum>big) {
                    big=sum;
                    biggestIndex=i;
                }
//                for(int i=0;i<arrNum.length;i++){
            }
        return biggestIndex;

    }
}
