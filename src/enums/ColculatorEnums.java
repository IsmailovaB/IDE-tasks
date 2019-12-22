package enums;

public class ColculatorEnums {
    public static void main(String[] args) {
        System.out.println(calculator(50, 40,Colculator.MINUS));
    }
    public static double calculator(double num1, double num2, Colculator check){
        double result = 0;
        switch (check){
            case PLUS:
                result = num1+num2;
                break;
            case MINUS:
                result =  num1-num2;
                break;
            case DIVIDE:
                result =  num1/num2;
                break;
            case MULTIPLY:
                result = num1*num2;
                break;
            case MODULUS:
                result =  num1%num2;
                break;
        }
        return result;
    }
}
