package fileoggetto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeggiFileOggetti {

	public static void main(String[] args) 
	{
		String path = "dati.dat";
		Persona p = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			
			if(obj instanceof Persona)
				p = (Persona)obj;
			
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		if (p != null)
			System.out.println(p);

	}

}
