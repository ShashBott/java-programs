import java.util.*;
class Employee {
	String n;
	int id;
	double s;
	Employee(){
		
	}
	Employee(String name,int empid,double salary){
		n=name;
		id=empid;
		s=salary;
	}
	void showName()
	{
		System.out.println("Employee name: "+n);
		
	}
	
	void showSalary() {
		System.out.println("Employee salary: "+s);
		
	}
	
	
     double increaseSalary(double p) 
     {
    	double inc=(s*(p/100));
    	double salary=s+inc;
    	return salary;
     }
}
class Manager extends Employee{
	public static String department="IT";
	Manager(String name,int empid,int salary){
		super(name,empid,salary);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the employee id");
		int empid=sc.nextInt();
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		System.out.println("enter the percentage_rate increaced in salary");
		double p=sc.nextDouble();
		Employee e=new Employee(name,empid,salary);
		e.showName();
		e.showSalary();
		System.out.println(department);
		System.out.println("Salary: "+e.increaseSalary(p));
	}
	
}