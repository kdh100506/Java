package ioTest;

import java.util.Scanner;

public class IOex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 10; i++) {
            total += scanner.nextInt();
        }

        double average = (double) total / 10;

        System.out.printf("합: %d 평균: %.1f%n", total, average);
    }
}
