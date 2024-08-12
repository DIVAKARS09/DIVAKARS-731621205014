package dp;

class Employee {
	int employeeId;
	String employeeName;
	float employeeSalary;
	Employee(int employeeId,String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	void display() {
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Salary:"+employeeSalary);
		
	}

}
public class day2{
	public static void amin(String[] args) {
		Employee emp1=new Employee(14,"diva",2000.0f);
		emp1.display();
	}
}
