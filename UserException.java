/*Syntax:
class VehicalnoException extends Exception
{
	VehicalnoException(String msg)
	{
		super(msg);
	}
}
// Mobile Number Exception handling handled by user side
class MobilenoException extends Exception
{
	MobilenoException(String ab)
	{
		super(ab);
	}
}
class Customer
{
	int cid;
	String cname, mbn;
	Customer()
	{
		try
		{
			cid = 1; 
			cname = "Riya";
			mbn = "9874565485";
			if(mbn.length() != 10)
			{
				throw new MobilenoException("Enter valid mobile number..");
			}
			else
			{
				System.out.println(cid+ "    " +cname+ "     " +mbn);
			}
		}
		catch(MobilenoException mn)
		{
			System.out.println(mn.getMessage());
		}
	}
}
class UserException
{
	public static void main(String args[])
	{
		Customer c1 = new Customer();
	}
}

import java.util.*;
class MobilenoException extends Exception
{
	MobilenoException(String ab)
	{
		super(ab);
	}
}
class Customer
{
	Scanner sc = new Scanner(System.in);
	int cid;
	String cname, mbn;
	Customer()
	{
		try
		{
			System.out.print("Enter customer id:");
			cid = sc.nextInt(); 
			System.out.print("Enter customer name:");
			cname = sc.next();
			System.out.print("Enter customer mobile number:");
			mbn = sc.next();
			if(mbn.length() != 10)
			{
				throw new MobilenoException("Enter valid mobile number..");
			}
			else
			{
				System.out.println(cid+ "    " +cname+ "     " +mbn);
			}
		}
		catch(MobilenoException mn)
		{
			System.out.println(mn.getMessage());
		}
	}
}
class UserException
{
	public static void main(String args[])
	{
		Customer c1 = new Customer();
	}
}*/

class EmployeeException extends Exception
{
	public EmployeeException(String s)
	{
		super(s);
	}
}
class Emp
{
	void empIDCheck(int EmpID) throws EmployeeException
	{
		if(EmpID <= 0 || EmpID > 999)
		{
			throw new EmployeeException ("Invalid Employee ID");
		}
	}
	public static void main(String args[])
	{
		Emp ep = new Emp();
		try
		{
			ep.empIDCheck(1110);
			System.out.println("Valid");
		}
		catch(EmployeeException e)
		{
			System.out.println("Exception caugth");
			System.out.println(e.getMessage());
		}
	}
}