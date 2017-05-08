package fileoggetto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

import enumeration.Sesso;

public class ScriviFileOggetti {

	public static void main(String[] args) 
	{
		// lavoriamo con gli oggetti
		
		String path = "dati.dat";   // formato per gli oggetti
		
		Persona p = new Persona();
		p.setNome("Pino");
		p.setCognome("Delillo");
		p.setDataNascita(new GregorianCalendar(1993, 4, 25));
		p.setLuogoNascita("Moncalieri");
		p.setSesso(Sesso.MASCHIO);
		
		// accesso alla risorsa
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			oos.flush(); // svuota il buffer
			oos.close();
			fos.close();
			
			System.out.println("Dati salvati con successo");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}