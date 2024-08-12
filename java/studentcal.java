package dp;
import java.util.*;

class Student {
    int regno;
    String name;
    int[] arr = new int[5];
    int sum = 0, avg = 0;
    String grade;
    Student(int regno, String name) {
        this.regno = regno;
        this.name = name;
    }
    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 subject marks:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void calculateGrade() {
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;

        if (avg >= 90)
            grade = "A";
        else if (avg >= 80)
            grade = "B";
        else if (avg >= 60)
            grade = "C";
        else if (avg >= 50)
            grade = "D";
        else
            grade = "Fail";
    }
    void display() {
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
public class studentcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter regno:");
        int regno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        Student student = new Student(regno, name);
        student.getMarks();
        student.calculateGrade();
        student.display();
    }
}
