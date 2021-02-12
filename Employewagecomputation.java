public class Employewagecomputation{

       public static final int IS_FULL_TIME =2;
       public static final int IS_PART_TIME =1;

   public static int computeEmployewagecomputation (String company, int empRatePerHour,
                                                     int numOfWorkingDays, int maxHoursPerMonth) {
     //variables
        int empHrs = 0, totalEmpHrs = 0,totalWorkingDays = 0;
     //computation
        while(totalEmpHrs <= maxHoursPerMonth &&
              totalWorkingDays < numOfWorkingDays) {

   public static int computeEmpWage () {
     //variables
        int empHrs = 0, totalEmpHrs = 0,totalWorkingDays = 0;
     
     //computation
        while(totalEmpHrs <= Max_Hrs_In_Month &&
              totalWorkingDays < Num_Of_Working_Days) {
        totalWorkingDays++;
        int empCheck= (int) Math.floor(Math.random() * 10 ) % 3 ;
        switch (empCheck) {
          case IS_FULL_TIME:
                   empHrs=8;
                   break;
          case IS_PART_TIME:
                   empHrs=4;
                   break;
          default:
                   empHrs=0;
        }
        totalEmpHrs += empHrs;
        System.out.println("Day# : " + totalWorkingDays + " Emp Hr: " +empHrs);
}

 int totalEmpWage = totalEmpHrs * empRatePerHour;
 System.out.println("Total Emp Wage for company: " +company+" is: "+
                    totalEmpWage);
 return totalEmpWage;

}

public static void main(String[] args) {
    computeEmployewagecomputation("DMart", 20 , 2 , 10 );
    computeEmployewagecomputation("Reliance", 10 , 4 , 20 );
  }
}

