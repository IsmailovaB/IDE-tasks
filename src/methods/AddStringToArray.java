package methods;

import java.util.Arrays;

public class AddStringToArray {
    public static void main(String[] args) {
        AddNumsToString.addNums("345676",2);
        String[] arr = {"a", "e", "i", "o"};
//        System.out.println(Arrays.toString(increaseArray(arr, "u")));
//        System.out.println(Arrays.toString(increaseArrayWithClass(arr, "u")));

        System.out.println(Arrays.toString(increaseArray(arr,"b",1)));   // in new array the word "b" will take position 1.
    }

    public static String[] increaseArray(String[] arr, String word, int position) {
        String[] newAr = new String[arr.length + 1];

        for (int i = 0, j = 0; j < newAr.length; j++) {
            if (position == j) {       //this 'if' will check new arr position, and when our position equal to 'j'(newarray),
                                       // it will put our word'b' into position .
                newAr[j] = word;
            } else {
                newAr[j] = arr[i];
                i++;
            }
        }

        return newAr;
    }

    public static String[] increaseArrayWithClass(String[] arr, String word) {
        String[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = word;
        return newArr;
    }

//    public static String[] increaseArray(String[] arr, String word) {
//        String[] newArr = new String[arr.length + 1];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//        newArr[newArr.length - 1] = word;
//        return newArr;
//    }
}