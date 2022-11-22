package Seminar_2;

public class Fish extends Animal implements Swimable {

    public Fish(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String swim() {
        return "15 km/h";
    }
    
}
