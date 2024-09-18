package job;

public class Proxy implements Image {
    private final String name;
    private ImageClass imageClass;

    public Proxy(String name) {
        this.name = name;

    }

    @Override
    public void display() {
        if (imageClass == null) {
            imageClass = new ImageClass(name);
        }
        imageClass.display();
    }
}