 class derived
	{
	    void private result()
	   {
           System.out.println("this is a private member ");
	   }

     }
  class Modifiers extends derived
 {
	 public static void main(String args[])
	 {
		 derived obj=new derived();
		 obj.result();
     }
 }