package huihui;
import java.util.*;
public class BinarySearch {
   static  int Search(int a[],int l,int len,int x)
	{
		
		if(len>=1) 
		{
		int mid= l+(len-1)/2;
		if(a[mid]==x) 
			return mid;
		
		if(a[mid]>x)
		
			return Search(a,l,mid-1,x);
		
		else 
			return Search(a,mid+1,len,x);
		
		
		}
		return -1;
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
	System.out.println("Enter the number to search");
	int x=sc.nextInt();
	int result=Search(arr,0,n-1,x);
    if(result==-1)
    	System.out.println("Number not found");
    else
    	System.out.println("Number found at index"+result);
}
}
