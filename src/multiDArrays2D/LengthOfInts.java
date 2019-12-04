package multiDArrays2D;

import java.util.Arrays;

public class LengthOfInts {
    public static void main(String[] args) {
        int [] [] numLength =  {{4,2,3},{3232,11,13,4,2},{23,13}};
        System.out.println("Length of row 1: "+ numLength[0].length);
        System.out.println("Length of row 1: "+ numLength[1].length);
        System.out.println("Length of row 1: "+ numLength[2].length);


 //---------------------------------------------------------------------------
        String [] [] groups = new String [3][];
        String [] group1 = {"Joan","Mia","Bob","John"};
        String [] group2 = {"Joanna","Maria"};
        String [] group3 = {"Bobby","Sava", "Maria"};
         groups[0]=group1;
         groups[1]=group2;
         groups[2]=group3;
        System.out.println(Arrays.deepToString(groups));

//        for(int i=0; i<groups.length; i++){
//            groups[i]=group1;
//        }
//        System.out.println(Arrays.deepToString(groups));
    }
}
