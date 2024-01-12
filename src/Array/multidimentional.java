package Array;

public class multidimentional {

	public static void main(String[] args) 
	{	
		
	//10 20
	//30 40
		
		int num[][]=new int [2][2]; //capacity
		
		num [0][0]= 10;
		num [0][1]= 20;
		num [1][0]= 30;
		num [1][1]= 40;
		
		for (int i=0;i<=num.length-1;i++)
		{
			for (int j=0;j<=num.length-1;j++)
			{
				
				System.out.print(num[i][j]+" ");
			}
			
			System.out.println();
	}
}

}
