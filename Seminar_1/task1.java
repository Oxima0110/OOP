package Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {

        List<Product> prods = new ArrayList<>();

        prods.add(new Chocolate("Lindt", 70.0, 72.5));
        prods.add(new Milk("Петмол", 70.0, 5));
        prods.add(new Product("Чипсы", 60.0));
        prods.add(new Product("Масло", 50.0));
        prods.add(new Product("Хлеб", 40.0));
        prods.add(new Chocolate("Алёнка", 30.0, 50.5));
        prods.add(new Product("Снек", 20.0));

        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);
        System.out.println(v1.getProductBy("Масло"));
        System.out.println(v1.getProductBy(40.0));
    }
}
