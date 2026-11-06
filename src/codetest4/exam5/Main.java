package codetest4.exam5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotebookManager nm = NotebookManager.getInstance();

        int r = sc.nextInt();
        int re = sc.nextInt();

        nm.rentNotebook(r);
        nm.returnNotebook(re);

        System.out.println("==노트북 대여 현황==");
        nm.showInfo();
    }
}
