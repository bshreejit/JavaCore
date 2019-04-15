package firstday.exercises;

public class ExerciseA {
	public static void main(String[] args) {
		
		String[] nums= {"10","20","30","40"};
		int total=0;
		for(String temp:nums)
		{
			total=total+ Integer.parseInt(temp);
		}
		System.out.println("Sum = "+ total);
	}
}
  