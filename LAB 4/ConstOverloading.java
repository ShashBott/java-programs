
public class ConstOverloading {
	 
	int id;  
	String name;  
	  
	ConstOverloading(){  
	System.out.println("this a default constructor");  
	}  
	  
	ConstOverloading(int i, String n){  
	id = i;  
	name = n;  
	}  
	  
	public static void main(String[] args) {  
	//object creation  
	ConstOverloading s = new ConstOverloading();  
	System.out.println("\nDefault Constructor values: \n");  
	System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
	  
	System.out.println("\nParameterized Constructor values: \n");  
	ConstOverloading student = new ConstOverloading(10, "David");  
	System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
	}  
}  

