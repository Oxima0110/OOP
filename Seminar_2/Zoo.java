package Seminar_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Cat("Barsik",
                "vislauh", "black", 4, 6),
                new Dog("Sedi", "ratveler", "braun",
                        4, 2), new Duck("Dukki", "selezeni", "grey", 2, 3),
                        new Fish("Sema", "som", "yellow", 0, 1),
                        new Dolphin("Vasea", "casatca", "grey", 0, 5)));
    }

    public void talk() {
        for (Speakable item : getSpeakable()) {
            System.out.printf("%s say:%s\n", item.toString(), item.speak());
        }
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof Speakable) {
                result.add((Speakable) speakItem);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal runItem : animals) {
            if (runItem instanceof Runable) {
                result.add((Runable) runItem);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal flyItem : animals) {
            if (flyItem instanceof Flyable) {
                result.add((Flyable) flyItem);
            }
        }
        return result;
    }

    public void run() {
        for (Runable item : getRunable()) {
            System.out.printf("%s run:%s\n", item.toString(), item.run());
        }
    }

    public void fly() {
        for (Flyable item : getFlyable()) {
            System.out.printf("%s fly:%s\n", item.toString(), item.fly());
        }
    }

    public List<Swimable> getSwim() {
        List<Swimable> result = new ArrayList<>();
        for (Animal swimItem : animals) {
            if (swimItem instanceof Swimable) {
                result.add((Swimable) swimItem);
            }
        }
        return result;
    }

        public void swim() {
            for (Swimable item : getSwim()) {
                System.out.printf("%s swim:%s\n", item.toString(), item.swim());
            }
        }    
}
