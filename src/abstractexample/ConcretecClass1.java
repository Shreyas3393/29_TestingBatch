package abstractexample;

public class ConcretecClass1 extends Class1 
{
	
	public static void main(String[] args) 
	{
		ConcretecClass1 cc= new ConcretecClass1();
		cc.class2();
		cc.class3();
		cc.class4();
		cc.class5(50, 45.32f);
	}
	
	
	void class4() 
	{
		
		System.out.println("This Is defualt Complete method Form Concrete class");
		System.out.println("----------------------------");
	}

	@Override
	public void class3()
	{
		
	System.out.println("This Is abstract incomplete method Form class1 completed in concrete class");
	System.out.println("----------------------------");
	}


	@Override
	public void class5(int a, float b)
	{
		float sum = a+b;
		System.out.println("----------------------------");
		System.out.println("Addition = "+sum);
		
	}
	 
	

}
