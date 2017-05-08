package sequenza;

public class Fattura {

	public static void main(String[] args) {
		
		/*
		 * Dato l'imponibile e l'aliquota iva,
		 * calcolare il totale da pagare
		 * 
		 */
		
		float imponibile = 1500.00F;
		int aliquota = 22;  // 22%  22/100 = 0.22
		
		float iva = imponibile * aliquota / 100;
		
		float totale = imponibile + iva;
		
		System.out.println("Imponibile: " + imponibile);
		System.out.println("Aliquota: " + aliquota +"%");
		System.out.println("Iva: " + iva);
		System.out.println("Totale: " + totale);
	}

}
