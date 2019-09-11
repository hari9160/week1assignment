import hsa.Console; 
import java.awt.Color;

public class BarChart2 {


    public static void main(String[] args) {
        Console c = new Console(); 
        //array of 4 colors for 4 bars 
        Color col[] = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE}; 
        Bar b[] = new Bar[4]; //makes empty array for 4 bars 
        for (int x = 0; x < 4; x++) { 
            b[x] = new Bar(); //makes a new actual BAR at location [x] in array 
            c.print("Enter Bar " + (x + 1) + " height >"); 
            //assign height, xloc and color 
            b[x].height 
        }
       
    }
    
}
