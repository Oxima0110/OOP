package Seminar_6.Solid5Lsp2.solid.lsp;

public class OrderBonus  extends AbstractOrder{

    

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    
    }

    @Override
    public int getAmaund() {
        return 0;
    }
}
