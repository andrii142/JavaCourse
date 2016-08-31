package module3.questions.filesytem;


public class Folder {
    private File[] files = new File[1000];
    private String path;

    private int index = 0;

    public Folder(FileSystem fileSystem, String path) {
        this.path = path;
        fileSystem.setFoldersCount();
    }

    public String getPath() {
        return path;
    }

    public void setFiles(File file) {
        files[index] = file;
        index++;
    }
}
