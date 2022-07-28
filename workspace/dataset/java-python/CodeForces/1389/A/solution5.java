
import java.util.Arrays;
import java.util.Scanner;

public class Main
{   
	public static void main(String[] args)
	{   Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int t=in.nextInt();
			for(int i=1;i<=t;i++)
			{
				int a=in.nextInt();
				int b=in.nextInt();
				if(b<a*2)
				{
					System.out.println("-1"+" "+"-1");
				}
				else
				{
					System.out.println(a+" "+2*a);
				}
			}
			
		}
	}
	
}


  	 		    			  	    			   		  	
