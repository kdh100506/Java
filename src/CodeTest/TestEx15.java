package CodeTest;

// (배열, for문 활용)
// 평문 문자열(decode)를 거꾸로 한 암호를 만들어
// 새로운 배열을 만들어 입력하고, 출력하세요.

public class TestEx15 {
    public static void main(String[] args) {
        char[] decode = {'I', ' ', 'a', 'm', ' ', 'a', ' ', 's', 'p', 'y'};
        char[] encode = new char[decode.length];

        for (int i = 0; i < decode.length; i++) {
            encode[i] = decode[decode.length - 1 - i];
        }

        for (int i = 0; i < encode.length; i++) {
            System.out.print(encode[i]);
        }
    }
}
