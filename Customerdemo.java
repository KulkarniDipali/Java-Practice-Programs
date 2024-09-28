import pack1.Sale;
class Customerdemo
{
	public static void main(String args[])
	{
		Sale c1 = new Sale();
		c1.get(1,"Dipali");
		c1.show();
		c1.input(1, "HP Laptop" , 2 , 65000f);
		c1.show2();
	}
}