package methods;

public class MathOperations {

	public static void main(String[] args) 
	{
		MathOperations mo= new MathOperations();
		mo.addition();
		mo.addition(10, 20, 30);
		mo.addition(44, 55, 66);
		mo.subtraction(100, 10);
		mo.subtraction(54,32);
		}
		public void addition()// method without parameter
		{
		int a;
		int b;
		int sum;
		a=30;
		b=80;
		sum=a+b;
		System.out.println("addition is "+sum);
		}
		public void addition(int a, int b, int c)
		{
		int sum=a+b+c;

		System.out.println("Addition is "+sum);
		}
		public void subtraction(int a, int b)//method with parameter
		{
		int sub;
		sub=a-b;
		System.out.println("subtraction is "+sub);

	}

}
