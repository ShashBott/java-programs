
class Worker {
	String name;
    Worker(String n)
    {
    	name=n;
        
    }
    void show()
    {
    	System.out.println("Worker Name:"+name);	
    }
}


class DailyWorker extends Worker{
	int rate;
	DailyWorker(String n,int r)
	{
		super(n);
		rate=r;
	}
	void ComPay(int hours)
	{
		show();
		System.out.println("Salary: "+rate*hours);
	}
}


class SalariedWorker extends Worker{
	int rate;
	SalariedWorker(String n,int r)
	{
		super(n);
		rate=r;
	}
	void ComPay()
	{
		show();
		System.out.println("Salary: "+rate*40);
	}
	
}



class hello
{
	public static void main(String args[])
	{
		DailyWorker d=new DailyWorker("Shashwat",67);
		SalariedWorker s=new SalariedWorker("Karan",89);
		d.ComPay(45);
		s.ComPay();
	}
}