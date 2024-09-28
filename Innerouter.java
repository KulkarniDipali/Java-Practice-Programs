class Outer
{
	int a;
	String b;
	Outer()
	{
		a = 1;
		b = "Dipali";
		this.show();
		Inner in = new Inner();
	}
	void show()
	{
		System.out.println(a+"    " +b);
	}
	class Inner
	{
		int c;
		String d;
        Inner()
        {
        	c = 2;
        	d = "Anu";
        	this.disp();
        }
        void disp()
        {
        	System.out.println(a+"    "+b);
        	System.out.println(c+"    "+d);
        }
	}
}
class Innerouter
{
	public static void main(String args[])
	{
		Outer ou = new Outer();
	}
}