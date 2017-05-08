package classi;

import enumeration.Alimentazione;

public class TestAuto 
{

	public static void main(String[] args) 
	{
		
		Auto bmw = new Auto("BMW", "X5", Alimentazione.BENZINA , 2500, "Nera");
		System.out.println(bmw);
		
		Auto audi = new Auto("Audi", "Q5", Alimentazione.DIESEL , 2500, "Bianca");
		System.out.println(audi);
		
		Auto jaguar = new Auto("Jaguar", "Xtype", Alimentazione.GPL , 3000, "Verde");
		System.out.println(jaguar);

		Auto panda = new Auto("Fiat", "Panda", Alimentazione.IBRIDA , 1200, "Verde");
		System.out.println(panda);
		
		Auto vw = new Auto("Volkswagen", "Up", Alimentazione.METANO , 1200, "Fucsia");
		System.out.println(vw);
	}

}
