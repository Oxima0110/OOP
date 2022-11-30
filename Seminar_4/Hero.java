package Seminar_4;

public class Hero extends Warrior implements Weapon{



    public Hero(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);    
    }

    @Override
    public String toString() {
        return String.format("Hero: %s", super.toString());
    }

    @Override
    public Integer damage() {
        // TODO Auto-generated method stub
        return null;
    }


    
}
