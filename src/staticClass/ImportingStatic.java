package staticClass;

import static java.util.Arrays.*;   // only to when we use Class methods, ex: sort()
import java.util.*;


public class ImportingStatic {
    public static void main(String[] args) {
        int [] ar = {2,3,4,5};
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
