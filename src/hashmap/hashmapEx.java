package hashmap;

import java.util.HashMap;

public class hashmapEx {
    public static void main(String[] args) {
        String s = "abrakadabra";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
//        System.out.println(map);
//
//   =======================================================
//
//        int [] arr = {2,5,2,3,4,23,1,4,3,2,3,};
//        HashMap<Integer, Integer> numbers = new HashMap<>();
//
//        for(int n: arr){
//        if(!numbers.containsKey(n)){
//            numbers.put(n,n+1);
//        }
//        else{
//            numbers.put(n, n+1);
//        }
//        }
//        System.out.println(numbers);


        int [] arr = {2,5,2,3,4,23,1,4,3,2,3,};

        String dupl = "";

        for(int i=0; i<arr.length; i++){
           int count = 0;
           for (int j=0; j<arr.length; j++){
               if(arr[i]==arr[j]){
                   count++;
                   if(count>1 && !dupl.contains(args[i])){
                       dupl+=arr[i]+" ";
                   }
               }

           }
        }
        System.out.println(dupl);

    }




}
