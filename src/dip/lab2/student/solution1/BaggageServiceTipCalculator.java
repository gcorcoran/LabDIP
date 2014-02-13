package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator  {
    
    private double baseTipPerBag;
    private int bagCount;
    private double tipPercentage;
    
    public BaggageServiceTipCalculator(/*ServiceQuality q,*/ int bags) {
        //tipPercentage = q.getRate();
        this.setBagCount(bags);
    }
    
    public double getTip(double tipPercentage){
        return bagCount+(bagCount*tipPercentage);
    }

    
    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }
}
