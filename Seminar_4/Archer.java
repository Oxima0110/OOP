package Seminar_4;

public class Archer extends Warrior implements Weapon {

    private Integer range;

    public Archer(String name, int healthPoint, Bow weapon, Integer range) {
        super(name, healthPoint, weapon);
        this.range = range;
    }

    public Integer getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, range - %d", super.toString(), getRange());
    }

    @Override
    public Integer damage() {
        // TODO Auto-generated method stub
        return null;
    }

}
