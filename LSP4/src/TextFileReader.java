public class TextFileReader {

    private TextFileViewer[] viewers;

    public TextFileReader(TextFileViewer[] viewers) {
        this.viewers = viewers;
    }

    public void viewAllTextFiles() {
        for (TextFileViewer viewer : viewers) {
            viewer.viewTextFile();
        }
    }
}
