import java.util.*;import java.io.*;import java.math.BigInteger; public class  Little_Elephant_and_Interval{	public static void main(String[] args) throws IOException 	{		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		PrintWriter pw=new PrintWriter(System.out); 		int t=1; 		while(t-->0)		{ 			String str[]=br.readLine().trim().split(" ");			BigInteger a=giveme(Long.parseLong(str[1])); 			BigInteger b=giveme(Long.parseLong(str[0])-1);			BigInteger c=a.add(new BigInteger("-"+b.toString()));			pw.println(c.toString());		} 		pw.flush();	} 	public static BigInteger giveme(long x)	{		//double ans=0;		String s=""+x;		BigInteger ans = new BigInteger("0");		if(Long.parseLong(s)<10)			return ans=new BigInteger(s);		char a[]=s.toCharArray();		int n=s.length(); 		for(long i=1;i<=n;i++)		{			if(i<n)			{				if(i-2<=0)				{					ans=ans.add(new BigInteger("9"));				}				else				{					ans=ans.add(new BigInteger(""+(9*(long)Math.pow(10,i-2))));					//System.out.print(9*Math.pow(10,i-2)+" ");				}			}			else			{				if(n==2)				{					ans=ans.add(new BigInteger(""+(x/11)));					continue;					} 				long p=Long.parseLong(""+a[0]);				for(long j=1;j<p;j++)				{					ans=ans.add(new BigInteger(""+(long)Math.pow(10,i-2)));				} 				String g=s.substring(1,n-1);				ans=ans.add(new BigInteger(""+(Long.parseLong(g)+1))); 				if(Long.parseLong(""+a[0])>Long.parseLong(""+a[n-1]))					ans=ans.add(new BigInteger("-1"));							}			//System.out.println(ans.toString());		} 		return ans;	}	}