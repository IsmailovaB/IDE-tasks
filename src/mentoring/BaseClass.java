package mentoring;

import java.util.ArrayList;

public class BaseClass {
    public static void main(String[] args) {


        Student st1 = new Student("John", "Kim", 25, true);
//        System.out.println(st1);
        Student st2 = new Student("Irina", "Crain", 34, false);
//        System.out.println(st2);
        Student st3 = new Student("Jack", "Chan", 44, true);
//        System.out.println(st3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

        for(Student s: students){
            if(s.isActive){
                System.out.println(s.toString());
            }
        }
    }
}
