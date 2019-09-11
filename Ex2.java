
package ex2;
import java.util.Scanner;
public class Ex2
{
    public static void main(String[] args)
    {
        //create scanner
        Scanner in = new Scanner (System.in);
        
        //declare
        long sec;
       
        //prompt
         System.out.print("Enter time in seconds: ");
         sec = in.nextLong();
        
        //compute
        long hour =  sec / 3600;
        long min = sec % 3600/ 60;
        long seco = sec % 60;
        
        //display
        System.out.println("Time is " + hour + " hour " + min + " minutes " + seco + " seconds");
        
        
        //number2
        
        //declare
        double dis, mGal, pGal;
        
        //promt
        System.out.print("Enter the driving distance: ");
        dis = in.nextDouble();
        System.out.print("Entet miles per gallon: ");
        mGal = in.nextDouble();
        System.out.print("Entet price per gallon: ");
        pGal = in.nextDouble();
        
        //compute
        double cost = (dis / mGal) * pGal;
        
        //diplay
        System.out.printf("The cost of driving is %.2f" , cost);  
    }
    
}
