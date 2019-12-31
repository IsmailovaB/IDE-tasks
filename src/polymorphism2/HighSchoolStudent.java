package polymorphism2;

public class HighSchoolStudent extends Student{

    private int grade;

    public HighSchoolStudent(String name, int id, int grade){
        super(name,id);
        setGrade(grade);
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Grade level: "+getGrade());
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 9 && grade <= 12) {
            this.grade = grade;
        }else{
            System.out.println("Invalid grade");
            System.exit(0);
        }
    }

    public boolean equals(HighSchoolStudent otherStudent){
        return super.equals(otherStudent) && this.getGrade() == otherStudent.getGrade();
    }
}
