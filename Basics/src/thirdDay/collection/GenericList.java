package thirdDay.collection;

import java.util.ArrayList;
import java.util.List;

//Generic List can add only specific data type elements
public class GenericList {

	public static void main(String[] args) {
		//To only add String Type elements
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("From");
		list.add("Shreejit");
		list.add("Bhattarai");
		//list.add(5);can't add an number
		
		//Removing element from index 1 i.e "From" in list
			list.remove(1);
		//Removing element "Bhattarai" form the list 
			list.remove("Bhattarai");
		
		//Adding a element in specific index in this case index=1
			list.add(1,"Hi!");
		//Doing so every element in the list is pushed down an index
			
			
		for(String temp:list){
			System.out.println(temp);
		}
		
	}

}
