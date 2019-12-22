package multiDArrays2D;

import org.w3c.dom.ls.LSOutput;

public class Nums {
    public static void main(String[] args) {

        int[][] numbers = {
                {62, 45, 23, 44, 23},  // 1-row, 5 columns
                {33, 44, 12, 345, 76}, // 2-row  5 elements
                {23, 34, 88, 67, 45},  //3-row   5 elements
                {55, 65, 34, 90, 99}   //4-row   5 elements
        };
        //   in order to find number 62
        System.out.println(numbers[0][0]);
    }
}
