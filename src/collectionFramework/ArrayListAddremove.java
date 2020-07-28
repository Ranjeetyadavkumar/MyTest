package collectionFramework;

import java.util.ArrayList;

public class ArrayListAddremove {


	public static void main(String[] args) {
		
		ArrayList<String> alts = new ArrayList<String>();
		alts.add("Ranjeet");
		alts.add("CHander");
		alts.add("Himani");
		alts.add("Adhi");
		alts.add("Damna");
		alts.add("santosh");
		
		//Displaying elements
		
	System.out.println("Original ArryList");
	
	 for(String str:alts)
	       System.out.println(str);
		
	//add element to the given index
	
	alts.add(0,"Rahul");
	alts.add(1,"justin");
	

    // Displaying elements
	
    System.out.println("ArrayList after add operation:");
    
    
    for(String str:alts)
       System.out.println(str);
    
    
    //Removing the String from the ArrayList
    
    alts.remove("Rahul");
    alts.remove("Justin");
    
    // Removing Elements ArrayList from the with index mtheod
    
    alts.remove(2);
    alts.remove(3);
    
    //ArrayLIst After Operation 
    
    
System.out.println("ArrayList after add operation:");
    
    
    for(String str:alts)
       System.out.println(str);    
    
    //Displaying the List
    
    System.out.println("Final ArrayList:");
    for(String str:alts)
       System.out.println(str);
    
	//get size
    
    int numberofitems = alts.size();
    System.out.println(numberofitems);
		
		
		
		
	}
	
}
