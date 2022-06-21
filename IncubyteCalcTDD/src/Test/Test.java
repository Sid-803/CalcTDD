package Test;

import Calculator.Calculator;

//Basic Architecture of Calculator POJO class.
//1. Attribute 1 for POJO class is-string of String Datatype.
//2. It will contain a method which accepts String as parameter. MethodName "Add".
public class Test {
	
	
	public static void main(String[] args) {
		String s = "1";
		Calculator calculator = null; 
		//calculator.setString(calculator.delimeter(s));
		//System.out.println(calculator.getString());
		try {
			calculator = new Calculator(s);
			System.out.println(calculator.add(calculator.getString(),calculator.getA1(),calculator.getA2()));
		}catch(NumberFormatException e) {
			System.out.println("Error Message: NumberFormat Exception: invalid input string");
		}finally{
			if(calculator.getString()== "")
				System.out.println("Insufficient data");
		}
	}
}
