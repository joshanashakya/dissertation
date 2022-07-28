import java.io.*;import java.util.*;import java.lang.*; public class B {	public static char[][] board;	public static void main(String[] args) {		FastReader in = new FastReader();		PrintWriter out = new PrintWriter(System.out);		int n = in.nextInt(),m = in.nextInt();		board = new char[n][m];		int[][] cost = new int[n][m];		for(int i=0;i<n;i++) {			board[i] = in.next().toCharArray();		}		for(int i=0;i<n;i++) {			for(int j=0;j<m;j++) {				if(board[i][j]!='B') continue;				for(int l = i;l<n;l++) {					for(int r=0;r<m;r++) {						if(i==l&&j==r) continue;						if(board[l][r]!='B') continue; 						if(!check(i,j,l,r)) {//							out.println(i+" "+j+" "+l+" "+r);							out.println("NO");							out.close();							return;						}					}				}			}		}		out.println("YES");		out.close();	}	public static boolean check(int x,int y,int l,int r) {		int fromj = Math.min(y, r);		int toj = Math.max(y, r);		int fromi = Math.min(x, l);		int toi = Math.max(x, l);		boolean worksTop=true ,worksBot = true,				 worksLeft=true,worksRight = true;		for(int i=fromj;i<=toj;i++) {			if(board[fromi][i]!='B') worksTop = false;			if(board[toi][i]!='B') worksBot = false;		}		if(!worksTop&&!worksBot) return false;		for(int i=fromi;i<=toi;i++) {			if(board[i][fromj]!='B') worksLeft = false;			if(board[i][toj]!='B') worksRight = false;		}		if(!worksLeft&&!worksRight) return false;		if(worksLeft&&worksRight&&worksTop&&worksBot) return true;		if(	(x==fromi&&y==fromj)||(x==toi&&y==toj)) return ((worksTop&&worksRight)||(worksLeft&&worksBot));		else return((worksTop&&worksLeft)||(worksRight&&worksBot)); 	} 	static final Random random=new Random();	//	static void ruffleSort(Pair[] a) {	//		int n=a.length;//shuffle, then sort 	//		for (int i=0; i<n; i++) {	//			int oi=random.nextInt(n);	//			Pair temp=a[oi];	//			a[oi]=a[i]; a[i]=temp;	//		}	//		Arrays.sort(a);	//	}	static void ruffleSort(int[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n), temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}	static void ruffleSort(char[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n);			char temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}	static class FastReader 	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new					InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException  e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		}  		int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++) a[i]=nextInt();			return a;		}	}} //class Pair implements Comparable<Pair>{//    int a;//    int b;//    public Pair(int a, int b) {//        this.a = a;//        this.b = b;//    }//    public int compareTo(Pair o) {//        if(this.a==o.a)//            return this.b - o.b;//        return this.a - o.a;//    }   //}
