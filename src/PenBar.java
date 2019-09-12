import hsa.Console;
import java.awt.Color; 
import TurtleGraphics.*; 

public class PenBar {
    int xloc, yloc, height; 
    Color col; 
    
    public void draw (Console c){ 
        c.setColor(col); 
        yloc = 400-height; 
        c.fillRect(xloc, yloc, 50, height); 
        c.drawString("Value: " + height, xloc, yloc-10); 
    }
}
