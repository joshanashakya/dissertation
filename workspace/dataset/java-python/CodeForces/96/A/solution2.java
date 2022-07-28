/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	int ca=0;
	int cb=0;
	int d=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='0')
		{
			cb=0;
			ca++;
			if(ca==7)
			{
				d=1;
				break;
			}
		}
		else
		{
			ca=0;
			cb++;
			if(cb==7)
			{
				d=1;
				break;
			}
		}
	}
	if(d==1)
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
	}
}
    		 		 	 	  	 		  			 						
