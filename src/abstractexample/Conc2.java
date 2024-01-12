package abstractexample;

public class Conc2 extends Abstr1
{
	public static void main(String[] args) 
	{
		Conc2 c2 =new Conc2();
		c2.Test2(30, 60);
		c2.Test1(50, 10,"Vedantiiiiiii");
	
	}

	@Override
	public void Test1(int a, int b, String name)
	{
		int sub = a-b;
	
		System.out.println("Hi This Concrete 2 extend Abstract1");
		System.out.println("======================");
		System.out.println("Substration "+sub);
		System.out.println("======================");
		System.out.println("Hi My name Is "+name);
		
	}

}
