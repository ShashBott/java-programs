package huihui;
import java.util.*;
import java.lang.*;
public class StringCount {
public static void main(String args[])
{
	char arr[]= {'a','e','i','o','u'};
	int c=0,v=0;char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=sc.next();
	for(int i=0;i<str.length();i++) {	
    
	ch=str.charAt(i);
	
	for(int j=0;j<arr.length;j++)
	{
		if(ch==arr[j])
		{
			v++;	
		}
		
	}	
	 c++;}
	System.out.println("Consonants: "+c);
	System.out.println("Vowels: "+v);
}
}
