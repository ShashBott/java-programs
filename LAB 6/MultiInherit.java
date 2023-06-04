interface CarSpeed{
	void speed();
}
interface CarMileage{
	void Mileage();
}

class Car implements CarSpeed,CarMileage{
	public void speed(){
		System.out.println("Speed : 50kmph");
	}
	public void Mileage(){
		System.out.println("Mileage: 25kmpl");
	}
}
 class MultInherit {
    public static void  main(String args[]) {
    	Car c=new Car();
    	c.speed();
    	c.Mileage();
    }
}
