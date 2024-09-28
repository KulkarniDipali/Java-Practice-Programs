class Number1
 {
     int x;
	 void get()
 	{
		x=10;
 	}
 	void show()
 	{
		System.out.println(x);
 	}
 }
 class Number2 extends Number1
 {
	int y;
 	void get() //method overriding
	{
 		super.get();
 		y=20;
	}
	void show()
 	{
		super.show();
 		System.out.println(y);
 	}
}
 class Override
 {
 	public static void main(String args[])
  	{ 
   		Number2 ob= new Number2();
   		ob.get();
   		ob.show();
 	}
 }