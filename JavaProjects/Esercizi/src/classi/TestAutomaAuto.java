package classi;

import java.util.Scanner;

import enumeration.Alimentazione;

public class TestAutomaAuto 
{

	public static void main(String[] args) 
	{
		AutomaAutoo a = new AutomaAutoo("Audi", "Q5", Alimentazione.DIESEL, 2500, "Giallo");
		a.setVelocita(0);
		
		String msg = ""
				+ "\nScegli quale operazione eseguire"
				+ "\n1 => accelera"
				+ "\n2 => frena"
				+ "\n0 => esci"
				;
		
		int scelta = -1;
		Scanner tastiera = new Scanner(System.in);
		do{
			System.out.println("Velocità: "+ a.getVelocita() + " km/h");
			System.out.println(msg);
			scelta = tastiera.nextInt();
			
			switch(scelta)
			{
			   case 1: a.accelera(); break;
			   case 2: a.frena(); break;
			   case 0: break;
			   default: break;
		   }
			
		}while(scelta != 0);
        tastiera.close();
	}

}
