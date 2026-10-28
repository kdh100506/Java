package ioTest;

import java.util.Scanner;

public class IOex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] chars = new char[10];

        for (int i = 0; i < 10; i++) {
            chars[i] = scan.next().charAt(0);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
