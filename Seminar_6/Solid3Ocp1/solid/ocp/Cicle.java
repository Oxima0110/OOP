package Seminar_6.Solid3Ocp1.solid.ocp;

public class Cicle implements Shape{
    
    private Integer radius;

    public Cicle(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    @Override
    public double GetArea() {
        return Math.PI*Math.pow(getRadius(), 2);
    }
       
}
