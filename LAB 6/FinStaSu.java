
class a{
	static int b=100;
	final int a=50;
	
}
class FinStaSu extends a{
   void example() {
	   super.b=3*super.b;
	   System.out.println(super.b);
	   
	  /*if we write this statement in our program we get a compile time error.
	   a=100;*/
	   
	   System.out.println(super.a);
   }
   
   public static void main(String args[])
   {
	   FinStaSu f=new FinStaSu();
	   f.example();
   }
}
