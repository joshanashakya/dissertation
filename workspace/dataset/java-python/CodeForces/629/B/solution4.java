import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Scanner;import java.util.StringTokenizer;import java.util.*; public class farRelatives {	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} 	public static void main(String[] args) {		FastReader sc = new FastReader();		int t=sc.nextInt();		ArrayList<Integer> fStart =new ArrayList<>();		ArrayList<Integer> fEnd =new ArrayList<>();		ArrayList<Integer> mStart =new ArrayList<>();		ArrayList<Integer> mEnd =new ArrayList<>();						while(t-->0)		{			char ch=sc.next().charAt(0);			if(ch=='F')			{				int n=sc.nextInt();				fStart.add(n);				int m=sc.nextInt();				fEnd.add(m);			}			else			{				int n=sc.nextInt();				mStart.add(n);				int m=sc.nextInt();				mEnd.add(m);			}		}		int b[]=new int[367];		int c[]=new int[367];		for(int i=0;i<fStart.size();i++)		{			for(int j=fStart.get(i);j<=fEnd.get(i);j++)			{				b[j]++;			}		}		for(int i=0;i<mStart.size();i++)		{			for(int j=mStart.get(i);j<=mEnd.get(i);j++)			{				c[j]++;			}		}				int max=0;		for(int i=0;i<b.length;i++)		{			int temp=Math.min(b[i],c[i]);			temp=temp*2;			if(temp>max)			{				max=temp;			}		}			System.out.println(max);	}}
