package methods;

public class MyClass3 {

	public static void main(String[] args) 
	{
		//to call non static methods from same class--> create object
		// classname objectname= new classname();
		MyClass3 m3= new MyClass3();
		// to call non static method--> objectname.methodname();
		m3.a();//calling non static method from same class
		m3.b();//calling non static method from same class
		// to call non-static methods from another class
		// create object of that(another) class
		//we want to call methods from MyClass4
		MyClass4 m4= new MyClass4();//created object of another class
		// to call non static method--> objectname.methodname();
		m4.c();//calling non static method from another class
		m4.d();//calling non static method from another class
		}
		public void a()// non static regular method
		{
		System.out.println("This is a non static method from MyClass3 ");
		}
		public void b()
		{
		System.out.println("This is b non static method from MyClass3");
	}

}
