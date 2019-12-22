package abstraction1;

public class Safari extends Browser {

    @Override
    public void launch() {
        System.out.println("Safari is launching");
    }

    @Override
    public void browse(String url) {
        System.out.println("Safari is browsing: "+ url);
    }

    @Override
    public int getNumberOfTabs() {
        System.out.println("Safari is getting number of tabs");
        return 7;
    }

    @Override
    public String toString() {

        return "Bye";
    }
}
