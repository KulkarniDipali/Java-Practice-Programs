class Message extends Thread   //extends thread is complusory
{
	String msg;
	int dtime;
	Message(String str, int dt)
	{
		msg = str;
		dtime = dt;
	}
	public void run()
	{
		try
		{
			Thread.sleep(dtime);
			//sleep(dtime);                      if extends thread is available if not then we hava to declare (Thread)
			System.out.println(msg);
		}
		catch(Exception e)
		{
		}
	}
}
class Join_alive
{
	public static void main(String args[]) throws Exception
	{
		Message m1 = new Message("Hello",5000);
		Message m2 = new Message("Threads",7000);
		m1.start();
		System.out.println(m1.isAlive());
		m1.join();
		m2.start();	
		System.out.println(m2.isAlive());	
	}
}