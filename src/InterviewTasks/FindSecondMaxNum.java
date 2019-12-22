package InterviewTasks;

public class FindSecondMaxNum {
    public static void main(String[] args) {
        int [] arr = {1,3,22,44,12,30,32,54,31};
        System.out.println(secondBig(arr));
    }

    public static int secondBig(int [] arr){
        int biggest = 0;
        int secondBig = 0;
        for(int i = 0; i < arr.length; i++){
           if(arr[i] > biggest){
               secondBig = biggest;
               biggest = arr[i];
           }
           if(arr[i] > secondBig && arr[i] < biggest){
               secondBig = arr[i];
           }
        }
        return secondBig;
    }
}
