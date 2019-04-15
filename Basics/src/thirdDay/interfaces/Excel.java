package thirdDay.interfaces;

public class Excel implements Office{
	public void newExcel() {
		System.out.println("Excel New.xls");
	}
	
	public void saveExcel() {
		System.out.println("Excel Save.xls");
	} 
	
	public void openExcel() {
		System.out.println("Excel Open.xls");
	}

	@Override
	public void New() {
		// TODO Auto-generated method stub
		System.out.println("Excel New.xls");
		
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
		System.out.println("Excel Save.xls");
		
	}

	@Override
	public void Open() {
		// TODO Auto-generated method stub
		System.out.println("Excel Open.xls"); 
	} 
}
