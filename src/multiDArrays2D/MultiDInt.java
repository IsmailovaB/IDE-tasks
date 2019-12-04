package multiDArrays2D;

public class MultiDInt {
    public static void main(String[] args) {
        int [] [] nums = {{1,2,3},{3,4,5},{6,7,8},{9,10}};
//        System.out.println(Arrays.toString(nums[0]));   // it will give us only first array   output: [1,2,3]
//        System.out.println(nums[0][0]);                 // it will give us first element of first array(index) output: 1
//        System.out.println(nums[0][0]+" "+nums[0][2]);   // it will give first element of first index(array) and last element of first array  output: 1 3
//        System.out.println(nums[3].length);              // it will give length of last array  output: 2
//

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j]);

            }
            System.out.println();
        }
    }
}
