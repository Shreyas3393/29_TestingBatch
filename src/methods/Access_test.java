package methods;

public class Access_test 
{
					
				private void demo1()
	{
	System.out.println("Private method");
	}
				protected void demo2()
	{
	System.out.println("Protected Method");

	}
		public static void main(String[] args) 
	{

			Access_test at = new Access_test();

			at.demo1();
			at.demo2();
			
		}



}
