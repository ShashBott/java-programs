import java.util.*;
interface neww{
	float pi=3.14f;
	void calc(float r);
}
class hehe implements neww {
	public void calc(float r)
	{
		float area=pi*r*r;
		System.out.println("Area of the circle is: "+area);
		
	}
}
class Usefulness{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		hehe h=new hehe();
		System.out.println("Enter radius to find area of a circle ");
		float rad=sc.nextFloat();
		h.calc(rad);
	}
}