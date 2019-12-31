package polymorphism2;

public class Person {

    private String name;

    public Person(String name){
        setName(name);
    }
    public void info(){
        System.out.println("Name: "+this.name);
    }

    public boolean hasSameName(Person anotherPerson){
        return getName().equalsIgnoreCase(anotherPerson.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public static void main(String[] args) {
//        Person p1 = new Person("James");
//        System.out.println(p1.hasSameName(new Person("Jame")));
//
//
//    }
}
