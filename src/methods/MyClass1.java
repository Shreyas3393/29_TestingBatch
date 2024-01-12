package methods;

public class MyClass1 
{

	//this is example for static method calling from another(different) class
	
	public static void main(String[] args)
	{
	//methodName();
	demo1();//calling static method from same class
	demo2();
	//calling static method from another class
	//className.methodName();
	MyClass2.sample1();//calling static method from another class
	MyClass2.sample2();//calling static method from another class
	}
	public static void demo1()//static regular complete method
	{
	System.out.println("Hi this is demo1 method from MyClass1");
	}
	public static void demo2()//static regular complete method
	{
	System.out.println("Hi this is demo2 method from MyClass1");
	}
	}

