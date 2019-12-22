package accessModifiers;

import ClassesObjects.Author;
import ClassesObjects.Author.*;

public class Person {
//    Create a class Person. 
//    create instance variables for Person as below:  name, gender, age, height, weight 
//    2. Encapsulate all instance variables. 
//    Modify setter methods for gender, age, height and weight. 
//    Set age only with valid age. Valid age must be between 0 to 120. If invalid age print “invalid age” and don’t set. 
//    Set gender with valid gender. It must be either male or female. Otherwise give proper message and don’t set the invalid gender.
//    Both hight and weight should be positive values. Otherwise give proper message. 


    private String name;          // not gonna change the value, and not gonna have an access
    private char gender;
    private int age;
    private double height;
    private double weight;


    public  void setName(String name){
        this.name = name;
    }
    public void setGender(char gender){
        if(gender =='F' || gender == 'M'){
            this.gender = gender;
        }else{
            System.out.println("Invalid gender");
        }
    }
    public void setAge(int age){
        if(age > 0 && age <= 120){
            this.age = age;
        }
        else{
            System.out.println("Invalid age");
        }
    }
    public void setHeight(double height){
        if(height>0){
            this.height = height;
        }
        else {
            System.out.println("Invalid height");
        }
    }
    public void setWeight(double weight){
        if(weight > 0){
            this.weight = weight;
        }else{
            System.out.println("Invalid weight");
        }
    }

    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }



}
