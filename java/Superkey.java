package dp;
class A{
	int a=10;
	A(String name){
		System.out.println("welcome "+name);
	}
	void my() {
		System.out.println("super Class");
	}
	
}

class B extends A{
	B(){
		super("diva");
	}
	void my2() {
		System.out.println("Super class variable: "+super.a);
		super.my();
	}
	
}
public class Superkey {
	public static void main(String[] srgs) {
		B b=new B();
		b.my2();
	}
}
