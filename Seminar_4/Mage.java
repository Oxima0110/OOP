package Seminar_4;

public class Mage extends Warrior<Staff, PowerShield> {

    private Integer range;
    private Integer mana;

    public Mage(String name, int healthPoint, Staff weapon, final Integer range, Integer mana) {
        super(name, healthPoint, weapon);
        this.range = range;
        this.mana = mana;
    }

    public Mage(String name, int healthPoint, Staff weapon, PowerShield shield, final Integer range, Integer mana) {
        super(name, healthPoint, weapon, shield);
        this.range = range;
        this.mana = mana;
    }

    public Integer getRange() {
        return range;
    }

    public Integer getMana() {
        return mana;
    }


    @Override
    public String toString() {
        return String.format("Mage: %s, mana - %d, range - %d", super.toString(),getMana(), getRange());
    }
    
}
