import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {


    public static void main(String[] args) {
        StandardPen pen = new StandardPen(); 
        Scanner s = new Scanner(System.in);
    }
    
    public static void makeBar(Pen p, PenBar pb, int x, int y, int w, Color c){ 
        pb.x = x; 
        pb.y = y; 
        pb.width = w; 
        pb.barColor = c; 
        pb.draw(p); 
    }
    
}
    

