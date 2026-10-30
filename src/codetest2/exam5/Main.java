package codetest2.exam5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotebookManager manager = NotebookManager.getInstance();

        int rentCount = sc.nextInt();
        int returnCount = sc.nextInt();

        manager.rentNotebook(rentCount);
        manager.returnNotebook(returnCount);

        manager.showInfo();
    }
}
