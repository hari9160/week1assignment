import java.util.Scanner; 
public class Momentum {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       //initialize variables 
       double m;
       double v; 
       double momentum; 
       //Ask and Confirm value for Velocity 
       System.out.print("Enter a number for mass: ");
       m = s.nextDouble(); 
        System.out.format("You entered the number %.2fkg\n", m); 
       //Ask and Confirm value for Velocity 
       System.out.print("Enter a number for velocity: ");
       v = s.nextDouble(); 
        System.out.format("You entered the number %.2fm/s\n", v);
       //Calculate Momentum 
       momentum = m * v; 
       //State Momentum 
       System.out.format("Momentum is: %.2fkg * m/s\n", momentum); 
    }
    
}
