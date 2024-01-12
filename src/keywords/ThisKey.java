package keywords;

 public class ThisKey extends SuperCls

{
	int x =20;
	 
 public void Add() 
{
	int x=30;
	int y=40;
	int sum = super.x+y;
	int sum1= this.x+y;
	
System.out.println("Super Class Addition "+sum);
System.out.println("This Class Addition "+sum1);

	}
 public static void main(String[] args) 
 {
	 ThisKey tk = new ThisKey();
	 tk.Add();
}
}
