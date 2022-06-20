package Calculator;


public class Calculator {
	private String string = "";
	private String a1 = "";
	private String a2 = "";
	//private int k=0;
	private int sum =0;
	public int i = 0;
	
	public Calculator(String string) {
		this.string = string;
	}
	
	public int searchCommas(String s1) {
		if(s1.charAt(i) != ','){
			i++;
			searchCommas(s1);
			}
		return i;
	}
	
	public int add(String s1, String a1, String a2) {
		if(s1.charAt(i) != ','){
			i++;
			searchCommas(s1);
			}
		
		for(int j = 0; j<i;j++) {
			for(int k = i+1; k<s1.length();k++) {
				a1 = a1 + s1.charAt(j);
				a2 = a2 + s1.charAt(k);
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

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	//public int getK() {
	//	return k;
	//}

	//public void setK(int k) {
	//	this.k = k;
	//}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
