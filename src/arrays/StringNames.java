package arrays;

import java.util.Arrays;

public class StringNames {
    public static void main(String[] args) {
        String[] names = {"Olivia",
                "Ava",
                "Isabella",
                "Sophia",
                "Charlotte",
                "Mia",
                "Amelia",
                "Goolia",
                "Bema"};
        System.out.println("Total names: "+ names.length);   //Print total num of names:
        System.out.println(Arrays.toString(names));  // Print all names in one line:
        System.out.println();
        // Print 3 names in each row:
        for (int i =0; i<names.length; i+=3){
            System.out.println((names[i]+", "+names[i+1]+", "+names[i+2]));

        }
        //Print  Even number Names:
        System.out.println();
        for(int even=0; even<names.length; even++){
            if(even%2==0){
                System.out.print(names[even]+", ");
            }
        }
        // name.length == 4 , print names UPPERCASE:
        System.out.println();
        for (String name: names){
            if(name.length()<=4){
                System.out.print(name.toUpperCase()+" ");
            }
        }
    }
}
