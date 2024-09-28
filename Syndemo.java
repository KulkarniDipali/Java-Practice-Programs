class Sync
{
	synchronized void disp (String s)
	{ //the disp() method is synchronized
		System.out.print("\n Hello " + s);
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
	    }
		System.out.print(" Have a nice day!");
	}
}
class Synctest implements Runnable
	{
		Sync x;
		String s1;
		Thread t;
		Synctest (Sync y, String s2)
			{
				x=y;
				s1=s2;
				t=new Thread(this); // create object of thread
				t.start(); // start the execution of thread
			}
	public void run() // overridind the run() method
		{ 
			x.disp(s1);
		}
	}
class Sync1
	{
		public static void main (String args[])
		{
			Sync s=new Sync(); //create object of class sync
			Synctest s1=new Synctest(s,"sunny");
			Synctest s2=new Synctest (s,"every body"); // objects s1 & s2 share same object s of Sync
		}
	}