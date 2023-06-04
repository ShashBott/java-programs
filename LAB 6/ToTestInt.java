import java.util.*;
interface test{
	float square(float n);
}
class arithmetic implements test{
	public float square(float n) {
		return n*n;
	}
	
}
class ToTestInt  {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    arithmetic a=new arithmetic();
	    float i;
	    System.out.println("Enter a number to square it");
	    i=sc.nextInt();
	    System.out.println("Square is: "+a.square(i))
;	}
}
