package Array;

public class booleanmularr {

	public static void main(String[] args)
	{
		// true false true 
		// true true true
		// false false false
		
		
		boolean result [][]= {{true,false,true},{true,true,true},{false,false,false}};
		
		for (int i=0;i<=result.length-1;i++)
		{
			for (int j=0;j<=result.length-1;j++) 
			{
				System.out.print(result[i][j]+" ");
				
			}
			System.out.println();
		}
		 

	}

}
