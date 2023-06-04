abstract class Bike{
	abstract void result();
}
public class AbstractClass extends Bike{
	void result()
	{
		System.out.println("Bike: Suzuki ");
	}
public static void main(String args[]) {
	Bike obj=new AbstractClass();
	obj.result();
}
}
