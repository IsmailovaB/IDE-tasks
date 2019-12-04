package ReplIt;

public class UniqueNumbers {
    public static void main(String[] args) {
//        int [] arr = {5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
////        Arrays.sort(arr);
////        System.out.println(Arrays.toString(arr));
//        int count = 0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count=arr[i];
//                }
//                if(count==1) {
//                    System.out.print(arr[i]+" ");
//                }
//            }
//
//        }
        int [] nums = {5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
//       Arrays.sort(arr);
        int counter=0;
        for(int num:nums){
            counter=0;
            for(int num2:nums){
                if(num == num2){
                    counter++;
                }
            }
            if(counter == 1){
//                if(i<7) {
//                    System.out.print((nums[i] + " "));
//
//                }
//               if(i>6){
                    System.out.print((" " + num));

            }
        }
    }
}
