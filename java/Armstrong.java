import java.util.*;
class Armstrong {
    public static void main(String[] args) {
        int originalnum, r, result = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no:");
	int num=sc.nextInt();
        originalnum = num;
        while (originalnum != 0)
        {
            r = originalnum % 10;
            result += Math.pow(r,3);
            originalnum /= 10;
        }
        if(result == num)
            System.out.println("Armstrong number");
        else
            System.out.println("not an Armstrong number");
    }
}