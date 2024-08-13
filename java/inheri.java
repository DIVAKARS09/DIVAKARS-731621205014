package dp;

class D{
	D(){
		this(5);
		System.out.println("A");
	}
	D(int a){
		super();// empty constructor
		System.out.println("D 1");
	}
}
class P extends D{
	P(){
		super(5);
		System.out.println("B");
	}
	P(int p){
		System.out.println("B 1");
	}
}
public class inheri {
	public static void main(String[] srgs) {
		P b=new P(5);
	}
}
