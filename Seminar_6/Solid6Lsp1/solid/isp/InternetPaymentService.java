package Seminar_6.Solid6Lsp1.solid.isp;

public class InternetPaymentService  implements WebMoneyPayble, PayCreditCardPaybale, PayPhoneNumberPayble{

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet pay by phone number %d\n", amount);
    }
}
    
