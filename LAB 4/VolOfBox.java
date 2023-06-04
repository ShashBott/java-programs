
public class VolOfBox {
	    static double area(float l, float w, float h) 
	    {
	        return l * w * h;
	    }

	    static double area(float l)
	    {
	        return l * l * l;
	    }

	    static double area(float r, float h)
	    {
	        return 3.1416 * r * r * h;
	    }
	
 
	    public static void main(String args[]) 
	    {
	        System.out.println("Area of ractangular box is " +area(5.5f, 8.0f, 9.1f));
	        System.out.println("");
	        
	        System.out.println("Area of cubical box is " +area(5.0f));
	        System.out.println("");
	 
	        System.out.println("Area of cylindrical box is " +area(6.1f, 1.3f));
	    }
	}



