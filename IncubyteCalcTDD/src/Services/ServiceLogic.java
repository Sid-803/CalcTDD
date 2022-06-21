package Services;

import Calculator.Calculator;

public class ServiceLogic {
	
	public String s = "";
	Calculator calculator = new Calculator(s);
	public int i = calculator.getCommaIndex();
	public String a1 = calculator.getSubString1();
	public String a2 = calculator.getSubString2();
	public int k1 = calculator.getInteger1();
	public int k2 = calculator.getInteger2();
	
	
	public ServiceLogic(String s) {
		this.s = s;
	}

	//Algo for this method
	//1. Check if string is empty, if not check for delimiter.
	//2. Delimiter method removes delimiting componenets(if exist). Output is Integer figures and commas 
	//3. Assign attribute i value where string has comma.
	//4. Splits the single string(string) into two sub-string(a1,a2) separated by comma(pre comma=a2 and post comma =a2)  based on i value
	//5. Converts both sub strings(a1,a2) into integers(k1,k2)
	//6. Returns sum of both Integers
	//Exceptions: Throws NumberFormatException if k1 or k2 is anything other than Integer.
	public int add() {
		if(!s.isEmpty()) {
			s=delimiter(s);
		}
		
		searchCommas(s);
		for(int j = 0; j<i;j++) {
			a1 = a1 + s.charAt(j);
		}
		for(int k = i+1; k<s.length();k++) {		
			a2 = a2 + s.charAt(k);
		}
		k1= Integer.valueOf(a1);
		k2= Integer.valueOf(a2);
		return k1+k2;
	}

	//Simplifies string input of format "//;\n1,2" into "1,2"
	public String delimiter(String s) {
		s=s.replace("\n","");
		if(s.charAt(0)=='/') {
			String s0="";
			for(int k=3;k<s.length();k++) {
				if(s.charAt(k)==';' || s.charAt(k)==' '|| s.charAt(k)=='.') {
					s0=s0+',';
				}else {
					s0=s0+s.charAt(k);
				}	
			}
			return s0;
		}else {
		return s;
		}
	}

	//Assign attribute i, the value of index where comma exist
	public void searchCommas(String s1) {
		for(int k =0; k<s1.length();k++) {
			if(s1.charAt(k)==',')
				i=k;
		}
	}
}
