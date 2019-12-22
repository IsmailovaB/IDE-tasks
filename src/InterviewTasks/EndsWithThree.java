package InterviewTasks;

public class EndsWithThree {
    public static void main(String[] args) {
        int[] arr= {13,34,44,13,23,43};
        System.out.println(endsWithThree(arr));
    }

    public static String endsWithThree(int [] arr){
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 3) {
                str += arr[i] + " ";
            }
        }
        return str.trim();
    }
}
