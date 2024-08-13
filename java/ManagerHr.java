package dp;

class Employee1 {
    void work() {
        System.out.println("Employee Salary");
    }
    double getSalary() {
        return 50000.0;  
    }
}

class HRManager extends Employee1 {
    void work() {
        System.out.println("HR Manager");
    }
    void addEmployee() {
        System.out.println("New employee");
    }
}
public class ManagerHr {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.work(); 
        System.out.println("Salary: " + emp.getSalary());
        HRManager hr = new HRManager();
        hr.work(); 
        hr.addEmployee();
        System.out.println("Salary: " + hr.getSalary());  
    }
}
