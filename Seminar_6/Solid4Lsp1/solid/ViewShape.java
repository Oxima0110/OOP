package Seminar_6.Solid4Lsp1.solid;

import Seminar_6.Solid4Lsp1.solid.lsp.Rectangle;

public class ViewShape {

    private Rectangle rectangle;

    public ViewShape(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(rectangle.getArea());
    }
    
}
