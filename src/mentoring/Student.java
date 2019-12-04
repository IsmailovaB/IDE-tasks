package mentoring;

public class Student {

    String firstName;
    String lastName;
    int age;
    boolean isActive;

    public Student(String firstName, String lastName, int age, boolean isActive){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isActive = isActive;
    }
    public String toString(){
        return firstName+" "+lastName+" "+age+" "+isActive;
    }
}
