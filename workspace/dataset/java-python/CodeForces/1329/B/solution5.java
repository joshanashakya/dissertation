import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.Collections;import java.util.StringTokenizer;  public class Main {    static int i,j,k,n,m,t,x,y,max=1000000;    static long ans,a,b,c,d,l,r,mod=1000000007;    static String str;    static char ch;    static FastScanner fs = new FastScanner();       public static void main(String[] args) {         t = fs.nextInt();         while (t-- > 0){             n = fs.nextInt();            m = fs.nextInt();             long[] arr = new long[50];            long[] dp = new long[50];             k=1;            arr[0]=1;            dp[0]=1;            x=0;            for(i=1;i<=33;i++){                x++;                k*=2;                if(n>=(k*2))                    arr[i] = k;                else {                    arr[i]=n-k+1;                    break;                }             }             for(i=1;i<=x;i++){                dp[i]=arr[i];                dp[i]%=m;                for(j=0;j<i;j++){                    dp[i]+=(arr[i]*dp[j]);                    dp[i]%=m;                }            }             ans =0;            for(i=0;i<=x;i++){                ans+=dp[i];                ans%=m;            }             System.out.println(ans);         }     }      static class FastScanner {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        String next() {            while (!st.hasMoreTokens())                try {                    st=new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[] readArray(int n) {            int[] a=new int[n];            for (int i=0; i<n; i++) a[i]=nextInt();            return a;        }        long nextLong() {            return Long.parseLong(next());        }    }     private static long inv( long a, long b){        return 1<a ? b - inv(b%a,a)*b/a : 1;    }     //To be used with priority queues.    static class State implements Comparable<State> {        int l, r;        int len;        public State(int l, int r) {            this.l=l;            this.r=r;            this.len=r-l+1;        }         public int compareTo(State o) {            if (len!=o.len) {                return -Integer.compare(len, o.len);            }            else {                return Integer.compare(l, o.l);            }        }    }     static void sort(int[] a) {        ArrayList<Integer> l=new ArrayList<>();        for (int i:a) l.add(i);        Collections.sort(l);        for (int i=0; i<a.length; i++) a[i]=l.get(i);    } }