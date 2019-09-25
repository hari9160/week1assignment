import java.awt.Color; 
import TurtleGraphics.*; 

    public class PenBar {
        int x, y, width; 
        Color c; 
    
    public void draw (Pen p){ 
        p.up(); 
        p.move(x, y); 
        p.setDirection(0); 
        p.setColor(c); 
        p.setWidth(50); 
        p.down(); 
        p.move(width, y); 
        //label
        p.up(); 
        p.move(width + 40, y); 
        p.drawString("Value: " + width);

    }
}
