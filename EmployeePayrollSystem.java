abstract class Employee {
	
	protected String empID;
	protected String empName;
	abstract double calculateSalary();
	
	public Employee(String empID, String empName) {
		
		this.empID = empID;
		this.empName = empName;
		
	}
	
}

interface Payable {
	
	void generatePayslip();
	
}

class PermanentEmployee extends Employee implements Payable{


	private double baseSalary;
	
	public PermanentEmployee(String empID, String empName,double baseSalary) {
		
		super(empID,empName);
		this.baseSalary = baseSalary;
		
	}
	
	@Override
	public double calculateSalary() {
		
		return baseSalary;
		
	}
	
	@Override
	public void generatePayslip() {
		
		double salary = calculateSalary();
		
		System.out.println ("Employee ID : "+empID);
		System.out.println ("Employee name : "+empName);
		System.out.println ("Employee total salary : "+salary);
		
	}
	
}

class ContractEmployee extends Employee implements Payable{


	private int workHours;
	
	public ContractEmployee(String empID, String empName,int workHours) {
		
		super(empID,empName);
		this.workHours = workHours;
		
	}
	
	@Override
	public double calculateSalary() {
		
		return workHours * 100;
		
	}
	
	@Override
	public void generatePayslip() {
		
		double salary = calculateSalary();
		
		System.out.println ("Employee ID : "+empID);
		System.out.println ("Employee name : "+empName);
		System.out.println ("Employee total salary : "+salary);
		
	}
	
}

public class EmployeePayrollSystem {
	public static void main (String...args) {
		
		Employee[] employees = new Employee[2];
		
		employees[0] = new PermanentEmployee("EMP1020","u",100000);
		employees[1] = new ContractEmployee("EMP3020","me",8);
		
		for (Employee emp : employees) {
			
			if (emp instanceof Payable) {
				
				((Payable)emp).generatePayslip();
				
			}
			
			
		}
		
	}
	
}




		
		
	
	
	