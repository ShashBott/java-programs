import Balance.*;
import java.util.*;
public class DispBal {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int accNo;
	Account obj=new Account();
	System.out.println("Enter Account number (last 4 digits) : ");
	accNo=sc.nextInt();
	System.out.println("The Account number is "+accNo);
	obj.Display_Balance(1000.45);
	}
}
