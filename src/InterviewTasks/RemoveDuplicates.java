package InterviewTasks;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {3,23,2,23,23,3,3,6,5,2,1,2,4,2,3,4,1};
//        System.out.println(Arrays.toString(removeDuplicate(arr)));
//        System.out.println(Arrays.toString(removeDuplicat(arr)));
        removeDupl(arr);
    }
    public static int[] removeDuplicate(int[] arr) {
     int n = 0;
        int s=arr.length;

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=0;
                    n++;
                }
            }
        }
        System.out.println(n);
        int [] nArr = new int[n];
        for(int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                nArr[i] = arr[i];
            }
        }
        return nArr;
    }

    public static int[] removeDuplicat(int[] arr){

        String s2 = "";
        for(int i = 0; i< arr.length; i++){
            if(!s2.contains(arr[i]+""))
            s2+= arr[i]+" ";
        }
        String[] arrS = s2.split(" ");
        int[] nArr = new int[arrS.length];
        for (int i=0; i<arrS.length; i++) {
            nArr[i] = Integer.parseInt(arrS[i] + "");
        }
        return nArr;
    }
    public static void removeDupl(int [] arr){
        ArrayList<Integer> arrnum = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arrnum.contains(arr[i])){
                continue;
            }
            arrnum.add(arr[i]);
        }
        System.out.println(arrnum);
    }
//==============================================================

    public static  int[] removeDuplicates(int ... arr) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!numbers.contains(arr[i])) {
                numbers.add(arr[i]);
            }
        }
        int[] nums = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            nums[i] = numbers.get(i);
        }
        return nums;
    }
}
