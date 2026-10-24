package _inputsStream;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) throws IOException {
        int alpa;
        System.out.print("alpa를 입력하세요: ");
        alpa = System.in.read();
        System.out.println((char) alpa);
    }
}
