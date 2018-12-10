package Assign3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataP 
{

@DataProvider
public Object[][] Dp()
{
	Object[][] ob=new Object [2] [3];
	ob[0][0]="FRFC";  ob[0][1]="FRSC";  ob[0][2]="FRTC";
	ob[1][0]="SRFC";  ob[1][1]="SRSC";   ob[1][2]="SRTC";
	return ob;
	
}
@Test(dataProvider="Dp")
public void receive(String FN,String LN,String PW)
{

	System.out.println(FN);
	System.out.println(LN);
	System.out.println(PW);
}
}
