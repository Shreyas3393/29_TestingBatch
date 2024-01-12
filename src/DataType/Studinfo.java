package DataType;

public class Studinfo 
{
	public static void main(String[] args)
	{
		//Name,Gender,Avg_result,Marks,Pass-Fail Status
		
		//Variable declaration;
		
		String name;
		char gender;
		float avg_result;
		int marks;
		boolean result;	
		
		//variable initialization
		
		name="Sachin";
		gender='m';
		avg_result=99.5f;
		marks=90;
		result=true;
		
		//Usage
		System.out.println("----------------------------------");
		System.out.println("My Name Is= "+name);
		System.out.println("My Gender Is= "+gender);
		System.out.println("My Average result is= "+avg_result);
		System.out.println("My Marks Is= "+marks);
		System.out.println("My Result Status is= "+result+" (Pass)");
		System.out.println("-----------------------------------");
	
		
		
		
	}
}
