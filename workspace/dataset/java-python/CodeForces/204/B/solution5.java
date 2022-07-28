import java.io.*;import java.util.*;import java.lang.*; public class Main { 	public static void main(String[] args) {		FastReader in = new FastReader();		PrintWriter out = new PrintWriter(System.out);		int n = in.nextInt();		HashSet<Integer> set = new HashSet<Integer>();		HashMap<Integer,Integer> fTotal = new HashMap<>();		HashMap<Integer,Integer> fUp = new HashMap<>();		HashMap<Integer,Integer> same = new HashMap<>();		for(int i=0;i<n;i++) {			int up = in.nextInt(),down = in.nextInt();			set.add(up);			set.add(down);			add(fUp,up);			add(fTotal,up);			add(fTotal,down);					if(up==down) add(same,up); 		}		int ans = n;		for(int ele:set) {			int cnt = fUp.getOrDefault(ele,0);			if(cnt>=(n+1)/2) {				ans = 0;				break;			}			int cntTot = fTotal.get(ele);			int cntSame = same.getOrDefault(ele, 0);			if(cntTot-cntSame>=(n+1)/2) ans = Math.min(((n+1)/2) - cnt, ans);		}		out.println(ans==n?-1:ans);		out.close();	}	public static void add(HashMap<Integer,Integer> map,int ele) {		int cnt = map.getOrDefault(ele, 0);		cnt++;		map.put(ele, cnt);		return;	}	static final Random random=new Random();	//	static void ruffleSort(Pair[] a) {	//		int n=a.length;//shuffle, then sort 	//		for (int i=0; i<n; i++) {	//			int oi=random.nextInt(n);	//			Pair temp=a[oi];	//			a[oi]=a[i]; a[i]=temp;	//		}	//		Arrays.sort(a);	//	}	static void ruffleSort(int[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n), temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}	static void ruffleSort(char[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n);			char temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}	static class FastReader 	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new					InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException  e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		}  		int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++) a[i]=nextInt();			return a;		}	}} //class Pair implements Comparable<Pair>{//    int a;//    int b;//    public Pair(int a, int b) {//        this.a = a;//        this.b = b;//    }//    public int compareTo(Pair o) {//        if(this.a==o.a)//            return this.b - o.b;//        return this.a - o.a;//    }   //}
