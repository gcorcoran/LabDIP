package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    
    private double tipPercentage;
    private double bill;
    
    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        tipPercentage = q.getRate();
        bill = billAmt;
    }

    @Override
    public double getTip() {
        return tipPercentage * bill;
    }

    public final void setBill(double billAmt) {
        
        bill = billAmt;
    }

    

    

}
