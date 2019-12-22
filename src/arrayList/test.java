package arrayList;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
List<Integer> nums = new ArrayList<>();
         nums.add(4);
        nums.add(1);
        nums.add(5);
        nums.add(6);
        System.out.println(two2(nums));
    }
        public static List<Integer> two2(List<Integer> nums) {
            List<Integer> multiply = new ArrayList<>();
            for(int i = 0; i<nums.size(); i++){
                if((nums.get(i)*2)%10 == 2){
                    nums.remove(i);
                    i--;
                }
                else{
                    multiply.add(nums.get(i)*2);
                }
            }
            return multiply;
        }
    }

