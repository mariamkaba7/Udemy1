package test;
import org.testng.annotations.*;

public class Parameterization {
	@Test(dataProvider="getData")
	public void  mobileSigOutCarLoan(String userName, String pwd) {
		System.out.println("Mobile SignOut");
		System.out.println(userName);
		System.out.println(pwd);
		
	}
	
	
	@DataProvider
	public Object[][] getData() {
		// define multidimensional array with 3 rows and 2 columns 
		Object [][] data = new Object[3][2];
		//1st set
		data[0][0]= "firstUsername";
		data[0][1]= "firstPassword";
		
		//2nd set
		data[1][0]= "secondUsername";
		data[1][1]= "SecondPassword";
			
				//3rd set
		data[2][0]= "thirdtUsername";
		data[2][1]= "thirdPassword" ;
		return data ;
	}

}
