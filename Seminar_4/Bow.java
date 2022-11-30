package Seminar_4;

public class Bow implements Weapon {

    @Override
    public Integer damage() {
        return 38;
    }
    
    @Override
    public String toString() {
        return String.format("Bow - %d", damage());
    }

}
