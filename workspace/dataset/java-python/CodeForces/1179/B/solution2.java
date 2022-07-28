import java.util.*;import java.io.*;public class Main implements Runnable{    FastScanner sc;    PrintWriter pw;    final class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner() {            try {                br = new BufferedReader(new InputStreamReader(System.in));                st = new StringTokenizer(br.readLine());            } catch (Exception e) {                e.printStackTrace();            }        }         public long nlo() {            return Long.parseLong(next());        }         public String next() {            if (st.hasMoreTokens()) return st.nextToken();            try {                st = new StringTokenizer(br.readLine());            } catch (Exception e) {                e.printStackTrace();            }            return st.nextToken();        }         public int ni() {            return Integer.parseInt(next());        }         public String nli() {            String line = "";            if (st.hasMoreTokens()) line = st.nextToken();            else try {                return br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            while (st.hasMoreTokens()) line += " " + st.nextToken();            return line;        }         public double nd() {            return Double.parseDouble(next());        }    }    public static void main(String[] args)    {        new Thread(null,new Main(),"codeforces",1<<25).start();    }    public void run()    {        sc=new FastScanner();        pw=new PrintWriter(System.out);       solve();        pw.flush();        pw.close();    }    public long gcd(long a,long b)    {        return b==0L?a:gcd(b,a%b);    }    public long ppow(long a,long b,long mod)    {        if(b==0L)        return 1L;        long tmp=1;        while(b>1L)        {            if((b&1L)==1)            tmp*=a;            a*=a;            a%=mod;            tmp%=mod;            b>>=1;        }        return (tmp*a)%mod;    }    //////////////////////////////////    /////////////  LOGIC  ///////////    ////////////////////////////////    public void solve()    {        int n=sc.ni();        int m=sc.ni();        int N=n;        int M=m;        int i=1,j=1,res=0;        int[][] visit=new int[n][m];        while(true)        {            if(visit[i-1][j-1]==0)            {                visit[i-1][j-1]=1;                pw.println(i+" "+j);            }            else            res=-1;            if(visit[n-1][m-1]==0)            {                visit[n-1][m-1]=1;                pw.println(n+" "+m);            }            else            res=-1;            if(res==-1)            break;            if(j==M)            {                i++;                j=1;            }            else            j++;            if(m==1)            {                m=M;                n--;            }            else            m--;        }    }}
