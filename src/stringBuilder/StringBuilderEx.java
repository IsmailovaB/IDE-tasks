package stringBuilder;

public class StringBuilderEx {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("James");
//        sb.append(" Bond");                  //    concatenating the value.
//        sb.append(4);
//        System.out.println(sb);

        //===============================================================

        StringBuilder sb = new StringBuilder("Car");
        sb.deleteCharAt(1);    //  output:   Cr
        System.out.println(sb);
        sb.reverse();          // output: rC
        sb.delete(0,1);        // output: C   because it will delete only 0 index. 1 is not inclusive.
        System.out.println(sb);

        //===============================================================
    }
}
