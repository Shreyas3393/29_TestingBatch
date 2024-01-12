package constructor;

public class Const 
{
	
		int m;
		int n;
		int o;
		
		public Const()//user defined without parameter/zero parameter
		{
		m=1;
		n=2;
		o=3;
		}
		public Const(int x)//user defined single parameter constructor
		{
		m=x;
		//n?
		//o?
		}
		public Const(int x, int y)//user defined two parameter constructor
		{
		m=x;
		n=y;
		//o?
		}
		public Const(int x, int y,int z)

		{
		m=x;
		n=y;
		o=z;
		}
		public static void main(String[] args)
		{
		Const c= new Const();
		c.addition();
		c.subtraction();
		System.out.println("===================");
		Const c1= new Const(100);
		c1.addition();
		c1.subtraction();
		System.out.println("===================");
		Const c2= new Const(9, 10);
		c2.addition();
		c2.subtraction();
		System.out.println("===================");
		}
		public void addition()// non static method
		{
		int sum=m+n+o;
		System.out.println("M value is "+m);
		System.out.println("N value is "+n);

		System.out.println("O value is "+o);
		System.out.println("Sum is "+sum);
		}
		public void subtraction()
		{
		int sub=m-n-o;
		System.out.println("sub is "+sub);
		}
}
