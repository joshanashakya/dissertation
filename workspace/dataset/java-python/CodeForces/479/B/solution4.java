import java.io.*;import java.util.*; public class Dpairs { 	public static void main(String[] args)throws IOException 	{				BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));		StringBuffer sb=new StringBuffer();				String s[]=ob.readLine().split(" ");		int n=Integer.parseInt(s[0]);		int k=Integer.parseInt(s[1]);		int cpy=0;				String str[]=ob.readLine().split(" ");		int a[]=new int[n];				for(int i=0;i<n;i++)			a[i]=Integer.parseInt(str[i]);		//		int vis[]=new int[n];		while(k-->0)		{			int i1=maxIdx(a);			int i2=minIdx(a);									if(i1==i2)				break;			a[i1]--;			a[i2]++;			sb.append((i1+1)+" "+(i2+1)+"\n");			cpy++;		}		int max=-1;		int min=100000000;		for(int i=0;i<n;i++)		{			if(a[i]>max)				max=a[i];			if(a[i]<min)				min=a[i];		}		int dif=max-min;		System.out.println(dif+" "+cpy);		System.out.println(sb);	}	static int minIdx(int a[])	{			int idx=-1;		int min=Integer.MAX_VALUE;		for(int i=0;i<a.length;i++)		{	//			if(vis[i]==1)//				continue;			if(a[i]<min)			{				idx=i;				min=a[i];			}		}		return idx;	}	static int maxIdx(int a[])	{		int max=Integer.MIN_VALUE;		int idx=0;		for(int i=0;i<a.length;i++)		{			if(a[i]>max)			{				max=a[i];				idx=i;			}		}		return idx;	}}