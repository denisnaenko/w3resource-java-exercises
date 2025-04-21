package resizables.elements;

public class Rectangle implements Resizable {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }






}
