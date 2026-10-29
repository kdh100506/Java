package codetest.notebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotebookManager manager = NotebookManager.getInstance();

        int rentCount = scanner.nextInt();
        int returnCount = scanner.nextInt();

        manager.rentNotebook(rentCount);
        manager.returnNotebook(returnCount);
        manager.showInfo();
        scanner.close();
    }
}
