import java.applet.*;
import java.awt.*;
public class Appdemo extends Applet
{
	 public void paint(Graphics g)
 	{
		 g.drawString("Wel come", 80,100);
		 
		 int a = 2;
		 
		 // Square
		 //g.drawString("" + a * a , 80, 120); 
		 
		 int n = 6;
		 String sqr = Integer.toString(n * n);
		 g.drawString("Square" + sqr , 80, 120);
		 
		 //Even Odd
		 if(a % 2 == 0)
		 {
		 	g.drawString(a + " Even", 80, 140);
		 }
		 else
		 {
		 	g.drawString(a + " Odd", 80, 140);	
		 }
		 
		 // Factorial
		 int b = 5;
		 int fact = 1;
		 for(int i = 1; i <= b; i++)
		 {
		 	fact = fact*i;
		 } 
		 g.drawString("Factorial:" +fact, 80, 160);
		 
		 //paramaterized applet
		 int x = Integer.parseInt(getParameter("num1"));
		 int y = Integer.parseInt(getParameter("num2"));
		 int z = x + y;
		 g.drawString("Addition= " + z, 80, 180);
 	}
 }