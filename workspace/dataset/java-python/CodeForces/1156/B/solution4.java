import java.io.*;import java.util.*; public class B { 	public static void main(String[] args) {        FastScanner in = new FastScanner();        PrintWriter out = new PrintWriter(System.out);        int t = in.nextInt();        while(t-->0) {         	 char ch[] = in.next().toCharArray();        	 int n = ch.length;        	 int f[] = new int[26];        	 for(char c : ch) f[c-'a']++;        	 int vis[] = new int[26];        	 int parity = 1;        	 char ans1[] = new char[n];        	 char ans2[] = new char[n];        	 int ind1 = 0, ind2 = 0;        	 for(int i=25;i>=0;i--){        	 	if(f[i]!=0){        	 		if(parity==1){        	 			parity = 0;        	 			for(int j=0;j<f[i];j++) ans2[ind2++] = (char)('a'+i);        	 		}        	 		else{        	 			vis[i] = 1;        	 			for(int j=0;j<f[i];j++) ans1[ind1++] = (char)('a'+i);        	 			parity = 1;        	 		}        	 	}        	 }        	 for(int i=25;i>=0;i--){        	 	if(f[i]!=0&&vis[i]==0){        	 		for(int j=0;j<f[i];j++) ans1[ind1++] = (char)('a'+i);				        	 	}        	 	else if(f[i]!=0){        	 		for(int j=0;j<f[i];j++) ans2[ind2++] = (char)('a'+i);				        	 	}        	 }        	 boolean valid1 = true;        	 for(int i=0;i<n-1;i++){        	 	if(Math.abs(ans1[i]-ans1[i+1])==1){        	 		valid1 = false; break;        	 	}        	 }        	 boolean valid2 = true;        	 for(int i=0;i<n-1;i++){        	 	if(Math.abs(ans2[i]-ans2[i+1])==1){        	 		valid2 = false; break;        	 	}        	 }        	 if(valid1) out.println(new String(ans1));        	 else if(valid2) out.println(new String(ans2));        	 else out.println("No answer");                                               }        out.flush();	}		static class FastScanner {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer("");				String next() {			while(!st.hasMoreTokens())				try { st = new StringTokenizer(br.readLine()); }				catch(IOException e) {}			return st.nextToken();		}				String nextLine(){			try{ return br.readLine(); } 			catch(IOException e) { } return "";		}				int nextInt() {			return Integer.parseInt(next());		}				long nextLong() {			return Long.parseLong(next());		}				int[] readArray(int n) {			int a[] = new int[n];			for(int i=0;i<n;i++) a[i] = nextInt();			return a;		}	} 	static final Random random = new Random(); 	static void ruffleSort(int[] a){		int n = a.length;		for(int i=0;i<n;i++){			int j = random.nextInt(n), temp = a[j];			a[j] = a[i]; a[i] = temp;		}		Arrays.sort(a); 		}}