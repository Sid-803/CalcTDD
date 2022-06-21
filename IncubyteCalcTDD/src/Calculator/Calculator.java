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
		
	public void searchCommas(String s1) {
		for(int k =0; k<s1.length();k++) {
			if(s1.charAt(k)==',')
				i=k;
		}
	}
	
	public int add(String s2) {
		searchCommas(s2);
		for(int j = 0; j<i;j++) {
			a1 = a1 + s2.charAt(j);
		}
		for(int k = i+1; k<s2.length();k++) {		
			a2 = a2 + s2.charAt(k);
		}
		k1= Integer.valueOf(a1);
		k2= Integer.valueOf(a2);
		return k1+k2;
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
