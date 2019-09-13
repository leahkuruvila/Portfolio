
/**
 * draws rectangles and finds their area/perimeter
 *
 * @Leah Kuruvila 
 * 
 */
import apcslib.*;
public class Rectangle
{
    // instance variables 
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private static DrawingTool pen = new DrawingTool(new SketchPad(500,500));
    

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(){
    myX = 0;
    myY = 0;
    myWidth = 0;
    myHeight = 0;
    }
    public Rectangle(double x, double y, double width, double height)
    {
        // initialise instance variables
        myX =x;
        myY = y;
        myWidth = width;
        myHeight = height;
    }

    //methods for finding area and perimeteter of rectangle
    public double getPerimeter()
    {
        // put your code here
        return (myHeight + myWidth)* 2;
    }
    public double getArea() {
        return myHeight * myWidth;
    }
    
    //draws rectangle
     public void draw() 
   {
       pen.up();
       pen.move(myX,myY);
       pen.down();
       pen.move(myX + myWidth, myY);
       pen.move(myX + myWidth, myY + myHeight);
       pen.move(myX, myY + myHeight);
       pen.move(myX, myY);
   } 

}
