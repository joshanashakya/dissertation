/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = 1;
		t = sc.nextInt();
		
		while(t != 0)
		{
		    int n = sc.nextInt();
    		int arr[] = new int[n];
    		
    		int s = 0, mx = 0;
    		for(int i = 0; i < n; i++)
    		{
    		    arr[i] = sc.nextInt();
    		    s += arr[i];
    		    
    		    mx = Math.max(mx, arr[i]);
    		}
    		
    		if(n == 1) {
    		    System.out.println("T");
    		}
    		else
    		{
    		    if(s - mx < mx)
    		    {
    		        System.out.println("T");
    		    }
    		    else
    		    {
    		        if(s % 2 == 1)
    		        {
    		            System.out.println("T");
    		        }
    		        else System.out.println("HL");
    		    }
    		}
    		
    		t -= 1;
		}
	}
}

