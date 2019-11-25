import java.util.Scanner;
public class BMI_Calculator {

	
	public static void main (String [] args){
	Scanner scnr = new Scanner(System.in);	
	
	double user_height = 0.0;
	double user_weight = 0.0;
	
	char user_choice;
	
	System.out.println("Please enter the letter a for standard units or the letter b for metric units");
	user_choice = scnr.next().charAt(0);
	
		
	switch (user_choice) {
	
	   case 'a':
		
		 System.out.print("Enter your weight in pounds: ");
		 
		 user_weight = 703 * scnr.nextDouble();
		
		 System.out.print("Enter your height in inches:");
		
		 user_height = scnr.nextDouble();
		 user_height = Math.pow(user_height, 2.0);
		
		 break;
		
	  case 'b':
		  
		  System.out.print("Enter your weight in kilograms: ");
		  
		  user_weight = scnr.nextDouble();
		  
		  System.out.print("Enter your height in meters:");
		  
		  user_height = scnr.nextDouble();
		  user_height = Math.pow(user_height, 2.0);
		  
		  break;
		  
	 default :
		 
		 System.out.println("Input unknown. Program failed.");
		 
		 break;
	                   
	     }
		
	
	
	double BMI = (user_weight / user_height);
	
	System.out.println("Your BMI is currently " + BMI);
	
	if(BMI < 18.5)
	  {
	    System.out.println("You are considered to be underweight.");
	  }  
	
	else if (BMI < 25)
	       {   
			 System.out.println("You are considered to be at a normal weight.");
	       } 
	
	else if (BMI < 30)
		     {          
		        System.out.println("You are considered to be overweight.");
		     } 
	else 
	   {      
		System.out.println("You are considered to be obese.");
	   }
	
   }
	
}

