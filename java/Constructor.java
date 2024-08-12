package dp;

public class Constructor {
	String name;
	Constructor (String name){
		this(10,20);
		this.name=name;
		this.greeting();
	}
	Constructor(int a,int b){
		System.out.println("Addition:"+(a+b));
	}
	void greeting() {
		System.out.println("Welcome "+name);
	}
	public static void main(String[] args) {
		Constructor c=new Constructor("Diva");
	}
}
