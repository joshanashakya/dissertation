import java.util.*;import java.io.*; public class Main{	public static void main(String args[]) throws IOException	{		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		String s=br.readLine();		String a[]=br.readLine().split("\\s+");		boolean f=false;		for(String x:a)		{		    if(x.charAt(0)==s.charAt(0)||x.charAt(0)==s.charAt(1)||x.charAt(1)==s.charAt(0)||x.charAt(1)==s.charAt(1))		    {		        f=true;		        break;		    }		}		if(f)		    System.out.print("YES");		else		    System.out.print("NO");	}}