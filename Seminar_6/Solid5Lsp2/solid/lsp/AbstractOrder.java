package Seminar_6.Solid5Lsp2.solid.lsp;

public abstract class AbstractOrder {
    
    protected int price;
    protected int qnt;

    public AbstractOrder(int qnt, int price) {
        this.price = price;
        this.qnt = qnt;
    }

    public abstract int getAmaund();

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }

    public int getAmount() {
        return 0;
    }
    
}
