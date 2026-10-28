package ioTest;

import java.util.Scanner;

public class IOex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
