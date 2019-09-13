
/**
 * 
 *a circle inside a hexagon
 * @Leah Kuruvila
 * 
 */
import apcslib.*;
public class Benzene
{
   //initialize variables to make hexagon
   double coordinate1;
   double coordinate2;
   
    public Benzene()
    {
        // constructor
        
    }

   
    public void shape()
    {
        //initializes variables
        DrawingTool brush;
        SketchPad backdrop;
        backdrop = new SketchPad(500,500);
        brush = new DrawingTool(backdrop);
        
        backdrop = new SketchPad(500,500);
        brush = new DrawingTool(backdrop);
        
        double coordinate1 = (Math.sqrt(3) * 200)/2;
        double coordinate2 = -(Math.sqrt(3) * 200)/2;
        //makes hexagon
        brush.up();
        brush.move(100, coordinate1);
        brush.down();
        brush.move(200,0);
        brush.move(100,coordinate2);
        brush.move(-100,coordinate2);
        brush.move(-200,0);
        brush.move(-100,coordinate1);
        brush.move(100, coordinate1);
        brush.up();
        
        //makes circle
        brush.move(0,0);
        brush.down();
        brush.drawCircle(100);
    }
}
