package methods;

public class TasksMentors {

    public static void main(String[] args) {
        int result = calculatAge(2020);
        System.out.println("You are "+result+" years old");
    }
    public static int calculatAge(int year){
      int currentYear = 2019;
      int age = currentYear-year;
      if(age<0){
          System.out.println("invalid age");
          return 0;
      } else if(age>=1&&age<=14){
            System.out.println("child");
        }else if(age>=15&&age<=25){
            System.out.println("Youngster");
        }else if(age>=26&&age<=64){
            System.out.println("adult");
        }else if(age>65){
            System.out.println("senior");
        }
        return age;
    }
}
