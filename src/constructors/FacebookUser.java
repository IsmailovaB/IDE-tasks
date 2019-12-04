package constructors;

public class FacebookUser {
    String userName;
    String password;
    String name;
    int age;
    int numOfFriends;


    public FacebookUser(String userName,String password){
        this.userName=userName;

        if(password.toLowerCase().contains(userName)){
            System.out.println("Password contained username. Default password created: ");
            this.password="password";
        }else{
            this.password=password;
        }
    }
    public FacebookUser(String userName,String password, String name){
        this(userName,password);
//        int leng = name.length();
        name=name.replace(" ","");
        boolean valid=true;
        for(int i=0; i<name.length();i++) {
            if (!Character.isLetter(name.charAt(i))) {
                valid = false;
                break;
            }
            else{
                System.out.println("Invalid name");
                this.name="no name";
                break;
            }
        }
        if(valid) {
            this.name = name;
        }
        }

    public FacebookUser(String userName,String password, String name,int age, int numOfFriends){
        this(userName,password,name);
        if(age<0){
            System.out.println("Invalid age");
        }
        else{
            this.age=age;
        }
        if(numOfFriends<0||numOfFriends>5000){
            System.out.println("Invalid number of friends");
        }
        else{
            this.numOfFriends=numOfFriends;
        }
    }

    public void info(){
        System.out.println("Username: "+userName);
        System.out.println("password "+password);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Number of friends: "+numOfFriends);
    }

    public boolean sendFriendRequest(FacebookUser userTwo){
        if(this.numOfFriends>=5000){
            System.out.println(this.name+" reached the limit");
            return false;
        }else if(userTwo.numOfFriends>=5000){
            System.out.println(userTwo.name+" "+userTwo.age+" has reached the limit of friends");
            return false;
        }
        else{
            System.out.println("Request sent");
            this.numOfFriends++;
            userTwo.numOfFriends++;
            return true;
        }
    }
}
