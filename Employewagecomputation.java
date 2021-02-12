public class Employewagecomputation {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;

    private String company;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHoursPerMonth;
    private int totalEmpWage;

    public Employewagecomputation(String company, int empRatePerHour,
                                  int numOfWorkingDays, int maxHourPerMonth) {
        this.company = company;
        this.empRatePerHour =  empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHourPerMonth;
    }

    public void computeEmpWage() {
        int  empHrs = 0 , totalEmpHrs = 0, totalWorkingDays = 0;
      //computation
        while (totalEmpHrs <=maxHoursPerMonth &&
                totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
           int  empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case 	IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            System.out.println("Day#: " + totalWorkingDays + " EmpHr: "+ empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    @Override
    public String toString() {
        return "Total salary for company " + company + " is : " + totalEmpWage;
    }

    public static void main(String[] args) {
        Employewagecomputation dMart = new Employewagecomputation("DMart", 20, 2, 10);
        Employewagecomputation Reliance = new Employewagecomputation("Reliance", 10, 4, 20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        Reliance.computeEmpWage();
        System.out.println(Reliance);
    }

       


