package Seminar_6.Solid3Ocp1.solid.ocp;

public class Square implements Shape{

    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double GetArea() {
        return Math.pow(getSide(), 2);
    }
    
}
