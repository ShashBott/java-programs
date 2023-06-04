package pack;
class A {
	int x,y,z;
	int get(int p,int q) {
		x=p;y=q;
		return 0;
	}
	void show() {
	System.out.println(x);	
	}
}
	class B extends A
{
	public static void main(String args[])
	{
		B obj=new B(); 
	    obj.get(99, 8);
	    obj.show();
	    System.out.println("B");
	}
}
