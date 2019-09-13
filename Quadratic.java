
/**
 * Evaluates the quadratic equation after user input
 *
 * @Leah Kuruvila
 * 
 */
import java.util.Scanner;
public class Quadratic
{
    // instance variables 
    double a;
    double b;
    double c;
    double Solution1;
    double Solution2;
    
    //declares scanner object
    Scanner s = new Scanner(System.in);
    
    //constructor
    public Quadratic()
    {
        // initialise instance variables
        
    }

    //evaluates and prints result
    public void calculator()
    {
        
       System.out.println("Enter your a value: ");
       a = s.nextDouble();
       
       System.out.println("Enter your b value: ");
       b = s.nextDouble();
       
        System.out.println("Enter your c value: ");
       c = s.nextDouble();
       
       Solution1 =( -b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a) ; 
       Solution2 =( -b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a) ;
       
       System.out.println((double)Solution1);
       System.out.println((double)Solution2);
       
        
    }
}
