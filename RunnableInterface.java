class Message implements Runnable
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
			System.out.println(msg);
		}
		catch(Exception e)
		{
		}
	}
}
class RunnableInterface
{
	public static void main(String args[])
	{
		Message m1 = new Message("Hello", 5000);
		Message m2 = new Message("Runnable Interface",6000);
		new Thread(m1).start();
		new Thread(m2).start();  // This is the professional method..
	   /* Thread	t1 = new Thread(m1);
	    Thread t2 = new Thread(m2);	
	    t1.start();
	    t2.start();		*/
	}
}