package Test;
//Basic Architecture of Calculator POJO class.
//1. Attribute 1 for POJO class is-string of String Datatype.
//2. It will contain a method which accepts String as parameter. MethodName "Add".
public class Test {
	static String string = null;
	
	public static int Add(String string) {
		int result=0;
		return result;
	}
	
	public int searchCommas(String a3, char key) {
		for(int i = 0; i<a3.length();i++) {
			if(a3.charAt(i)==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		string = "";
		System.out.println(Add(string));	}

}
