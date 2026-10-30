package codetest2.exam2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachcine machcine = new VendingMachcine("콜라", 1500, 10);

        int m = sc.nextInt();
        machcine.sell(m);

        System.out.println("==판매 후==");
        machcine.showInfo();
    }
}
