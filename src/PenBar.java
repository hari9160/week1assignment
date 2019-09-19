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
    }
    
    public void drawLabel(Pen p){ 
        p.setColor(c); 
        p.up(); 
        p.move(x + w + 40 + y +)
        p.drawString("" + width);

    }
}
