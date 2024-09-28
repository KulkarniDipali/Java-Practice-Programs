/*import java.io.*;
class main
{
	public static void findFile() throws IOException
	{
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
	}
	public static void main(String args[])
	{
		try
		{
			findFile();
			System.out.println("File found");
		}
		catch(IOException e)
		{
			System.out.println("File not found");
		}
	}
}*/

import java.io.*;
import java.util.*;
class Main 
{
  public static void main(String[] args) throws IOException
  {
    try (Scanner scanner = new Scanner(new File("testRead.txt")); 
     PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) 
      {
      while (scanner.hasNext()) 
      {
        writer.print(scanner.nextLine());
      }
    }
  }
}