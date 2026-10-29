package codetest.vendingmachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine machine = new VendingMachine("콜라", 1500, 10);

        int quantity = scanner.nextInt();
        machine.sell(quantity);

        System.out.println("==판매 후==");
        machine.showInfo();
        scanner.close();
    }
}
