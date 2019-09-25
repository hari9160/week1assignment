import TurtleGraphics.*; 
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pen p = new StandardPen(new SketchPadWindow(800,600)); 
        //initialize objects
        PenBar pb1 = new PenBar(); 
        PenBar pb2 = new PenBar(); 
        PenBar pb3 = new PenBar(); 
        PenBar pb4 = new PenBar(); 
        
        for (int x = 0; x < 4; x++){ 
            while (true) { 
                System.out.format("Enter Bar " + (x + 1 + " height >"));
                if (x == 0){
                    pb1.width = s.nextInt();
                    makeBar(p, pb1, -350, 200, pb1.width, Color.blue); 
                } 
                else if (x == 1){ 
                    pb2.width = s.nextInt(); 
                    makeBar(p, pb2, -350, 100, pb2.width, Color.red);
                }
                else if (x == 2){ 
                    pb3.width = s.nextInt(); 
                    makeBar(p, pb3, -350, 0, pb3.width, Color.green);
                }
                else { 
                    pb4.width = s.nextInt(); 
                    makeBar(p, pb4, -350, -100, pb4.width, Color.orange);
                }
                System.out.println(pb1.width);
                System.out.println(pb2.width);
                System.out.println(pb3.width);
                System.out.println(pb4.width);
                break; 
            } 
        }
    }
    
    public static void makeBar(Pen p, PenBar pb, int x, int y, int w, Color c){ 
        pb.x = x; 
        pb.y = y; 
        pb.width = w; 
        pb.c = c; 
        pb.draw(p); 
   }
    
}
    

