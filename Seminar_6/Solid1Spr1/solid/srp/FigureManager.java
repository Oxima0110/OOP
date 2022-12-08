package Seminar_6.Solid1Spr1.solid.srp;

public class FigureManager {

    private Integer zoom;

    public FigureManager(Integer zoom) {
        this.zoom = zoom;
    }
 
    public void draw(Square square) {
        Integer side = square.getSide()*zoom;
        for (int i = 0; i < side; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < side; i++) {
            System.out.print("*");
            for (int j = 1; j < side - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < side; i++) {
            System.out.print("*");
        }
    }
}
