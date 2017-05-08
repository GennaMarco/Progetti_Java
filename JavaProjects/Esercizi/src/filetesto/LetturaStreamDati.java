package filetesto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LetturaStreamDati {

	public static void main(String[] args) 
	{
		String path = "file.txt";
		String testo = "";  // String testo = null; SONO DIVERSE
		
		FileInputStream fis = null;
		Scanner sc = null;
		
		try {
			fis = new FileInputStream(path);
			sc = new Scanner(fis);
			
			while(sc.hasNextLine())   // se trova delle linee, allora leggilo
			  testo += (testo.length() > 0 ? "\n" : "") + sc.nextLine();  // legge l'intera linea
			
			sc.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(testo);
		
		

	}

}
