package codetest2.exam1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();

        Rectangle r = new Rectangle(width, height);
        r.showInfo();
    }
}
