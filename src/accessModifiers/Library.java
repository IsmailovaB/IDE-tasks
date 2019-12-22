package accessModifiers;

import ClassesObjects.Author;

public class Library {
    public static void main(String[] args) {
        Author author = new Author();
        author.name = "James";
//        author.info();
//        Person person = new Person("James");
//        System.out.println(person.name);


        // we cant use inst.var. of this class.because of the access modifiers.
        // author object doesn't have access to variable 'name'.
        // Author class is located in the different package than library class.
    }
}
