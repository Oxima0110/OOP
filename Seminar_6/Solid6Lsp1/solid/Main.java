package Seminar_6.Solid6Lsp1.solid;

import Seminar_6.Solid6Lsp1.solid.isp.InternetPaymentService;
import Seminar_6.Solid6Lsp1.solid.isp.TerminalPaymentService;

public class Main {
    
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
        
    }
}
