package abstractexample;

public class Conc1 extends Abstr1
{

	public static void main(String[] args)
	
	{
		Conc1 c1 = new Conc1();
		c1.Test1(90,30,"Shubham Ismart Boy ");
		c1.Test2(70, 50);
		
		
	}

	@Override
	public void Test1(int a, int b, String name)
	{
		int div=a/b;
		
		System.out.println("Dividation "+div);
		System.out.println("======================");
		System.out.println("Hi My name is "+name);
		System.out.println("======================");
	}
	

}
