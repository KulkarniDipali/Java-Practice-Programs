class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("1st thread");
		/*for(int i = 0; i <= 100; i++ )
		{
			//System.out.println("1st thread");
			System.out.println(i);
		}*/
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("2nd thread");
		/*for(int j = 120; j >= 25; j--)
		{
			//System.out.println("2nd thread");
			System.out.println(j);
		}*/
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		System.out.println("3rd thread");
		/*for(int k = 600; k <= 700; k++)
		{
			//System.out.println("3rd thread");
			System.out.println(k);
		}*/
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