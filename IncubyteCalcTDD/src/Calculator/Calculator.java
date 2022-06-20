package Calculator;


public class Calculator {
	private String string = "";
	private String a1 = "";
	private String a2 = "";
	private int k=0;
	private int sum =0;
		
	public int searchCommas(String s1, char key) {
		for(int i = 0; i<s1.length();i++) {
			if(s1.charAt(i)==key) {
				return i;
			}
		}
		return -1;
	}
	
	public void split(String s2) {
		k = searchCommas(s2, ',');
		for(int i = 0; i<k;i++) {
			for(int j = k+1; j<s2.length();j++) {
				a1 = a1 + s2.charAt(i);
				a2 = a2 + s2.charAt(j);
			}	
		}	
	}
	
	public int add(String a1, String a2) {
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

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
