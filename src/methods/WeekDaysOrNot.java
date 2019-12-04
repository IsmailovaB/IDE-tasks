package methods;

public class WeekDaysOrNot {
    public static void main(String[] args) {
        System.out.println(weekDaysOrNot("monday"));
    }
    public static boolean weekDaysOrNot(String day){

        day = day.toLowerCase();
        switch (day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            return true;    // if it's weekdays it will check and return us true.

            case "saturday":
            case  "sunday":
            return false;   // if its weekends it will return false.
            default:
                System.out.println("Invalid day provided");
                return false;   // if it's not a day from week, it will give us invalid and false.
        }
    }
}
