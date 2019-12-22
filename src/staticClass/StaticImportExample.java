package staticClass;

import utilities.MyCollection;
import static utilities.MyCollection.*;      // importing static class.

public class StaticImportExample {
    public static void main(String[] args) {
//        MyCollection.getStringList();
        getIntegerList();                   // we can use static members without calling Class name. Because we imported,and it can read from that class.

    }
}
