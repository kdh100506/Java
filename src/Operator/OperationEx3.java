package Operator;

public class OperationEx3 {
    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        // and 연산은 앞항의 결과값이 False면 뒤에 있는 조건은 실행되지 않는다.
        boolean value = ((num1 = num1+10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        // or 연산은 앞항의 결과값이 True면 뒤에 있는 조건은 실행되지 않는다.
        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

    }
}