package ReplIt;

public class ArmstrongNums {
    public static void main(String[] args) {
 for(int sum =1; sum<2000; sum++){
     int a = sum/100;
     int b = sum/10%10;
     int c = sum%10;
     if(sum==(a*a*a)+(b*b*b)+(c*c*c)){
         System.out.println(sum);
     }
 }

    }
}
