package Seminar_6.Solid2Spr2.solid;


import Seminar_6.Solid2Spr2.solid.models.ConsoleInput;
import Seminar_6.Solid2Spr2.solid.models.Order;
import Seminar_6.Solid2Spr2.solid.models.Persister;

public class Main {
    
    public static void main(String[] args) {
        Persister persister = new Persister("E:\\OOP\\Seminar_6\\Solid2Spr2\\solid\\order.json");
        System.out.println("Введите заказ:");
        Order order = new ConsoleInput().inputFromConsole();
        // order.inputFromConsole();
        persister.saveToJson(order);
    }
}
