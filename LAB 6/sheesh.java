import java.util.*;
interface hima {
	void division(double a,double b);
	void modules(double a,double b);
}
class shush implements hima{
      public void division(double a,double b) {
    	  System.out.println("Answer for division: "+(a/b));
      }
      public void modules(double a,double b) {
    	  System.out.println("Remainder :"+(a%b));
      }
}
class overr
{
	public void division(double a,double b) {
  	  System.out.println("Answer for division: "+(a/b));
    }
    public void modules(double a,double b) {
  	  System.out.println("Remainder :"+(a%b));
    }
}
class sheesh
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   shush s=new shush();
	   overr r=new overr();
	   System.out.println("Enter two numbers for division and modules");
	   double i=sc.nextDouble();
	   double j=sc.nextDouble();
	   s.division(i,j);
	   s.modules(i,j);
	   System.out.println(" ");
	   //overriding methods are below
	   r.division(i,j);
	   r.modules(i,j);
	}
}