// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      Scanner keyboard = new Scanner (System.in); 

String firstName = ""; // User's first name
String itemOrder = ""; // Item ordered
String frostingType = ""; // Frosting ordered
String fillingType = ""; // Filling ordered
String toppings = ""; // Toppings ordered
String input = "";  // User input

double cost = 15.00; // Cost of cake and cupcakes
final double TAX_RATE = .08;  // Sales tax rate
double tax; // Amount of tax

// Introduce shop and prompt user to input first name

System.out.println("Welcome to Java's Cake & Cupcake Shop!");
System.out.println("We make custom cakes with our secret cake batter!");

System.out.println();
System.out.println(firstName + " , your order is as follows: ");
System.out.println("_________________________________________");
System.out.println("Item Ordered: " + itemOrder);
System.out.println("Frosting: " + frostingType);
System.out.println("Filling: " + fillingType);
System.out.println("Toppings: " + toppings);
System.out.println("_________________________________________");

System.out.printf("The cost of your order is: $%.2f\n", cost);
tax = cost * TAX_RATE;
System.out.printf("The tax is: $%.2f\n", tax);
System.out.printf("The total due is: $%.2f\n",(tax + cost));

   
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING


	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS


	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION


      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
  
    }   
}