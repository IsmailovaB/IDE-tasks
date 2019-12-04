package ReplIt;

public class SplitMethod {
    public static void main(String[] args) {
        System.out.println(wordCount("Java is fun"));
//        Scanner input = new Scanner(System.in);
//        String email = input.nextLine();
//
//        //Write your code below
//        String [] emails = new String[email.length()];
//        emails = email.split("@");
//
//        System.out.println("email id: "+ emails[0]);
//        System.out.println("email domain: "+emails[1]);
//        for(String w: emails){
//            if(!w.equals("@")||w.contains())
//        }
    }
    public static int wordCount(String words) {

        String [] arr = new String[words.length()];
        arr = words.split(" ");
        System.out.println(arr);
        return arr.length;

    }
}
