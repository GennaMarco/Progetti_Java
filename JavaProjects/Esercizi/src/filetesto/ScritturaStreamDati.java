package filetesto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class ScritturaStreamDati {

	public static void main(String[] args) 
	{
		String path = "file.txt";
		String testo = "Pino dei palazzi e tutti sono pazzi!";
		
		FileOutputStream fos = null; // accesso alla risorsa
		
		PrintWriter pw = null;
		
		try {
			fos = new FileOutputStream(path);
			pw = new PrintWriter(fos);
			
			pw.write(testo);
			pw.flush(); 
			pw.close();
			fos.close();
			
			System.out.println("Dati salvati con successo");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
