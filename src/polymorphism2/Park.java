package polymorphism2;


import java.util.ArrayList;

public class Park {
    public static void main(String[] args) {

        Trainable dog1 = new Alabay();
        Trainable dog2 = new Animal();
        Trainable dog3 = new Dog();
        Trainable dog4 = new GermanShepherd();

        Animal d = new Alabay();
        Dog d1 = (Dog) d;
        d1.isMale = true;
        Alabay a = (Alabay) d;
        Trainable tb = (Trainable) d;

        int age = ((Alabay)d).age;


        ArrayList<Trainable> dg = new ArrayList<>();
        dg.add(dog1);
        dg.add(dog2);
        dg.add(dog3);
        dg.add(dog4);

        for(Trainable t: dg){
            t.play();
        }



    }
}
