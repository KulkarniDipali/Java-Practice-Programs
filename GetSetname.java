class GetSetname
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		t.setName("GetSet Name Example");	
		System.out.println(t.getName());	
	}
}