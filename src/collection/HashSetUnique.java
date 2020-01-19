package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetUnique {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("John","James","John");
        Set<String> set = new HashSet<>(list);

        System.out.printf("Size of List is %s, size of set is %s, is list unique: %s ", list.size(), set.size(), list.size()==set.size()
        );

        String s = String.format("\n%s\n%s\n%s", list.get(0),list.get(1),list.get(2));
        System.out.println(s);
     }
}
