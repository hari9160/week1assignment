import TurtleGraphics.Pen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        makeBar(p, pb1, -350, 200, pb1.width, Color.blue); 
        makeBar(p, pb2, -350, 100, pb2.width, Color.red);
        makeBar(p, pb3, -350, 0, pb3.width, Color.green); 
        makeBar(p, pb4, -350, -100, pb4.width, Color.orange); 
        
    }
    
    public static void makeBar(Pen p, PenBar pb, int x, int y, int w, Color c){ 
        pb.x = x; 
        pb.y = y; 
        pb.width = w; 
        pb.c = c; 
        pb.draw(p); 
   }
    
}
    

