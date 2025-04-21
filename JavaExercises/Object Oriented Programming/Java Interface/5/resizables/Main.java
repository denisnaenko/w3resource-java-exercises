package resizables;

import resizables.elements.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.resizeHeight(12);
        rectangle.resizeWidth(15);

        rectangle.printSize();
    }
}
