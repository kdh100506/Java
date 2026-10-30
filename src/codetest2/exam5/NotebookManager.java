package codetest2.exam5;

public class NotebookManager {
    private Notebook notebook;
    private static NotebookManager instance = new NotebookManager();

    private NotebookManager() {
        notebook = new Notebook();
    }

    public static NotebookManager getInstance() {
        return instance;
    }

    public void rentNotebook(int rentCount) {
        notebook.rentNotebook(rentCount);
    }

    public void returnNotebook(int returnNotebook) {
        notebook.returnNotebook(returnNotebook);
    }

    public void showInfo() {
        System.out.println("==노트북 대여 현황==");
        notebook.showInfo();
    }
}
