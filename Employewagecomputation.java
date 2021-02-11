public class Employewagecomputation{
        public static final int IS_FULL_TIME =1;
        public static final int IS_PART_TIME =2;
        public static final int Empwage =20;
        public static final int Working_Days_Per_Month=20;
        public static final int Working_Hours_Per_Month=100;

public static void main(String[] args)
{       
        int emphrs=0;
        int totalempwage=0;
        int monthlywage=0;
        int empday=0;
        int emphour =0;
        while(empday < Working_Days_Per_Month && emphour <= Working_Hours_Per_Month)
        {
        empday++;
        int empcheck= (int)Math.floor(Math.random() * 10 ) % 3 ;
        switch (empcheck){
          case IS_FULL_TIME:
                   emphrs=8;
                   break;
          case IS_PART_TIME:
                   emphrs=4;
                   break;
          default:
                   emphrs=0;
        }
        emphour+=emphrs;
        totalempwage=emphrs*Empwage;
        monthlywage+=totalempwage;
        System.out.println("#day : "+empday+"     "+"emphours : "+emphour+"      "+"empwage : " +totalempwage);
}
System.out.println("20 days and 100 hours of employwage is  :" +monthlywage);
  }

}

