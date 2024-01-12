package collection;

import java.util.ArrayList;

public class Addmethodprog 
{
	public static void main(String[] args) 
	{
	
		ArrayList<Object> arl = new ArrayList<>();	
		System.out.println(arl.add("Pune"));// Add Method (Objects)
		System.out.println(arl);
		arl.add(0,"Katraj"); //Add Method (index of)
		System.out.println(arl);
		System.out.println("----------------------------------------");
		/*
		 * arl.clear(); System.out.println(arl); //Add Method (Clear)
		 * System.out.println("----------------------------------------");
		 */
		Object arl1 = arl.clone();//Add Method (Clone)
		System.out.println("Clone Array List----->"+arl1);
		System.out.println("----------------------------------------");
		System.out.println(arl.contains("Pune"));//Add Method (Contains)True
		System.out.println(arl.contains("Mumbai"));//False
		System.out.println("----------------------------------------");
		arl.ensureCapacity(5);//Add Method (Ensure Capacity,Min5)
		arl.add("Solapur");
		System.out.println(arl);
		arl.add("Bharat");
		System.out.println(arl);
		arl.add("New");
		System.out.println(arl);
		System.out.println("----------------------------------------");
		System.out.println(arl1);
		System.out.println(arl);
		System.out.println(arl.equals(arl1));//Add Method (Equals)
		System.out.println("----------------------------------------");
		System.out.println(arl.get(2));//Get Method (index shows)
		System.out.println("-----------------------------------------");
		System.out.println(arl.indexOf("Solapur")); //Get Method (index Of)
		System.out.println("------------------------------------------");
		System.out.println(arl.isEmpty());//Get Method (Is Empty)
		System.out.println("--------------------------------------------");
		System.out.println(arl);
		System.out.println(arl.remove(1));//Get Method (Remove)
		System.out.println(arl);
		System.out.println("--------------------------------------------");
		arl.set(1,"Maharashtra");// Set Method(Index Of)
		System.out.println(arl);
		System.out.println("---------------------------------------------");
		System.out.println(arl.size());//Set Method(Size)
	
		
		
		
		
		
		
		
	}
}
