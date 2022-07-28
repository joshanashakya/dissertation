import java.lang.*;import java.util.*;import java.util.stream.Collectors;import java.io.*; public class Compressing {	public static class pair	{		double dist;		int pop;		public pair(double dist, int pop)		{			this.dist=dist;			this.pop=pop;		}	}	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int pop = sc.nextInt();		pair[] ar =new pair[n];		for(int i=0;i<n;i++)		{			int x = sc.nextInt();int y = sc.nextInt();int c = sc.nextInt();			double dist = Math.sqrt(x*x + y*y);			ar[i]=new pair(dist,c);		}		Arrays.sort(ar, (a, b) -> Double.compare(a.dist, b.dist));		int i=0;		while(pop < 1000000 && i<n)		{			pop+=ar[i].pop;			//System.out.println(ar[i].dist+" "+ar[i].pop);			if(pop>=1000000)break;			i++;		}		if(pop>=1000000 && i<n)		System.out.println(ar[i].dist);		else System.out.println(-1);			}}