package dp;

class Worker {
    String name;
    String jobTitle;
    double salary;
    Worker(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    void giveRaise(double percentage) {
        salary += salary * (percentage / 100);
    }
    void updateSalary(double newSalary) {
        salary = newSalary;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Worker emp1 = new Worker("Divakar", "Frontend Develpoer", 60000);
        Worker emp2 = new Worker("Madhubala", "Project Manager", 80000);
        System.out.println("\nBefor Change");
        emp1.display();
        emp2.display();
        emp1.giveRaise(10); 
        emp2.updateSalary(85000);
        System.out.println("\nAfter Change");
        emp1.display();
        emp2.display();
    }
}

