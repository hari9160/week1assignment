import hsa.Console; 
import java.awt.Color;
import java.util.Random; 

public class BarChart1 { 


    public static void main(String[] args) {
        Console c = new Console(); 
        int height; 
        //for loop for the 4 bars 
        for (int i = 0; i < 4; i++){ 
            //make sure data is from 10 to 4000
            while (true) { 
                c.print("Enter a height for bar " + (i + 1) + " (max 400) > "); 
                height = c.readInt(); 
                if (height <=400 && height >=10){ 
                    break; 
                } else { 
                    c.print("Error number must lower than 400\n"); 
                }
            }
            c.setColor(rng()); //get a random color using handy method below
            c.fillRect(50 + 100 * i, 500 - height, 50, height); 
            c.drawString("Value: " + height, 50 + 100*i, 500 - height - 20); 
        }
    }    
        
        public static Color rng(){ 
            Random r = new Random(); 
            return new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)); 
        }
    }
    

