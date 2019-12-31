package polymorphism2;

import polymorphism2.HighSchoolStudent;

public class TestClass {
    public static void main(String[] args) {

    HighSchoolStudent student = new HighSchoolStudent("James", 25, 10);

    Student student2 = new HighSchoolStudent("James", 25, 12);

        student.info();
        System.out.println();
        student2.info();
        System.out.println(student.equals(student2));
        System.out.println(student.getGrade());
        System.out.println(((HighSchoolStudent)student2).getGrade());

}
}
