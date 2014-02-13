package dip.lab2.student.solution1;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
//    public static enum ServiceQuality {
//           GOOD, FAIR, POOR
//    };
 
    public static void main(String[] args) {
        
        ServiceQuality quality1 = new GoodServicePolicy();
        ServiceQuality quality2 = new FairServicePolicy();
        ServiceQuality quality3 = new PoorServicePolicy();
        
        //ServiceQuality object, then bill amount in constructor
        //TipCalculator calc = new FoodServiceTipCalculator(quality, 20.0);
        
        //ServiceQuality object, then bags in constructor
        TipCalculator calc = new BaggageServiceTipCalculator(5);
        
        TipCalculator calc2 = new FoodServiceTipCalculator(20.0);
        TipCalculator calc3 = new FoodServiceTipCalculator(20.0);
        
        TipService tipper = new TipService(quality1, calc);
        TipService tipper2 = new TipService(quality2, calc2);
        TipService tipper3 = new TipService(quality3, calc3);
        
    }

}
