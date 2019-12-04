package constructors;

public class FacebookCheck {
    public static void main(String[] args) {
        FacebookUser fB = new FacebookUser("begimai", "begimai12344");
        fB.info();
        System.out.println();
        FacebookUser fB2 = new FacebookUser("adam","sdjfhdffcs","Begimai");
        fB2.info();
        System.out.println();
        FacebookUser fB3 = new FacebookUser("abcdkskf","abc1234", "John", 28, 500);
        fB3.info();

//        fB3.numOfFriends=5000;
        fB2.numOfFriends=500;
//        fB2.name="adam";
       fB2.sendFriendRequest(fB3);



    }
}
