package polymorphism;

import java.util.ArrayList;

public class TestingChair {
    public static void main(String[] args) {

        Chair ch1 = new HumanScale();
        Chair ch2 = new Aeron();
        ch1.color = "red";
        ch2.color = "Grey";
//        ch1.sit();
        ArrayList<Chair> types = new ArrayList<>();
        types.add(ch1);
        types.add(ch2);
        for(Chair ch: types){
            ch.sit();
            ch.stepOnIt();
            ch.changeColor("Red");
        }

        Rollable rb1 = new HumanScale();
        Rollable rb2 = new Aeron();

    }
}
