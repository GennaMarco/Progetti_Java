package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

public class DatarioMetodoProf extends Thread
{
   private GregorianCalendar data;
   private JLabel output;
   
   public DatarioMetodoProf()
   {
      data = new GregorianCalendar();   
      start();
   }
   
   public DatarioMetodoProf(GregorianCalendar data)
   {
       this.data = data;
   }
   
   public DatarioMetodoProf(JLabel output)
   {
       this();   // richiama il costruttore di default
       this.output = output;
   }
   
   public DatarioMetodoProf(GregorianCalendar data, JLabel output)
   {
       this(output); // richiamo il costruttore DatarioMetodoProf(JLabel output)
       this.data = data;
   }
   
   public String giornoSettimana()
   {
	   String[] giorni = {"Domenica" ,"Lunedi", "Martedi", "Mercoledi", "Giovedi", "Venerdi", "Sabato"};
	   return giorni[data.get(Calendar.DAY_OF_WEEK)-1];
   }
   
   public String nomeMese()
   {
	   String[] mesi = {"Gennaio" ,"Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
	   return mesi[data.get(Calendar.MONTH)];
   }
   
   public String dataLetterale()
   {
	  return giornoSettimana()+" "+data.get(Calendar.DAY_OF_MONTH)+" "+nomeMese()+" "+data.get(Calendar.YEAR);
   }
   
   public String dataLineare()
   {
	   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	   return sdf.format(data.getTime());
   }
   
   public String oraLineare()
   {
	   SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	   return sdf.format(data.getTime());
   }

   @Override
    public void run() 
    {
        while(true)
        {
            data.set(Calendar.SECOND, data.get(Calendar.SECOND)+1); //data = new GregorianCalendar();
            output.setText(this.toString());
            try 
            {
               sleep(1000);
            } 
            catch (InterruptedException e) 
            {
               e.printStackTrace();
            }
        }

    }

    @Override
    public String toString() {
            return giornoSettimana()
                       + " " + dataLineare()
                       + " ore: " + oraLineare();
    }
	
	
   
   
   
   // ricorda il getInstance()
   
   
}
