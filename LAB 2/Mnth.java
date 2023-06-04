package hehe;
import java.util.*;
public class Mnth {
       public static void main(String args[])
       {
    	   Scanner sc=new Scanner(System.in);
    	   String arr[]= new String[] {"January","Feburary","March","April","May","June","July","August","September","October","Novemver","December"};
    	   int month;
    	   System.out.println("Enter the number of month ");
    	   month=sc.nextInt();
    	   if(month>12 || month<1)
    	   {
    		   System.out.println("Invalid input");
    	   }
    	   else 
    	   {
    		   System.out.println(arr[month-1]); 
    	   }
       }
}
