package Test;
//Basic Architecture of Calculator POJO class.
//1. Attribute 1 for POJO class is-string of String Datatype.
//2. It will contain a method which accepts String as parameter. MethodName "Add".
public class Test {
	static String string = null;
	static String a1 = null;
	static String a2 = null;
	
	public static int Add(String string) {
		int result=0;
		return result;
	}
	
	public static int searchCommas(String s1, char key) {
		for(int i = 0; i<s1.length();i++) {
			if(s1.charAt(i)==key) {
				return i;
			}
		}
		return -1;
	}
	
	public void split(String s1) {
		int k = searchCommas(s1, ',');
		for(int i = 0; i<k;i++) {
			for(int j = k+1; j<s1.length();j++) {
				char a = s1.charAt(i);
				char b = s1.charAt(j);
				a1 = a1 +a;
				a2 = a2 +b;
			}
		}
	}
	
	public static void main(String[] args) {

			string = "1,2,2";
			System.out.println(searchCommas(string,','));	
			
	}

}
