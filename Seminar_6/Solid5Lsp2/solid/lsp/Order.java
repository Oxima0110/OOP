package Seminar_6.Solid5Lsp2.solid.lsp;

public class Order extends AbstractOrder{
    
    
    public Order(int qnt, int price) {
        super(qnt, price);
    }


    @Override
    public int getAmaund() {
        return qnt * price;
    }

}
