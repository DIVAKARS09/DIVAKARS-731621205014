package dp;

public class variable {
	int b=20;//instance or object variable
	static int c=30;//static variable
	public static void main(String[] args) {
		int a=10;//local variable
		System.out.println("local variable:"+a);
		variable obj=new variable();
		System.out.println(obj.b);
		System.out.println(variable.c);
	}
}
