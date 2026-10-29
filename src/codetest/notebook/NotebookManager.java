package codetest.notebook;

public class NotebookManager {
    private static final NotebookManager instance = new NotebookManager();
    private final Notebook notebook;

    private NotebookManager() {
        this.notebook = new Notebook();
    }

    public static NotebookManager getInstance() {
        return instance;
    }

    public void rentNotebook(int count) {
        notebook.rentNotebook(count);
    }

    public void returnNotebook(int count) {
        notebook.returnNotebook(count);
    }

    public void showInfo() {
        notebook.showInfo();
    }
}
