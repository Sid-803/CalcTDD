package Calculator;

public class Calculator {
	private String string = "";
	private String subString1 = "";
	private String subString2 = "";
	private int commaIndex = 0;
	private int integer1=0;
	private int integer2=0;
	
	public Calculator(String string){
		this.string = string;
	}
	
	//Input String
	public String getString() {
		return string;
	}
	
	public void setString(String string) {
		this.string = string;
	}

	//Comma saperated string after splitting from parent string
	public String getSubString1() {
		return subString1;
	}

	public void setSubString1(String subString1) {
		this.subString1 = subString1;
	}
	
	//Comma saperated string after splitting from parent string
	public String getSubString2() {
		return subString2;
	}

	public void setSubString2(String subString2) {
		this.subString2 = subString2;
	}
	
	//Returns index of comma, this index is used to split the string into two sub string.
	public int getCommaIndex() {
		return commaIndex;
	}

	public void setCommaIndex(int commaIndex) {
		this.commaIndex = commaIndex;
	}

	//Returns Integer for substring
	public int getInteger1() {
		return integer1;
	}

	public void setInteger1(int integer1) {
		this.integer1 = integer1;
	}

	//Returns Integer for substring
	public int getInteger2() {
		return integer2;
	}

	public void setInteger2(int integer2) {
		this.integer2 = integer2;
	}
}
