package threading;

public class TestPingPong 
{

	public static void main(String[] args) 
	{
	   PingPong ping = new PingPong("Ping", 5000); // 5 secondi
	   try 
	   {
		  Thread.sleep(2500);
	   } 
	   catch (InterruptedException e) 
	   {
		e.printStackTrace();
	   }
	   PingPong pong = new PingPong("Pong", 5000); // 1 secondo

	}

}