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
class Threaddemo2
{
	public static void main(String args[])
	{
		Message m1 = new Message("Hello",5000);
		Message m2 = new Message("Threads",7000);
		m1.start();
		m2.start();		
	}
}