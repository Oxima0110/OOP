package Seminar_4;

public class Hero extends Warrior<Weapon, SuperShield>{



    public Hero(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);    
    }

    public Hero(String name, int healthPoint, Weapon weapon, SuperShield shield) {
        super(name, healthPoint, weapon, shield);    
    }

    @Override
    public String toString() {
        return String.format("Hero: %s", super.toString());
    }
    
}
