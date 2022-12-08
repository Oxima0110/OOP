package Seminar_6.Solid5Lsp2.solid.lsp;

public class FactoryOrder {
    
    public AbstractOrder create(int qnt, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(qnt, price);
        }
        return new Order(qnt, price);
    }
}
