import java.util.*;import java.io.*; public class Forces{	public static void main(String ...arg)	{		Read cin = new Read();		int n = cin.nextInt();		int m = cin.nextInt();		int[] a = new int[n];		int[] b = new int[n];		for(int i=0;i<n;i++)			a[i] = cin.nextInt();		for(int i=0;i<n;i++)			b[i] = cin.nextInt();		int[] num = new int[n+1];		int[] dem = new int[n+1]; 		boolean flag = true;		for(int i=1;i<n;i++)		{			num[i] = (a[i]-1) * (b[i]-1);			dem[i] = a[i] * b[i];			if(num[i] == 0)			{				flag = false;				break;			}		}		num[0] = a[0] - 1;		dem[0] = a[0];		num[n] = b[0] - 1;		dem[n] = b[0]; 		double value = 1;		if(flag)		for(int i=0;i<=n;i++)		{			value*=(double)dem[i]/num[i];		}		if(flag && value != Double.POSITIVE_INFINITY)			System.out.println(m * (value-1));		else			System.out.println(-1);	}}  class Read{    private BufferedReader br;    private StringTokenizer st;     public Read()    { br = new BufferedReader(new InputStreamReader(System.in)); }     String next()    {        while (st == null || !st.hasMoreElements())        {            try {st = new StringTokenizer(br.readLine());}            catch(IOException e)                {e.printStackTrace();}        }        return st.nextToken();    }     int nextInt()    { return Integer.parseInt(next()); }     long nextLong()    { return Long.parseLong(next()); }     double nextDouble()    { return Double.parseDouble(next()); }     String nextLine()    {        String str = "";        try {str = br.readLine();}        catch(IOException e)            {e.printStackTrace();}        return str;    }}