package dp;
//Construct overloading
public class coverloading {
	coverloading(String name) {
		System.out.println(name);
	}
	coverloading(int a,int b) {
		System.out.println("Addition:"+(a+b));
	}
	coverloading(int n) {
		System.out.println("Value of data:"+n);
	}
	public static void main(String[] args) {
		coverloading ov=new coverloading("Diva");
		coverloading ov1=new coverloading(10,20);
		coverloading ov2=new coverloading(30);
		
		
	}
}