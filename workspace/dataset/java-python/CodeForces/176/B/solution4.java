import java.io.*;import java.util.StringTokenizer; public class main176B {    public static PrintWriter out = new PrintWriter(System.out);    public static FastScanner enter = new FastScanner(System.in);     public static void main(String[] args) throws IOException {        solve();        out.close();    }    static int n;    static int a;    static long[] dpGood;    static long[] dpBad;    static int mod=(int)1e9+7;    static String s;    static String t;    static int good=0;    static int bad=0;    private static void solve() throws IOException {        s=enter.next();        t=enter.next();        n=s.length();        int k=enter.nextInt();        dpGood=new long[k+1];        dpBad=new long[k+1];         for (int i = 0; i <n ; i++) {            if(check(i)){good++;            }            else bad++;        }        if(check(0)){            dpGood[0]=1;        }        else dpBad[0]=1;        for (int i = 1; i <k+1 ; i++) {            dpGood[i]=dpBad[i-1]%mod*good%mod+dpGood[i-1]%mod*(good-1)%mod;            dpBad[i]=dpGood[i-1]%mod*bad%mod+dpBad[i-1]%mod*(bad-1)%mod;            dpGood[i]%=mod;            dpBad[i]%=mod;        }        dpGood[k]=(dpGood[k]%mod+mod)%mod;        out.println(dpGood[k]);    }     static boolean check(int v){        for (int i = 0; i <n ; i++) {            if(s.charAt(i)!=t.charAt((i+v)%n)) return false;        }        return true;    }     static class FastScanner {        BufferedReader br;        StringTokenizer stok;         FastScanner(InputStream is) {            br = new BufferedReader(new InputStreamReader(is));        }         String next() throws IOException {            while (stok == null || !stok.hasMoreTokens()) {                String s = br.readLine();                if (s == null) {                    return null;                }                stok = new StringTokenizer(s);            }            return stok.nextToken();        }         int nextInt() throws IOException {            return Integer.parseInt(next());        }         long nextLong() throws IOException {            return Long.parseLong(next());        }         double nextDouble() throws IOException {            return Double.parseDouble(next());        }         char nextChar() throws IOException {            return (char) (br.read());        }         String nextLine() throws IOException {            return br.readLine();        }    }}
