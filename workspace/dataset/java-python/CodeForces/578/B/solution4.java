import java.awt.*;import java.io.*;import java.util.*; public class Abc {    public static void main(String[] args) throws Exception {        FastReader sc = new FastReader();        int n=sc.nextInt();long k=sc.nextInt(),x=sc.nextInt();        long a[]=new long[n];        for (int i=0;i<n;i++)a[i]=sc.nextInt();        long pow=(long) Math.pow(x,k);        long pref[]=new long[n+2];        long suff[]=new long[n+2];        for (int i=1;i<=n;i++)pref[i]=(pref[i-1]|a[i-1]);        for (int i=n;i>=1;i--)suff[i]=(suff[i+1]|a[i-1]);        long max=0;        for (int i=1;i<=n;i++){            max=Math.max((pref[i-1]|suff[i+1]|(a[i-1]*pow)),max);        }        System.out.println(max);    }    static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }}