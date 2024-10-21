package at.rad.project.Camera;

public class File {
    private int size;
    private String name;
    private long creationDate;

    private File(int size, String name)
    {
        this.size = size;
        this.name = name;
        this.creationDate = System.currentTimeMillis();
    } 

    public int getSize() {
        return size;
    }
}