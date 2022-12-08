package Seminar_6.Solid6Lsp1.solid.isp;



public class TerminalPaymentService implements PayCreditCardPaybale, WebMoneyPayble{

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }
    
}
