package enums;

public class EnumDay {
    public static void main(String[] args) {
        dayOfTheWeek(Weeks.FRIDAY);
    }

    public static void dayOfTheWeek(Weeks day){
        switch (day){
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are great");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Weekends are the best");
            case TUESDAY:
            case THURSDAY:
            case WEDNESDAY:
                System.out.println("Regular day");
        }
    }
}
