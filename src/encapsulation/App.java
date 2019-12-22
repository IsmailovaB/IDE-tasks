package encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

   private String name;
   private String category;
   private double rating;
   private String description;
   private double size;
   private ArrayList<String> review;
   private static int numberOfApps;

    public App(String name, String category, double size){
        this.review = new ArrayList<>();                       // ArrayList object is gonna created when Object created only.
        this.name = name;
        this.category = category;
        this.size = size;
        numberOfApps++;
    }
    public App(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public ArrayList<String> getReview() {
        return review;
    }
    public void setReview(ArrayList<String> review) {
        this.review = review;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
    public double getRating(){
        return rating;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public int getNumberOfApps(){
        return numberOfApps;
    }


public void open(){
    System.out.println(name+ " is opening");
}
public void close(){
    System.out.println(name+ " is closing");
}
public void update(){
    System.out.println(name+ " is updated");
}


public void info(){
    System.out.println("\nName of App is: "+name);
    System.out.println("Category is: "+category);
    System.out.println("Rating: "+rating);
    System.out.println("Description: "+description);
    System.out.println("Size: "+size);
}

//    Modify method setReview. Method should accept String message.
//    Method adds review to the list of reviews if message is at least 3 letters and prints success message.
//    If message less than 3 letters then it should NOT add the review and should print failure message.

public void setReview(String message){
        if(message.length()>=3){
            review.add(message);
            System.out.println("Your review is added. Thank you.");
        }
        else {
            System.out.println("Sorry message is failed. Too short.");
        }
}






}
