import java.util.*;
class Palindrom {
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter String:");
	 String s1=sc.nextLine();
	 StringBuffer sb1 = new StringBuffer(s1);
	 sb1.reverse();
	 String s2 = sb1.toString();
	 System.out.println(s2);
	 if(s1.equals(s2))
	 {
		 System.out.println("Palindrome");
	 }
	 else
	 {
		 System.out.println("Not Palindrome");
	 }
	 

	}

}