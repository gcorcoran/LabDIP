package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        
        Employee emp1 = new HourlyEmployee(10.50, 2020);
        Employee emp2 = new SalariedWithBonusEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000);

        HRService ownersCousin = new HRService(emp1);
        HRService ownersBrotherInLaw = new HRService(emp2);
        HRService ownersUnderachievingBrother = new HRService(emp3);
        
       
    }

}
