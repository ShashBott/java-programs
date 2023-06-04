package hehe;

import java.util.*;
public class ThreeDig {

	public static void main(String args[])
			{
		       int arr[]= new int[3];
		       Scanner sc=new Scanner(System.in);  
		       System.out.println("Enter the digits ");
		       for(int x=0;x<arr.length;x++)
		       {
		    	   arr[x]=sc.nextInt();
		       }
		       for(int i=0;i<3;i++)
		       {
		    	   for(int j=0;j<3;j++)
		    	   {
		    		   for(int k=0;k<3;k++)
		    		   {
		    			   if(i!=j && j!=k && k!=i) 
		    			   {
		    				   System.out.println(arr[i]+""+arr[j]+""+arr[k]);
		    				   
		    			   }
		    				   
		    		   }
		    	   }
		       }
		       
		    		   
			}
}
