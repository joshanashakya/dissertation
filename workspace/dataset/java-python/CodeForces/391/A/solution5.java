import java.util.Scanner;public class Pro{	public static void main(String args[])	{   		Scanner sc=new Scanner(System.in);		String s;		int n,i,c=1,f=0;		char ch1,ch2;		s=sc.nextLine();		s=s+" ";		n=s.length();		ch1=s.charAt(0);		for(i=0;i<n-1;i++)		{			if(c==1) ch1=s.charAt(i);			ch2=s.charAt(i+1);			if(ch1==ch2)			c++;			else			{				if(c%2==0)				f++;				c=1;			}		}		System.out.println(f);    	}}
