package filetesto;

import java.io.File;
import java.io.IOException;

public class CreaFileTesto {

	public static void main(String[] args) 
	{
		// Se non esiste creo il file
		
		String path = "file.txt";  // percorso dove salvare il file
		
		File f = new File(path);
		
		if(f.exists())
			System.out.println("il file Esiste");
		else
			try {
				if(f.createNewFile())
					System.out.println("Il file è stato creato");
				else
					System.out.println("Il file non è stato creato");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	}

}
