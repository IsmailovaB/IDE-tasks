package multiDArrays2D;

public class ForEachMultiD {
    public static void main(String[] args) {
        int [] [] nums = {{1,2,3},{3,4,5},{6,7,8},{9,10}};

        for(int [] inner: nums){             // it gonna read each array(index) 4 arrays
            for(int element: inner){         // it will read us each element in each array. each array has 3 elements in it.
                System.out.print(element);
            }
            System.out.println();
//            break;
        }
    }
}
