package abstraction1;

public class Chrome extends Browser implements Bookmark{

    @Override
    public void addUrlToBookmark(String url) {
        System.out.println(url+" added to Bookmarks");
    }
    @Override
    public void removeUrlFromBookmark(String url) {
        System.out.println(url+" removed from Bookmarks");
    }
    @Override
    public  void launch(){
        System.out.println("Chrome is launching");
    }
    @Override
    public void browse(String url){
        System.out.println("Chrome is browsing URL: "+url);
    }

    @Override
    public int getNumberOfTabs() {
        return 10;
    }
//    @Override
//    public void close(){
//        System.out.println("Browser is closing");
//    }

    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.close();
    }
}
