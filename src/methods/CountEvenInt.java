package methods;

public class CountEvenInt {
    public static void main(String[] args) {
        int [] arr = {2,34,5,3,4,24,0};
        System.out.println(countEvenNums(arr));

    }
    public static int countEvenNums (int[] nums){
        int count=0;
        for(int num:nums){
            if(num%2==0){
                count++;
        }
   }
        return count;
    }


}
