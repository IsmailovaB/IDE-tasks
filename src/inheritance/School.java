package inheritance;

public class School {

    String name;
    String address;
    String type;

    public void giveHW(){
        System.out.println(name+" is giving home work.");
    }
    public void hostEvent(String date){
        System.out.println(name+ " Hosting an event on "+date);
    }
}
