import java.util.*;
class Pattern {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("");
        while(n>0){
            for (int i=1; i<=n; i++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
            n--;
        }
     }
}