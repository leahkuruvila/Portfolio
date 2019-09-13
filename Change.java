
/**
 * Displays change and specific coins needed
 *
 * @Leah Kuruvila
 * 
 */
import java.io.*;
import java.util.Scanner;

public class Change
{
    // instance variables
    double purchase;
    double cash;
    double changeInDollars;
    int change;
    int quarter;
    int dime;
    int nickel;
    int penny;
    
    

    /**
     * Constructor for objects of class Change
     */
    public Change()
    {
        // initialise instance variables
        
    }

    
    public void prompt()
    {
      //user input
       Scanner scan = new Scanner(System.in); 
       System.out.println("Enter amount of purchase: ");
       purchase = scan.nextDouble();
       System.out.println("Enter amount of cash payed: ");
       cash = scan.nextDouble();
       
       //finds how many cents there are
       changeInDollars = cash - purchase;
       changeInDollars = changeInDollars - (int)changeInDollars + 0.00001;
       change = (int) (changeInDollars * 100);
       
       System.out.println("Amount of coins needed: " + change);
       
       //finds which coins are needed
    if (change == 0) {
        System.out.println("no change");
    }   
       if ( change >= 25){
        quarter = change / 25;
        System.out.println(quarter + " quarter(s)");
        change = change % 25;
    }
        
         if ((change != 0) && (change >= 10)) {
            dime = change / 10;
            System.out.println(quarter + " dime(s)");
            change = change % 10;
        }
        if  ((change != 0) && (change >= 5)) {
            nickel = change / 5;
            System.out.println(nickel + " nickel(s)");
            change = change % 5;
            
    }
      if ((change != 0) && (change >= 1)) {
            penny = change / 1;
            System.out.println(penny + " pennies");
            
            
    }
    

}
}