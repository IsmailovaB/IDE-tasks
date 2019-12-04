package methods;

public class HourMinBoolean {
    public static void main(String[] args) {
      amPm(0,45,false);

    }
    public static void amPm (int hour,int min, boolean amOrPm){

    if((hour>=1&&hour<=12)&&(min>=1&&min<60)){
        String date = hour+" : "+min;
                if(amOrPm){
                    date+=" AM";
                }else{
                    date+=" PM";
                }
        System.out.println(date);
    }else{
        System.out.println("Invalid time information given");
    }
    }
}
