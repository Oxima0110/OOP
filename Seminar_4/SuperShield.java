package Seminar_4;

public class SuperShield implements Shield{

    @Override
    public Integer protect() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("SuperShield - %d", protect());
    }
    
}
