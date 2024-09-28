class Queue
{
	 int num;
	boolean isSet=false;
	synchronized int consume()
	{
		 if(!isSet)
		{
			 try
			{
				wait();
			}
			catch(Exception e)
			{
			}
		}		
		System.out.println("Consumed :"+ num);
		isSet=false;
		notify();
		return num;
	}
	synchronized void produce(int n)
	{
		if(isSet)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
			}
		}
		num=n;
		System.out.println("Produced :"+ num);
		isSet=true;
		notify();
	}
}
class Producer implements Runnable
{
	Queue q;
	Producer(Queue q)
	{
		this.q=q;
		new Thread(this, "Producer").start();
	}
	public void run()
	{
		int i=0;
		while(i<5)
		{
			q.produce(++i);
		}
	}
}
class Consumer implements Runnable	
{
	Queue q;
	Consumer(Queue q)
	{
		this.q=q;
		new Thread(this, "Consumer").start();
	}
	public void run()
	{
		while(q.consume()<5);
	}
}
class ProCon
{
	public static void main(String arg[])
	{
		Queue q=new Queue();
		new Producer(q);
		new Consumer(q);
	}
}