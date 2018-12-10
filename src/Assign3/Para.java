package Assign3;


import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para 
{
	@Parameters({"HI"})
	@Test

public void para(String hi) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
{
	if(hi.equals("Hello"))
	{
		System.out.println("Hello");
	}
	else
	{
		System.out.println("Hi");
	}
}

}
