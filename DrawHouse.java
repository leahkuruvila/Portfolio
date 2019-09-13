
/**
 * Draws a house
 *
 * @Leah Kuruvila
 * 
 */
import apcslib.*;
public class DrawHouse
{
 

    

    /**
     * Constructor for objects of class DrawHouse
     */
    public DrawHouse()
    {
        // initialise instance variables
        
    }

    
    //draws house
    public void draw()
    {
        //initializes variable
        DrawingTool brush;
        SketchPad backdrop;

        backdrop = new SketchPad(500,500);
        brush = new DrawingTool(backdrop);
        
        //makes base of house
        brush.up();
        brush.move(-400,-250);
        brush.down();
        brush.move(400,-250);
        brush.move(400,100);
        brush.move(-400,100);
        brush.move(-400,-250);
        brush.up();
        
        //makes roof
        brush.move(0,150);
        brush.down();
        brush.move(-400,100);
        brush.up();
        brush.move(0,150);
        brush.down();
        brush.move(400,100);
        brush.up();
        
        // makes door
        brush.move(-30,-250);
        brush.down();
        brush.move(-30,-150);
        brush.move(30,-150);
        brush.move(30,-250);
        brush.up();
        
         // makes left window
         brush.move(-300,50);
         brush.down();
         brush.move(-200,50);
         brush.move(-200,-50);
         brush.move(-300,-50);
         brush.move(-300,50);
         brush.up();
         
         // makes right window
        brush.move(300,50);
        brush.down();
        brush.move(200,50);
        brush.move(200,-50);
        brush.move(300,-50);
        brush.move(300,50);
        brush.up(); 
    }
}
