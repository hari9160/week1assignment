import java.awt.Color; 
import TurtleGraphics.*; 

    public class PenBar {
        Pen p = new StandardPen(); 
        int x, y, width; 
        Color c; 
    
    public void draw (){ 
        p.up(); 
        p.move(x, y); 
        p.down();
        p.setColor(c); 
        p.setWidth(50); 
        p.down(); 
    }
    
    public void drawLabel(){ 
        
                

    }
}
