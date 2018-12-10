package Assign3;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataToTextFile {
	public static void main(String[] args) {
		String info="Collected Informations";
		String idForTxTFile= new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
		File file=new File("DataEntered" + idForTxTFile);
		try {
			FileWriter fw=new FileWriter(file, true);
			String lineSeparator=System.getProperty("Line.seperator");
			String[] output=info.split("\n");
			for (int i=0;i<=output.length;i++) {
				fw.write(output[i]);
				fw.write(lineSeparator);
			}
			fw.write(info);
			fw.flush();
			fw.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}
	}

}
