
public class OverLoadingLab {
	static void result(int t)
	{
		System.out.println("Result is: "+t);
	}
	static void result(int t,int u)
	{
		System.out.println("Result is: "+t+" "+u);
	}
	static void result(String s)
	{
		System.out.println("Result is: "+s);
	}
	
	public static void main(String args[])
	{
		result(5);
		result(7,8);
		result("Shesssh");
	}

}
