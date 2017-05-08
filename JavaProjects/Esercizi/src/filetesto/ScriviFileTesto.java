package filetesto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScriviFileTesto {

	public static void main(String[] args) 
	{
		// Scrittura su file di testo: questo procedimento SOVRASCRIVE i dati sul file(cancella tutto ciò che cera prima)
		
		String path = "file.txt";
		String testo = "Pino dei palazzi è stato qui!";
		
		// accesso alla risorsa
		FileWriter fw = null;  // la FileWriter CREA il file se non ce
		
		BufferedWriter bw = null;  // modalità scrittura, meccanismo che consente di fare le operazioni di scrittura su file(manipola i dati nella risorsa)
		
		try {
			fw = new FileWriter(path);
			bw = new BufferedWriter(fw);
			
			bw.write(testo);
			bw.flush(); // finalizzatore dell'operazione (salvataggio della situazione)
			bw.close(); // 
			fw.close(); //
			
			System.out.println("Dati salvati con successo!");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
