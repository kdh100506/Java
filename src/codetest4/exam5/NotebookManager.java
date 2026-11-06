package codetest4.exam5;

public class NotebookManager {
    private Notebook notebook;
    private static NotebookManager instance = new NotebookManager();

    private NotebookManager() {
        notebook = new Notebook();
    }

    public static NotebookManager getInstance() {
        return instance;
    }

    public void rentNotebook(int s) {
        notebook.rentNotebook(s);
    }

    public void returnNotebook(int s) {
        notebook.returnNotebook(s);
    }

    public void showInfo() {
        notebook.showInfo();
    }
}
