package constructor;

public class ConstString 
{
	String name;
	public ConstString()
	{
	name="Manoj";
	}
	public ConstString(String a)
	{
	name=a;
	}
	public static void main(String[] args)
	{
	ConstString cs= new ConstString();
	cs.dsiplay();
	ConstString cs1= new ConstString("Sachin");
	cs1.dsiplay();
	ConstString cs2= new ConstString("Ganesh");
	cs2.dsiplay();
	}
	public void dsiplay()
	{
	System.out.println("My Name is "+name);
	}
	
}
