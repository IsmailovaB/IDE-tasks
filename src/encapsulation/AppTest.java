package encapsulation;

import encapsulation.App;

public class AppTest {
    public static void main(String[] args) {

        App app1 = new App("Instagram","Photo & Video", 104.3);

        app1.info();
//        app1.open();
//        app1.close();
        app1.update();
        app1.setSize(144.78);
        app1.info();
        app1.setReview("Very nice App");
        System.out.println(app1.getReview());
        app1.setReview("Cool!");
        System.out.println(app1.getReview());

    }
}
