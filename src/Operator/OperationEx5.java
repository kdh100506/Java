package Operator;

public class OperationEx5 {
    public static void main(String[] args) {

        int num = 0b00000101;
        System.out.println(num << 2); // a << b 는 a에 2의 b승 만큼 곱한 값.
        System.out.println(num >> 2); // a >> b 는 a에 2의 b승 만큼 나눈 값 (몫).
        System.out.println(num >>> 2);

        num<<=2; // 복합 대입 연산자는 변수값을 변경함.
        System.out.println(num);

        int num2 = -0b00000101;
        System.out.println(num2 << 2);
        System.out.println(num2 >> 2);
        System.out.println(num2 >>> 2);
    }
}
