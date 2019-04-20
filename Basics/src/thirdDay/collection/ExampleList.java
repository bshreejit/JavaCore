package thirdDay.collection;

import java.util.ArrayList;
import java.util.List;

//Non-Generic List: Can Add Any type of data
public class ExampleList {

	public static void main(String[] args) {
		 
		String arr[]=new String[5];
		arr[0]="10";
		arr[4]="20";
		//arr[5]="40";not possible using array
		
		
		//ArrayList; To this list we can add hundreds of elements
		ArrayList list =new ArrayList();
		/*Now,to this arrayList we can add any list of elements
		 and any type of object */
		list.add("zero");//String Object
		list.add(2);//Int Object
		list.add(true);//Boolean Object
				
		//ArrayList can also be written as
		List list1=new ArrayList();//Cause List is the SuperClass of ArrayList
		//import list from .util
		list1.add("Hello");
		
		
		/*To Fetch the data from the ArrayList use Enhanced for-loop,
		  but which data type to use to fetch????*/
			/*for(String temp:list){
			 * syso(temp);
			 * }
			 * */
		//Every class extends a "Object" class naturally 
		for(Object temp:list) {
			System.out.println(temp);
		}
	}

}
