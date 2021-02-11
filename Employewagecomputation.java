public class Employewagecomputation{

public static void main(String[] args)
{
        int IS_FULL_TIME =1;
        int empwage =20;
        int emphrs=0;
        int totalempwage=0;
        double empcheck=Math.floor(Math.random() * 10 ) % 2 ;
        if(empcheck == IS_FULL_TIME)
           emphrs=8;
        else
          emphrs=0;
        totalempwage=emphrs*empwage;
        System.out.println("empwage : " +totalempwage );
  }
}
