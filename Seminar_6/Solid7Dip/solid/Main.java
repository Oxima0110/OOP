package Seminar_6.Solid7Dip.solid;

import Seminar_6.Solid7Dip.solid.dip.OutputReport;
import Seminar_6.Solid7Dip.solid.dip.PrintReport;
import Seminar_6.Solid7Dip.solid.dip.Report;

public class Main {
    
    public static void main(String[] args) {
        Report report = new Report();
        OutputReport reportPrint = new PrintReport();
        reportPrint.output(report.calculate());
    }
}
