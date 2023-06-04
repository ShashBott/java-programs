package huihui;
import java.util.*;
public class ArrayDuplicatesLab {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the array");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int len=arr.length;
	for(int i=0;i<len-1;i++)
	{
		for(int j=i+1;j<len-i-1;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("Duplicates :"+arr[i]+" "+arr[j]);
			}
		}
}
}
}
