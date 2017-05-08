package threading;

public class TestMacchinaDaScrivere {

	public static void main(String[] args) {
		
		String[] frasi = {"Pagnottella la più bella"
				,"Tutti i colori del mondo!!"
				,"Chi la dura la vince"
				,"Meglio prima che poi"
				,"Che mondo sarebbe ... senza Java"
				};
		
		for(int i=0;i<frasi.length;i++){
			MacchinaDaScrivere m = 
					new MacchinaDaScrivere(frasi[i],funzioni.MyLibrary.casualeInfSup(50,100));
			try {
				Thread.sleep(funzioni.MyLibrary.casualeInfSup(4500,5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		
		

	}

}
