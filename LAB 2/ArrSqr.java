package hehe;
import java.util.*;
public class ArrSqr {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter the numbers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	    
		System.out.println("Array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int sqr=arr[i]*arr[i];
			System.out.println("Square of "+arr[i]+ " is :"+sqr);
			sum=arr[i]+sum;
		}
		System.out.println("Sum is:"+sum);
	}

}
