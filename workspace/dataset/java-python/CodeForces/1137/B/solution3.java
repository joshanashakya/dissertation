import java.io.*;import java.util.*; /*  111010111  101010101  101101101*/ public class D { 	static int longestPrefixSuffix(String s)	{		int n = s.length();		int lps[] = new int[n];		// lps[0] is always 0		lps[0] = 0;		// length of the previous		// longest prefix suffix		int len = 0;		// the loop calculates lps[i]		// for i = 1 to n-1		int i = 1;		while (i < n)		{			if (s.charAt(i) == s.charAt(len))			{				len++;				lps[i] = len;				i++;			}			// (pat[i] != pat[len])			else			{				// This is tricky. Consider				// the example. AAACAAAA				// and i = 7. The idea is				// similar to search step.				if (len != 0)				{					len = lps[len-1];					// Also, note that we do					// not increment i here				}				// if (len == 0)				else				{					lps[i] = 0;					i++;				}			}		}		int res = lps[n-1];		// Since we are looking for		// non overlapping parts.		// return (res > n/2)? n/2 : res;        return res;	} 	public static void main(String[] args) {        FastScanner in = new FastScanner();        PrintWriter out = new PrintWriter(System.out);        char a[] = in.next().toCharArray();        char b[] = in.next().toCharArray();        int n = b.length;        int s =  longestPrefixSuffix(new String(b));       	char c[] = new char[n-s];        for(int i=s;i<n;i++) c[i-s] = b[i];        int oneCnt=0, zeroCnt=0;        for(char ch : a){        	if(ch=='1') oneCnt++;        	else zeroCnt++;        }        int x = 0;        int first = 0;        int ind = 0;                            for(int i=0;i<a.length;i++){        	if(oneCnt==0){        		out.print(0); continue;        	}        	else if(zeroCnt==0){        		out.print(1); continue;        	}        	if(first==0){        		if(ind==s){        			first = 1; i--; continue;        		}	        		if(b[ind]=='1') oneCnt--;        		else zeroCnt--;        		out.print(b[ind++]);         	}        	else{        		if(c[x%(n-s)]=='1') oneCnt--;        		else zeroCnt--;        		out.print(c[x%(n-s)]);        		x++;	        	}        }        out.println();        out.flush();	}		static class FastScanner {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer("");				String next() {			while(!st.hasMoreTokens())				try { st = new StringTokenizer(br.readLine()); }				catch(IOException e) {}			return st.nextToken();		}				String nextLine(){			try{ return br.readLine(); } 			catch(IOException e) { } return "";		}				int nextInt() {			return Integer.parseInt(next());		}				long nextLong() {			return Long.parseLong(next());		}				int[] readArray(int n) {			int a[] = new int[n];			for(int i=0;i<n;i++) a[i] = nextInt();			return a;		}	} 	static final Random random = new Random(); 	static void ruffleSort(int[] a){		int n = a.length;		for(int i=0;i<n;i++){			int j = random.nextInt(n), temp = a[j];			a[j] = a[i]; a[i] = temp;		}		Arrays.sort(a); 		}}