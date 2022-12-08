package Seminar_6.Solid5Lsp2.solid;

import Seminar_6.Solid5Lsp2.solid.lsp.AbstractOrder;
import Seminar_6.Solid5Lsp2.solid.lsp.FactoryOrder;
// import Seminar_6.Solid5Lsp2.solid.lsp.Order;

public class Main {

    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for (AbstractOrder order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}
