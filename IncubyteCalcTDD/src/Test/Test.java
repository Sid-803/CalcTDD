package Test;

import Exception.NegativeNumberException;

import Calculator.Calculator;

//Basic Architecture of Calculator POJO class.
//1. Attribute 1 for POJO class is-string of String Datatype.
//2. It will contain a method which accepts String as parameter. MethodName "Add".
public class Test {
	
	
	public static void main(String[] args) {
		String s = "//;\n11,2";
		Calculator calculator = null;
		int sum=0;
		
		try {
			calculator = new Calculator(s);
			if(!s.isEmpty()) {
				calculator.setString(calculator.delimiter(s));
			}
			sum = calculator.add(calculator.getString());
			if(calculator.getK1() <0 || calculator.getK2()<0) 
				throw new NegativeNumberException("Error Message: Addition not possible as negative number exist");
				
		}catch(NumberFormatException e) {
			System.out.println("Error Message: NumberFormat Exception: invalid input string");
			System.exit(0);
		}catch(NegativeNumberException ex) {
			System.out.println(ex.getMessage());
			
	}finally{
			if(calculator.getK1() <0  & calculator.getK2()<0) 
				System.out.println("i.e " + calculator.getK1() + "," + calculator.getK2());
			if (calculator.getK1() <0 || calculator.getK2() <0)  
				System.out.println("The sum is unavailable.");
			else
				System.out.println("The sum is: " + sum);
		}
	}
}
