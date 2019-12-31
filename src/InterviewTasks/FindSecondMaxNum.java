package InterviewTasks;

public class FindSecondMaxNum {
    public static void main(String[] args) {
        int [] arr = {1,3,22,100, 22,44,87,12,30,32,54,31};
        System.out.println(secondBig(arr));
    }

    public static int secondBig(int [] arr){

        int firstMax=arr[0];
        int secondMax = arr[0];

        for(int i=0; i<arr.length; i++){

            if(arr[i]>firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            if(arr[i]>secondMax && arr[i] < firstMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
