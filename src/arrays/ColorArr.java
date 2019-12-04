package arrays;

public class ColorArr {
    public static void main(String[] args) {
        String [] colors = {"red","green", "orange", "blue"};
        for(int i = 0; i < colors.length; i++ ) {
            if (colors[i].length() <= 4) {
                System.out.println(colors[i]);
            }
        }
    }
}
