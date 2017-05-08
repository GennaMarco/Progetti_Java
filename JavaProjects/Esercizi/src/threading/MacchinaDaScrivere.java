package threading;

public class MacchinaDaScrivere extends Thread {

	private String frase; // testo da scrivere
	private int ritardo; // in millisecondi la singola lettera
	
	public MacchinaDaScrivere(String frase, int ritardo) {
		this.frase = frase;
		this.ritardo = ritardo;
		start();
	}

	@Override
	public void run() {
		//fa girare il thread 
		int i=0;
		
		while(i<frase.length()){			
			try {
				Thread.sleep(ritardo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(frase.charAt(i));
			i++;
		}
		
	}
}
