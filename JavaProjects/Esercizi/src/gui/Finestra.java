package gui;

import java.awt.Frame;

public class Finestra 
{

	public static void main(String[] args) 
	{
		Frame f = new Frame();   // classe Frame
		f.setTitle("La mia finestra in JAVA");
		f.setLocation(235, 394);
		f.setSize(400, 300);   // in pixel
		f.setVisible(true);   // fatta partire cosi se clicco sulla x non si chiude
		

	}

}
