import java.lang.*;import java.util.*;import java.util.stream.Collectors;import java.io.*; public class pblm3 {	static int sum;		public static void main(String[] args) throws IOException {					Scanner sc = new Scanner(System.in);			int m = sc.nextInt();			int[] ar = new int[m];			sum=0;			for(int i=0;i<m;i++)ar[i]=sc.nextInt();			System.out.println((long)findChange(ar));				}				public static long findChange(int[] ar)		{						long cur=0,steps=0;			for(int i=0;i<ar.length;i++)			{				long curchange=0;				if(cur==0)cur=curchange=-1*ar[i];				else				{					curchange  = cur + ar[i];					if(curchange == 0)continue;					else cur -= curchange;				}				//System.out.println(i+" "+cur);				steps += (long)Math.abs(curchange);			}			return steps;		}				}
