package job;

public class ImageClass implements Image {
    private final String name;

    public ImageClass(String name) {
        this.name = name;
        loadImage(name);
    }

    @Override
    public void display() {
        System.out.println("this is the image:  " + name);
    }

    public void loadImage(String name) {
        System.out.println("loading:::: " + name);
    }
}
