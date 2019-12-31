package test;

public class testDuplicateString {

    public static void main(String[] args) {
        String [] arr = {"abc", "doggy", "abc", "sdga","sdfa", "abc", "doggy"};
//        duplicate(arr);
        System.out.println(duplicate(arr));
    }
    public static String duplicate(String[] arr){
        String store = "";
        int count=0;

        for (int i=0; i<arr.length; i++){
            int counter = 0;
            for (int j=0; j<arr.length; j++){
                if (arr[i].equals(arr[j])){
                    counter++;
                    if(counter > 1 && !store.contains(arr[i])){
                        count++;
                        store+=arr[i]+" ";
                    }
                }
            }
        }
        System.out.println(count);
        return store.trim();
    }
}
