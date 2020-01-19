package ClassesObjects;

public class Dog {
    String name;
    public int age;
    String color;
    double weight;
    String breed;

    public void setAge(int age) throws Exception{
        if(age < 0 || age > 30){
            throw new Exception(age+" is an invalid age");
        }
        this.age = age;
    }
    public static void bark() throws Exception{

        System.out.println("Dog is barking");
        throw new Exception("Invalid");
    }
}
