package methods;

public class StudInfo {
	public static void main(String[] args)
	{
	StudInfo si= new StudInfo();
	si.studentDetails();
	si.studentDetails();
	si.studentDetails();
	si.studentDetails("Somnath", 50, 'M', 98.9f);
	si.studentDetails("Ganesh", 35,'M', 60.75f);
	}
	public void studentDetails()// method without parameter
	{
	//name, rollNum, Gender, avg
	String name;
	int rollNum;
	char gender;

	float avg;
	name="Rupesh";
	rollNum=50;
	gender='M';
	avg=79.80f;
	System.out.println("-----------------------------");
	System.out.println("My name is "+name);
	System.out.println("My roll num is "+rollNum);
	System.out.println("My gender is "+gender);
	System.out.println("My marks are "+avg);
	System.out.println("-----------------------------");
	}
	public void studentDetails(String name,int rollNum,char gender, float avg)// method with parameter
	{
	//name, rollNum, Gender, avg
	String team;
	team="IND";
	System.out.println("-----------------------------");
	System.out.println("My name is "+name);
	System.out.println("My roll number is "+rollNum);
	System.out.println("My gender is "+gender);
	System.out.println("My marks are "+avg);
	System.out.println("My team is "+team);
	System.out.println("-----------------------------");

	}
}
