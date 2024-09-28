class Thread1 extends Thread
{
	public void run()
	{
		for(int i = 0; i <= 100; i++ )
		{
			System.out.println(i);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int j = 120; j >= 25; j--)
		{
			System.out.println(j);
		}
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		for(int k = 600; k <= 700; k++)
		{
			System.out.println(k);
		}
	}
}
class Priority
{
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
	
		t1.setPriority(Thread.MAX_PRIORITY); //10
		t2.setPriority(Thread.NORM_PRIORITY); //5
		t3.setPriority(Thread.MIN_PRIORITY); //1
	//	t1.setPriority(t2.getPriority); //5

		t1.start();
		t2.start();
		t3.start();
		int priority = t2.getPriority();
		System.out.println("Priority" +priority);
	}
}