package Seminar_2;

public class Dolphin extends Animal implements Swimable {

    public Dolphin(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String swim() {
        return "48 km/h";
    }

    
    
}
