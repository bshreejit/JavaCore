package thirdDay.collection;

import java.util.HashMap;

public class ExampleHashMap {
	public static void main(String[] args) {
		
		/*Non-Generic HashMap*/
		HashMap hm=new HashMap();
		//obj.put(key,value);
		hm.put("Employee1", 35000.68);
		hm.put("Employee2", true);
		hm.put(3, "Shreejit");
		/*Unlike list we dont need to use loop to 
		  fetch the value; instead we use key*/
		System.out.println(hm.get("Employee1"));
		System.out.println(hm.get("Employee2"));
		System.out.println(hm.get(3));
		
		System.out.println("-----------------");
		
		/*Generic HashMap*/
		HashMap<String,Double> ghm=new HashMap<>();
		ghm.put("Shreejit", 3551666.51);
		ghm.put("Sambhog", 535452.15);
		System.out.println(ghm.get("Shreejit"));
		System.out.println(ghm.get("Sambhog"));
	}
}
