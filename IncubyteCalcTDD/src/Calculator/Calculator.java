package Calculator;

public class Calculator {
	private String string = "";
	private String a1 = "";
	private String a2 = "";
	private int i = 0;
	private int k1=0;
	private int k2=0;
	
	public Calculator(String string) {
		this.string = string;
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
			if(!string.isEmpty()) {
				string=delimiter(string);
			}
			
			searchCommas(string);
			for(int j = 0; j<i;j++) {
				a1 = a1 + string.charAt(j);
			}
			for(int k = i+1; k<string.length();k++) {		
				a2 = a2 + string.charAt(k);
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
	
	

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int getK1() {
		return k1;
	}

	public int getK2() {
		return k2;
	}
}
