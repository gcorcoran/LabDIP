package dip.lab1.student.solution1;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author your name goes here
 */
public class SalariedWithBonusEmployee implements Employee{
    // You gotta question if these are appropriate for ALL employees?
    private double hourlyRate;
    private double totalHrsForYear;
    private double annualSalary;
    private double annualBonus;

    public SalariedWithBonusEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }
    
    @Override
    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

}
