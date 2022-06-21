package Test;

import Exception.NegativeNumberException;
import Services.ServiceLogic;


public class Test {
	
	public static void main(String[] args) {
		//Input String
		String s = "//;\n21,3";
		
		//Object of ServiceLogic POJO class
		ServiceLogic service = null;
		
		int sum=0;
		
		//Try-catch to handle if non integer value or negative number exist
		try {
			service = new ServiceLogic(s);
			
			//Read Comment in Calculator.java - add method
			sum = service.add();
			
			//Customer exception is thrown if k1 and/or negative after Calculator.add method is called.
			if(service.k1 <0 || service.k2<0) 
				throw new NegativeNumberException("Error Message: Addition not possible as negative number exist");
			
			//Handles if Invalid Integer format exist in String
		}catch(NumberFormatException e) {
			System.out.println("Error Message: NumberFormat Exception: invalid input string");
			System.exit(0);
		
		//Handles if negative numbers exist in String
		}catch(NegativeNumberException ex) {
			System.out.println(ex.getMessage());
			
		}finally{
			//Prints negative numbers in string if both numbers in string are negative after handling the respective exception
			if(service.k1 <0  & service.k2<0) 
				System.out.println("i.e " + service.k1 + "," + service.k2);
			
			//Doesnot calculate sum if anyone number in string is negative
			if (service.k1 <0 || service.k2 <0)  
				System.out.println("The sum is unavailable.");
			
			//Prints Sum in accepted scenerios
			else
				System.out.println("The sum is: " + sum);
		}
	}
}
