package filetesto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggiFileTesto {

	public static void main(String[] args) 
	{
		// lettura da file di testo
		
		String path = "file.txt";
		String testo = "";
		
		FileReader fr = null;  // la FileReader NON CREA il file se non ce
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			testo = br.readLine();  // metto in testo il contenuto del file(sarà una stringa)
			br.close();
			fr.close();
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(testo);

	}

}
