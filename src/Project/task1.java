package Project;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
//        System.out.println(isAnagram("dvdf","vddf"));
//        System.out.println(Arrays.toString(extractNum("^234sdf842)")));
//       int [] arr ={3, 6, 1, 8, 9, 9, 10, 10, 10};
//        System.out.println(Arrays.toString(arr));
        System.out.println(lameDb("1etsy#2wooden#3spoon","delete","1","aaa"));
    }

//        public static int[] extractNum(String str){
//
//        String nums="";
//            for(int i=0; i<str.length(); i++){
//                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
//                    nums+=str.charAt(i)+"";
//                }
//            }
////            System.out.println((nums));
//            String [] arr = nums.split("");
//            int[] numArr = new int [arr.length];
//            for (int i=0; i<arr.length; i++){
//                numArr[i]=Integer.parseInt(arr[i]);
//            }
//
//        return numArr;
//    }
//public static boolean isAnagram(String word1, String word2){
//    boolean check = true;
//    String one = "";
//    String two = "";
//    String [] arr1 = word1.toLowerCase().split("");
//    Arrays.sort(arr1);
//    System.out.println(Arrays.toString(arr1));
//    String [] arr2 = word2.toLowerCase().split("");
//    Arrays.sort(arr2);
//    System.out.println(Arrays.toString(arr2));
////    for(int i=0; i<word1.length(); i++){
////        one += arr1[i];
////    }
////    for(int k=0; k<word2.length(); k++){
////        two += arr2[k];
////    }
////    if (one.toLowerCase().equals(two.toLowerCase())){
////        check = true;
////    }
////    for(int i=0; i<word1.length(); i++){
////
////    }
//return true;
//}

    public static String lameDb(String db, String op, String id, String data){
      String [] arr = db.split("#");
//      String word="";
      switch (op){
          case "add":
              return db+"#"+id+data;

          case "edit":
              int id1 = Integer.valueOf(id);
              for(int i=0; i<arr.length;i++){

              if(db.contains(id)) {
                  arr[id1-1] = id+data;
              }
              }

              String word ="";
              for(int k=0; k<arr.length; k++){
                  word+=arr[k]+"#";
              }
              return word.substring(0,word.length()-1);

          case "delete":

              for(int i=0; i<arr.length; i++){
                  if(arr[i].contains(id)){
                      arr[i]="";
                  }
              }

              String word2 ="";
              for(int k=0; k<arr.length; k++){
                  word2+=arr[k]+"#";
              }
              return word2.substring(0,word2.length()-1);
          case "none":
              return Arrays.toString(arr);
          default:
              return "";
      }


    }
}
