package hehe;
import java.util.Scanner;

public class ArrayGradeLab {
	public static void main(String args[])
	{
		int n,t=0;
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter marks");
		for(int i=0;i<10;i++)
		{
		   arr[i]=sc.nextInt();
		}
		for(int j=0;j<10;j++)
		{
			if(arr[j]>40 && arr[j]<50 )
			{
				System.out.println(arr[j]+" PASS");
			}
			else if(arr[j]>50 && arr[j]<75)
			{
				System.out.println(arr[j]+" MERIT");
			}
			else if(arr[j]>75) {
				System.out.println(arr[j]+" DISTINCTION");
			}
			else
				System.out.println(arr[j]+" FAIL");
		}
	}

}
