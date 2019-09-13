
/**
 * solves math expressions
 *
 * @Leah Kuruvila 
 * 
 */
public class MathFun
{
    // variables 
    double question1 = 4+9; 
    double question2 = 46/7;
    double question3 = 46 % 7;
    double question4 = 2 * 3.0;
    int q5 = 25/4;
    double q6 = 7.75 + 2.00;
    int q7 = 'p';
    char q8 = 105; 
    

    /**
     * Constructor for objects of class MathFun
     */
    public MathFun()
    {
        // initialise instance variables
        
    }

    
   //prints results
    public void  Math() 
    {
        System.out.println( "9 + 4 = " + question1);
        System.out.println( "46 / 7 = " + question2);
        System.out.println( "46 % 7 = " + question3);
        System.out.println( "2 * 3.0 = " + question4);
        System.out.println( "25 / 4 = " + (double)q5);
        System.out.println( "7.75 + 2.00 = " + (int)q6);
        System.out.println( "p = " + q7);
        System.out.println( "105 = " + q8);
       
    }
    
}
