package Test;
//Basic Architecture of Calculator POJO class.
//1. Attribute 1 for POJO class is-string of String Datatype.
//2. It will contain a method which accepts String as parameter. MethodName "Add".
public class Test {
	static String string = "";
	static String a1 = "";
	static String a2 = "";
	static int k=0;
	static int sum =0;
		
	public static int searchCommas(String s1, char key) {
		for(int i = 0; i<s1.length();i++) {
			if(s1.charAt(i)==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void split(String s2) {
		k = searchCommas(s2, ',');
		for(int i = 0; i<k;i++) {
			for(int j = k+1; j<s2.length();j++) {
				char a = s2.charAt(i);
				char b = s2.charAt(j);
				a1 = a1 +a;
				a2 = a2 +b;
			}	
		}	
	}
	
	public static int add(String a1, String a2) {
		int k1 = Integer.valueOf(a1);
		int k2 = Integer.valueOf(a2);
		sum = k1 + k2;
		return sum;
	}
	
	public static void main(String[] args) {
			string = "1";
			split(string);
			System.out.println(add(a1,a2));	
	}
}
