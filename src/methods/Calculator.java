package methods;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculator("*",5,5));
    }
    public static double calculator(String operators, double num1,double num2){
switch (operators) {
    case "+":
        return num1 + num2;
    case "-":
        return num1 - num2;
    case "*":
        return num1 * num2;
    case "/":
        return num1 / num2;
    case "%":
        return num1 % num2;
    default:
        System.out.println("invalid operator");
        return 0;
}
}

}
