package Seminar_6.Solid5Lsp2.solid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Seminar_6.Solid5Lsp2.solid.lsp.AbstractOrder;
// import Seminar_6.Solid5Lsp2.solid.lsp.Order;

public class OrderCalculator implements Iterable<AbstractOrder>{
    
    private List<AbstractOrder> orders = new ArrayList<>();

    public void add(AbstractOrder order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (AbstractOrder order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<AbstractOrder> iterator() {
        return orders.iterator();
    }
}
