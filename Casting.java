class Casting
{
	public static void main(String arg[])
	{
		int a = 20;
		long b = 10;
		long c = a + b;
		System.out.println("int to long addition:" +c);
		
		int x = 10; 
		float y = 20.5f;
		float z = x + y;
		System.out.println("int to float:"+z);
		
		int p = 10;
		float q = 10.5f;
		int r = p + (int) q;
		System.out.println("Conversion float to int:"+r);
		
		byte l = 8;
		char m = (char) l;
		System.out.println("byte:" +(byte)l); 
	}
}