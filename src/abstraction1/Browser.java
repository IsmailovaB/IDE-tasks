package abstraction1;

public abstract class Browser {


    String name;
    double size;
    double version;

    @Override
    public String toString(){
        return "Hello!";
    }
    public abstract void launch();

    public abstract void browse(String url);

    public abstract int getNumberOfTabs();

    public void close(){
        System.out.println("Browser is closing");
    }
}
