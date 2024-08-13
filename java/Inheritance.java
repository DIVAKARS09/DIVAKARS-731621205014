package dp;

class vecihle{
	void wheel(){
		System.out.println("vecihles");
	}
}
class Twowheeler extends vecihle{
	void noof(){
		System.out.println("I have 2 wheelers");
	}
}
class bike extends Twowheeler{
	void brand(){
		System.out.println("I want Avenger");

	}
}
class scooty extends vecihle{
	void sco() {
		System.out.println(" hi scooty");
	}
}
public class Inheritance {
	public static void main(String[] args) {
        bike onj = new bike();
        onj.noof();
        onj.brand();
        onj.wheel();
        scooty obj=new scooty();
        obj.sco();
        obj.wheel();
        obj.hashCode();
	}
}
