package polymorphism;

public class Aeron extends Chair  implements Rollable{

    @Override
    public void sit() {
        System.out.println("Sitting on Aeron Chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on Aeron chair");
    }

    @Override
    public void rollForward() {
        System.out.println("Aeron is rolling forward");
    }

    @Override
    public void rollBack() {
        System.out.println("Aeron is rolling Back");
    }

    @Override
    public void changeColor(String color) {
        System.out.println("Aeron chair is changing its color to: "+color);
    }
}
