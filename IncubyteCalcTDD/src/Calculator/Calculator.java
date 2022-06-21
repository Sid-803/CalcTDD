package Calculator;

public class Calculator {
	private String string = "";
	private String a1 = "";
	private String a2 = "";
	private int i = 0;
	private int k1=0;
	private int k2=0;
	
	public Calculator(String string){
		this.string = string;
	}
	
	public void setI(int i) {
		this.i = i;
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
	
	public int getI() {
		return i;
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
}
