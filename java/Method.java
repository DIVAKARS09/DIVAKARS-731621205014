package dp;

public class Method {
	void mymethod() {
		System.out.println("Instance method");
	}
	static void mymethod2() {
		System.out.println("Static method");
	}
	public static void main(String[] agrs) {
		Method obj=new Method();
		obj.mymethod();
		
		mymethod2();
	}
}
