public class DegreeProgram {
    private String level;
    private String name;
    private int duration;
    private double tuitionFeeYearly;
    private int totalCredits;

    public DegreeProgram( String level, String name, int duration, double tuitionFeeYearly, int totalCredits) {

        this.level = level;
        this.name = name;
        this.duration = duration;
        this.tuitionFeeYearly = tuitionFeeYearly;
        this.totalCredits = totalCredits;
    }
    public String getName()
    {
        return this.name;
    }
    public int getYearlyCredits() {
        return  totalCredits/duration;
    }
    public double getTotalTuitionFee() {
        return tuitionFeeYearly*duration;
    }
    public double getCostPerCredit() {
        return getTotalTuitionFee()/totalCredits;
    }
    public boolean isAffordable(double budget )
    {
        return getTotalTuitionFee()<=budget;
    }
    public void printCreditInfo()
    {
        System.out.println("Yearly credits: " + getYearlyCredits());
        System.out.println("Cost per credit: $" + getCostPerCredit());
    }

    @Override
    public String toString() {
        return level+" level " +name+" program"+ "\nIt is a " +duration+
                "-year program with an annual tuition fee of $"+tuitionFeeYearly+
                "\nCompleting your degree requires earning "+totalCredits+" credits";

    }


}
