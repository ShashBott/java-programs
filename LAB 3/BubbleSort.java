package huihui;
import java.util.Scanner;

public class BubbleSort {
	static void sort(int a[])
	{
		int len=a.length,t;
		System.out.println(len);
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
	
	static void  printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sort(arr);
		System.out.println("Array after sorting");
	    printArray(arr);
	}

}
