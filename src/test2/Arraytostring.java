package test2;

import java.util.Arrays;

public class Arraytostring {

	public static void main(String[] args) {
	
	boolean[] booleanArray = new boolean [] {true, false, true, false, true, false};	
	char[] chaArray = new char [] {'g', 'k', 'd', 'k', 'j', 'k', 'c', 'v', 'd', 's'};
	double[] duobleArray = new double [] {1, 2, 3, 4, 5, 6, 7,  8,7};
	int[] intArray = new int [] {1,2,3,4,5,6,7,8,9,10};
	Object[] objArray = new Object [] {1,2,3,4,5,6,7};

		System.out.println("boolean Array: " + Arrays.toString(booleanArray));
			
				
		System.out.println("charater Array: " + Arrays.toString(chaArray));
		
		System.out.println("Double Array :" + Arrays.toString(duobleArray));
		System.out.println("int Array : " + Arrays.toString(intArray));
		System.out.println("object Array :"  + Arrays.toString(objArray));
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
