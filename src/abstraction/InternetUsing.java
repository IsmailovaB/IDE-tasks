package abstraction;

import java.awt.image.CropImageFilter;

public class InternetUsing {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.version  = 65.7;
        chrome.launch();
        chrome.browse("www.stackoverflow.com");
//        chrome.addTab("www.cybertekschool.com");

        System.out.println();
        Firefox firefox = new Firefox();
        firefox.launch();
        firefox.browse("www.stackoverflow.com");

    }
}
