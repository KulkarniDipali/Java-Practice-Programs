class Thread1 extends Thread
{
	public void run()
	{
		  for(int i = 0; i <= 100; i++ )
		{
			if(i == 50)
			{
				try
				{
					sleep(5000);
				}
				catch(Exception e)
				{
				}
			}
			System.out.println(i);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		 for(int j = 120; j >= 100; j--)
		{
			if(j == 110)
			{
				stop();
			}
			System.out.println(j);
		}
	}
}
class Thread3 extends Thread
{
	public void run()
	{
          for(int k = 600; k <= 650; k++)
		{
			System.out.println(k);
		}
	}
}
class Threaddemo
{
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
		t2.start();
		t3.start();
	}
}