package collectionFramework;

import java.util.ArrayList;

public class AddingArryList {

	public static void main(String[] args) {
	
		ArrayList<Integer> alt = new ArrayList<Integer>();
		
		//Adding the Element

		alt.add(11);
		alt.add(99);
		alt.add(0);
		alt.add(5);
		alt.add(14);
		alt.add(89);
		alt.add(23);
		alt.add(7);
		alt.add(10);
		
		//displaying integer
		System.out.println(alt);
		
		//Adding ineteger 55 at 4th position
		
		//alt.add(3, 55);
		alt.remove(3);
		alt.remove(2);
		alt.remove(6);
		alt.remove(5);
		
		//Adding ineteger 99 at 1st position
		//alt.add(1,99);
		//Adding ineteger 89 at 2nd position
		//alt.add(2, 89);
		
		//displaying the list
		System.out.println(alt);
		
		
		
	}

}
