package Seminar_6.Solid7Dip.solid.dip;

import java.util.ArrayList;
import java.util.List;

public class Report implements OperationCalculate{
    
    private List<ReportItem> items;	// Отчетные данные

    // расчет отчетных данных
    public List<ReportItem> calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
        return items;
    }

}
