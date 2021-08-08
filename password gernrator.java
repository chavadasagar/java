import java.util.*;

class sagar
{
	static char[] password(int len)
	{
		int x;
		String cap = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String small = "qwertyuiopasdfghjkl";
		String no = "1234567890";

		String pun = "!@#)(*&^%$?";

		String value = cap+small+no;
	
		Random obj = new Random();

		char[] password = new char[len];
	
		for(x=0;x<len;x++)
		{
			password[x] = value.charAt(obj.nextInt(value.length()));
		}	

		return password;
	}
	public static void main(String args[])
	{
		System.out.print(password(10));
	}
}