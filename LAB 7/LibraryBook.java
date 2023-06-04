import java.util.*;
import Book.*;
public class LibraryBook {
	public static void main(String args[])
	{
		Book2 b=new Book2();
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Press 1 to borrow the book 2 to exit");
		i=sc.nextInt();
		if(i==1)
			b.msg();
		else
			System.out.println("Thankyou !");
	}


}
