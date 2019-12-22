package accessModifiers;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Rita");
        person.setAge(-1);
        person.setGender('F');
        person.setHeight(1.70);
        person.setWeight(123);

        Scanner scan = new Scanner(System.in);
        for(;;) {
            System.out.println("Set the age");
            int age = scan.nextInt();
            if (age > 0 && age <= 120) {
                person.setAge(age);
                break;
            }else {
                System.out.println("invalid age");
            }
        }
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getHeight());
        System.out.println(person.getWeight());





    }
}
