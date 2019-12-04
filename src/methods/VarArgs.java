package methods;

public class VarArgs {
    public static void main(String[] args) {
        int[]arr={2,4,5,2,5};      // it will add 2+4+2=8.
        System.out.println((addNumbers(arr)));
        System.out.println(addNumbers(arr,2));
    }


    public static int addNumbers(int[] num) {

        int count=0;
        for (int nums:num) {
            String s = nums+"";         //Arrays making String numbers.
            if (s.endsWith("5")) {
              continue;
            }
            count+=nums;
//            if(nums%10==5){
//                count+=nums;         // another way
//            }
        }
        return count;
    }
//--------------------------------------------------------------------
    public static int addNumbers(int [] arr, int num){
        int sum=0;

        for (int nums:arr) {
            String s = nums + "";         //Arrays making String numbers.
            if (!s.endsWith(num + "")) {
                sum += nums;
            }

        }
        return sum;
    }
}
