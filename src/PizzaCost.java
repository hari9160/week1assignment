import java.util.Scanner; 
public class PizzaCost {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       //initialize variables 
       int size, toppings; 
       double base = 2.25; //Includes cost of base labour and utilities 
       double cost; 
       //Size of pizza
       System.out.print("Enter size for pizza: ");
       size = s.nextInt(); 
       System.out.format("The size of your pizza is %din\n", size);
       //Toppings wanted 
       System.out.print("Enter the amount of toppings for the pizza: "); 
       toppings = s.nextInt(); 
       System.out.format("Here is the amount of toppings on your pizza %d\n", toppings); 
       //Calculate Pizza cost 
       cost = size * 0.5 + toppings * 0.75 + base; 
       //State total cost of the pizza 
       System.out.format("The cost of the pizza is: $%.2f\n", cost); 
       System.out.println("Thank you for eating at dominoes"); 
       System.out.println("This is work at school again");
    }
    
}
