package methods;


public class NonStaticMethodFromSameClass 
{

	public static void main(String[] args) 
	{
		//to call non static methods we need object
		//? how to create object
		//ClassName objectName= new ClassName();
		NonStaticMethodFromSameClass obj1 = new NonStaticMethodFromSameClass(); //createdobject
		// how to call Non-static method
		// syntax--> objectName.methodName();
		obj1.test1();// calling Non-static method from same class
		obj1.test2();// calling Non-static method from same class
		}
		public void test1()// non-static method complete and regular
		{
		System.out.println("This is non static method from same class");
		}
		public void test2()// non-static method complete and regular
		{
		System.out.println("This is non static method from same class");
	}

}
