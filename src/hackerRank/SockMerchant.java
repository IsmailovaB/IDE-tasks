package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class SockMerchant {
    public static void main(String[] args) {

    }

    static int sockMerchant(int n, int[] ar) {


        int count=0;
        for(int i: ar){
            int counter=0;
            for(int j=0; j<n; j++){
                if(i==ar[j]){
                    counter++;
                }
                if(counter>1){
                    count++;
                }
            }
        }
        return count;
    }
}
