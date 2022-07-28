import java.util.*;import java.io.*; public class B {	static class FastReader {        BufferedReader br;        StringTokenizer st;		        public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }        String next() {            while(st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }        long nextLong() {            return Long.parseLong(next());        }        double nextDouble() {            return Double.parseDouble(next());        }        String nextLine () {            String str = "";            try {                str = br.readLine();            }            catch (IOException e) {                e.printStackTrace();            }            return str;        }    }	static class Pair {		int first;		int second;	}	public static void main(String args[]) {		FastReader fs = new FastReader();		StringBuilder ans = new StringBuilder();        int n = fs.nextInt();        int k = fs.nextInt();        int arr[] = new int[n];        for(int i=0;i<n;i++) {            arr[i] = fs.nextInt();        }        int c = 0;        for(int i=1;i<n;i++) {            if(arr[i] + arr[i-1] < k) {                int t1 = arr[i] + arr[i-1];                c += (k - t1);                arr[i] += (k - t1);            }        }        ans.append(c + "\n");        for(int i=0;i<n;i++) {            ans.append(arr[i] + " ");        }        ans.append("\n");        System.out.print(ans);    }}