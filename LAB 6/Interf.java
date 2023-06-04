import java.util.Scanner;
interface _A{
	void meth1(int a,int b);
	void meth2(int a,int b);	
}
class MyClass implements _A{
	public void meth1(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum is: "+sum);
	}
	public void meth2(int a,int b)
	{
		int mult=a*b;
		System.out.println("Product is: "+mult);
	}
}
public class Interf {
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 MyClass m=new MyClass();
    	 System.out.println("Enter two numbers for addition and multiplication");
    	 int i=sc.nextInt();
    	 int j=sc.nextInt();
         m.meth1(i,j);
    	 m.meth2(i,j);
     }
}
