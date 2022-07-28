import java.io.*;import java.util.*; public class A { 	public static void main(String[] args) throws FileNotFoundException {		FastScanner fs = new FastScanner();		FastOutput fo = new FastOutput();		long initial_time = System.currentTimeMillis();		int testcases = fs.nextInt();		for (int tt = 0; tt < testcases; tt++) {			//main code			int n=fs.nextInt(),m=fs.nextInt();			Map<Integer,Boolean> map1=new TreeMap<>();			Map<Integer, Boolean> map2=new TreeMap<>();			for(int i=0;i<n;i++) {				int temp=fs.nextInt();				map1.put(temp,true);			}			for(int i=0;i<m;i++) {				int temp=fs.nextInt();				map2.put(temp, true);			}			int cnt=0;			for(int key:map1.keySet()) {				if(map2.containsKey(key)) {					cnt++;				}			}			fo.println(cnt);		}		fo.time(initial_time);	} 	static class FastScanner {		BufferedReader br;		StringTokenizer st; 		public FastScanner() throws FileNotFoundException {			if (System.getProperty("ONLINE_JUDGE") == null) {				//Read from the File...				File file = new File("src\\input");				br = new BufferedReader(new FileReader(file));			} else {				//Read from the System...				br = new BufferedReader(new InputStreamReader(System.in));			}			st = new StringTokenizer("");		} 		String next() {			while (!st.hasMoreTokens())				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		int[] readArray(int n) {			int[] a = new int[n];			for (int i = 0; i < n; i++)				a[i] = nextInt();			return a;		} 		long nextLong() {			return Long.parseLong(next());		}	} 	static class FastOutput {		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		void print(String str) {			try {				bw.write(str);				bw.flush();			} catch (IOException e) {			}		} 		void print(int num) {			try {				bw.write((num + ""));				bw.flush();			} catch (IOException e) {			}		} 		void println(String str) {			try {				bw.write(str + '\n');				bw.flush();			} catch (IOException e) {			}		} 		void println(int num) {			try {				bw.write(num + "" + '\n');				bw.flush();			} catch (IOException e) {			}		} 		void time(long init) {			if (System.getProperty("ONLINE_JUDGE") == null) {				System.out.println(System.currentTimeMillis() - init + "ms");			}		}	}}