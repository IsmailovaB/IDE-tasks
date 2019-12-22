package enums;

public class UsingEnums {
    public static void main(String[] args) {
        EnumExamples.LetterGrade grade = EnumExamples.LetterGrade.B;
        grade = EnumExamples.LetterGrade.A;

    }
        public static void getGrade(EnumExamples.LetterGrade grade) {
            switch (grade) {
                case A:
                    System.out.println("Best score");
                    break;
                case B:
                    System.out.println("Better");
                    break;
                case C:
                    System.out.println("Not bad");
                    break;
                case D:
                    System.out.println("You should study more");
                    break;
                case F:
                    System.out.println("Bad");
            }
        }
    }

