import java.io.*;
 
import java.util.*;
 
public class Main {
	static PrintWriter pw = new PrintWriter(System.out);
    static class pair {
    	int i,v;
    	pair(int v,int i){
    		this.v=v;
    		this.i=i;
    	}
    }
	static int n, m;
	static int[] st, arr,pos;
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
 
		
       n=sc.nextInt();
       arr=sc.nextarr(n);
       st=new int[n];
       st[n-1]=arr[n-1];
       for(int i=n-2;i>=0;i--) {
    	   st[i]=Math.min(arr[i],st[i+1]);
       }
       //print(arr);
       
       for(int i=0;i<n;i++) {
    	   int l=i;
    	   int e=n-1;
    	   int res=i;
    	   while(l<=e) {
    		   int mid=(l+e)>>1;
               if(arr[i]>st[mid]) {
            	   l=mid+1;
            	   res=mid;
               }
               else {e=mid-1;} 
    	   }
    	   pw.print(res-i-1+" ");
       }
       
		pw.close();
 //4 2 1 0 -1 -1 -1 
	}
	static int max = (1 << 31) - 1;
	static boolean flage;
    static void print(int[]arr) {
    	for(int i:arr)pw.print(i+" ");
    }
	public static boolean prime(int x) {
		int[] arr = new int[10000000];
		int index = 0;
		int num = 3;
		int i = 0;
		arr[0] = 2;
		while (num <= x) {
			for (i = 0; i <= index; i++) {
				if (num % arr[i] == 0) {
					break;
				}
			}
			if (i == index + 1) {
				arr[++index] = num;
			}
			num++;
		}
		if (arr[index] == x)
			return true;
		return false;
 
	}
    
	public static void conquer(int[] arr, int b, int m, int e) {
		int len1 = m - b + 1;
		int len2 = e - m;
		int[] l = new int[len1];
		int[] r = new int[len2];
		for (int i = 0; i < len1; i++) {
			l[i] = arr[b + i];
		}
		for (int j = 0; j < len2; j++) {
			r[j] = arr[m + 1 + j];
		}
		int i = 0, j = 0, k = b;
		while ((i < len1) && (j < len2)) {
			if (r[j] >= l[i]) {
				arr[k] = l[i];
				k++;
				i++;
			} else {
				arr[k] = r[j];
				k++;
				j++;
			}
		}
		while (i < len1) {
			arr[k++] = l[i++];
		}
		while (j < len2) {
			arr[k++] = r[j++];
		}
	}
 
	static int mid;
 
	public static void sort(int[] arr, int b, int e) {
		if (b < e) {
			int mid = (e + b) / 2;
			sort(arr, b, mid);
			sort(arr, mid + 1, e);
			conquer(arr, b, mid, e);
		}
	}
 
	public static void Sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}
 
	static class Scanner {
 
		StringTokenizer st;
 
		BufferedReader br;
 
		public Scanner(InputStream s) {
 
			br = new BufferedReader(new InputStreamReader(s));
 
		}
 
		public Scanner(String file) throws FileNotFoundException {
 
			br = new BufferedReader(new FileReader(file));
 
		}
 
		public String next() throws IOException {
 
			while (st == null || !st.hasMoreTokens())
 
				st = new StringTokenizer(br.readLine());
 
			return st.nextToken();
 
		}
 
		public int nextInt() throws IOException {
 
			return Integer.parseInt(next());
 
		}
 
		public long nextLong() throws IOException {
 
			return Long.parseLong(next());
 
		}
 
		public String nextLine() throws IOException {
 
			return br.readLine();
 
		}
        int[] nextarr(int n) throws IOException {
        	int []arr=new int[n];
        	for(int i=0;i<n;i++) {
        		arr[i]=nextInt();
        	}
        	return arr;
        }
		public double nextDouble() throws IOException {
 
			return Double.parseDouble(next());
 
		}
 
		public boolean ready() throws IOException {
 
			return br.ready();
 
		}
 
	}
 
}
  			 		 	    		   	 						  	
