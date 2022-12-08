package Seminar_6.Solid3Ocp1.solid;

import java.util.ArrayList;
import java.util.List;

import Seminar_6.Solid3Ocp1.solid.ocp.Cicle;
import Seminar_6.Solid3Ocp1.solid.ocp.RightTriangle;
import Seminar_6.Solid3Ocp1.solid.ocp.Shape;
import Seminar_6.Solid3Ocp1.solid.ocp.Square;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Cicle(10));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.GetArea();
        }
        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}
