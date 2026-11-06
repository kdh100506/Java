package codetest4.exam2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vm = new VendingMachine("콜라", 1500, 10);
        int s = sc.nextInt();
        vm.sell(s);

        System.out.println("==판매 후==");
        vm.showInfo();
    }
}
