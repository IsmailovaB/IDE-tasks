package polymorphism;

public class HumanScale extends Chair  implements Rollable, Collapsible{

    @Override
    public void sit() {
        System.out.println("Sitting on Human Scale chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on HumanScale chair");
    }

    @Override
    public void lock() {
        System.out.println("Humanscale chair is locked");
    }

    @Override
    public void unlock() {
        System.out.println("HumanScale chair is unlock");
    }

    @Override
    public void fold() {
        System.out.println("HumanScale chair is folding");
    }

    @Override
    public void unfold() {
        System.out.println("HumanScale chair is unfolding");
    }

    @Override
    public void rollForward() {
        System.out.println("HumanScale chair is rolling forward");
    }

    @Override
    public void rollBack() {
        System.out.println("HumanScale chair is rolling back");
    }
}
