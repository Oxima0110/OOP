package lectia_1.Ex002;

/**
 * Это точка 2D
 */
public class Point2D {
     private int x, y;

     /**
      * Это конструкто
      * @param valueX это координата x
      * @param valueY это координата y
      */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    // public Point2D(int value) {
    //     x = value;
    //     y = value;
    // } вместо этого:
    
    public Point2D(int value) {
        this(value, value);
    }

    // public Point2D() {
    //     x = 0;
    //     y = 0;
    // } вместо этого:

    public Point2D() {
        this(0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }


    // ctor
    // get; set
    // docs
}
