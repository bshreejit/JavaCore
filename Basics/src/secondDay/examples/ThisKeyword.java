package secondDay.examples;

/*THIS Keyword */

public class ThisKeyword {
	int length;//class level data
	int width;
	
	int calcArea(int length,int width) {
		
		int Area=this.length*this.width;
		/*Here, this.length and this.width takes the class
		level data and not the parameters from the methods*/
		return Area;
	}
}
