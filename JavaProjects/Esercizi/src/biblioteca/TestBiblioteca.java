package biblioteca;

public class TestBiblioteca 
{
   public static void main(String[] args) 
   {
      Autore autore = new Autore("Richard", "White", "03/07/1990", "Milano", "04/08/2014", "Malta");
      Indirizzo indirizzo = new Indirizzo("Via Sestriere 67", 10098, "Rivoli", "TO", "Italia");
      Editore editore = new Editore("Zanichelli", indirizzo , 011757432, "mar@gmail.com", "www.ciao.com", "S.P.A");
	  Libro libro = new Libro("Harry potter", autore , editore , 650, 1990);
		
	  System.out.println(libro);
   }
}
