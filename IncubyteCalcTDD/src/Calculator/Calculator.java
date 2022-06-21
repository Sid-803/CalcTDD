package Calculator;


public class Calculator {
	private String string = "";
	private String a1 = "";
	private String a2 = "";
	private int sum =0;
	public int i = 0;
	public String temp="";
	public boolean flag = false;
	
	public Calculator(String string) {
		this.string = string;
	}
	
	
	public void searchCommas(String s1) {
		for(int k =0; k<s1.length();k++) {
			if(s1.charAt(k)==',')
				i=k;
		}
		
	}
	
	public int add(String s2, String a1, String a2) {
		if(s2!="") {
			searchCommas(s2);
		}
		
		for(int j = 0; j<i;j++) {
			for(int k = i+1; k<s2.length();k++) {
				a1 = a1 + s2.charAt(j);
				a2 = a2 + s2.charAt(k);
			}	
		}
		
			sum = Integer.valueOf(a1) + Integer.valueOf(a2);
		
		return sum;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getA1() {
		return a1;
	}

	public String getA2() {
		return a2;
	}

}
