import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.StringTokenizer; public class Eugeny_PlayList {    static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (Exception e) {                     e.printStackTrace();                }             }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (Exception e) {                e.printStackTrace();            }            return str;        }         long nextLong() {            return Long.parseLong(next());        }    }    public static void main(String[] args) {     FastReader in = new FastReader();     int n = in.nextInt();     int m = in.nextInt();     long arr[] = new long[n];     for(int i = 0; i < n; i++){         int c = in.nextInt();         int t = in.nextInt();         arr[i] = c * t;     }     for(int i = 1; i < n; i++){         arr[i] += arr[i-1];     }     for(int i = 0; i < m; i++){         long val = in.nextLong();         System.out.println(Lower_bound(arr,val,n));     }    }     static int Lower_bound(long arr[],long val,int n){        int l = 0;        int r = n-1;        int ans = 0;        while( l <= r ){            int mid = (l + r)/2;            if(arr[mid] >= val){                r = mid - 1;                ans = mid;            }else{                l = mid + 1;            }        }        return ++ans;    }}