//package dp;
////method overloading
//public class overloading {
//	void my(String name) {
//		System.out.println(name);
//	}
//	void my(int a,int b) {
//		System.out.println("Addition:"+(a+b));
//	}
//	void my(int n) {
//		System.out.println("Value of data:"+n);
//	}
//	public static void main(String[] args) {
//		overloading ov=new overloading();
//		ov.my("Diva");
//		ov.my(10,20);
//		ov.my(10);
//		
//	}
//}
package dp;
//Construct overloading
public class overloading {
	overloading(String name) {
		System.out.println(name);
	}
	overloading(int a,int b) {
		System.out.println("Addition:"+(a+b));
	}
	overloading(int n) {
		System.out.println("Value of data:"+n);
	}
	public static void main(String[] args) {
		overloading ov=new overloading("Diva");
		overloading ov1=new overloading(10,20);
		overloading ov2=new overloading(30);
		
		
	}
}

