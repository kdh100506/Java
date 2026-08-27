package Ifexample;

public class ConditionEx9 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        char op = '/';

        switch (op) {
            case '+' -> System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            case '-' -> System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            case '*' -> System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
            case '/' -> {
                if (num2==0) {
                    System.out.println("나눌수 없습니다.");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                }
            }
        }
    }
}
