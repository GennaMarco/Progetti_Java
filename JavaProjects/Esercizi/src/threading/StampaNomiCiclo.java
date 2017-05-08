package threading;

public class StampaNomiCiclo {

	public static void main(String[] args) {
		
		//array di nomi
		String[] nomi = {"Pino","Mino","Lino","Dino","Rino"};
		int i=0;
		while(true){
			System.out.println(nomi[i]);
			if(i==nomi.length-1)
				i=0;
			else
				i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
