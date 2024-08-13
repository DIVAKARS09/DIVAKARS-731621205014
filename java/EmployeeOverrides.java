package dp;

class Person1 {
    String firstName;
    String lastName;
    Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
}
class Employee extends Person1 {
    String employeeId;
    String jobTitle;
    Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    String getEmployeeId() {
        return employeeId;
    }
    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }
}

public class EmployeeOverrides {
    public static void main(String[] args) {
        Employee emp = new Employee("Divakar", "Sakthivel", "14", "FrontEnd Developer");
        System.out.println("First Name: " + emp.getFirstName());    
        System.out.println("Last Name: " + emp.getLastName());      
        System.out.println("Employee ID: " + emp.getEmployeeId()); 
    }
}

