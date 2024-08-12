import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter no:");
        int numTerms = scanner.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(first + " ");
            int res  = first + second;
            first = second;
            second = res;
        }
    }
}