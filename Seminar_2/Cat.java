package Seminar_2;

public class Cat extends Animal implements Speakable, Runable{

    public Cat(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak() {
        return "Mau...";
    }

    @Override
    public String run() {
        return "50 km/h";
    }

    
}
