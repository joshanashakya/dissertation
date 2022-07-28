/* * Author Ayub Subhaniya * Institute DA-IICT */ import java.io.*;import java.lang.reflect.Array;import java.math.*;import java.util.*; public class Tester{     InputStream in;    PrintWriter out;     long mod=(long)1e9+7;    int MAX=(int)1e5+7;    double eps=1e-6;     void solve()    {        int n=ni();        int a[]=na(n);        HashMap<Integer,Integer> hm = new HashMap<>();        long posS=0,negS=0;        long posC=0,negC=0;         for (int i=0;i<n;i++)        {            if (a[i]-i-1>=0)            {                if (a[i]==n)                {                    posC++;                    posS+=a[i]-i-1;                    continue;                }                 if (hm.containsKey(a[i]-i))                    hm.put(a[i]-i,1+hm.get(a[i]-i));                else                    hm.put(a[i]-i,1);                posS+=a[i]-i-1;                posC++;            }            else            {                 if (hm.containsKey(n-i+a[i]))                    hm.put(n-i+a[i],1+hm.get(n-i+a[i]));                else                    hm.put(n-i+a[i],1);                 negS+=-(a[i]-i-1);                negC++;            }        }        long ans=posS+negS;        int minIdx=0;        int idx=n-1;        long prev=ans;        for (int k=1;k<n;k++)        {            long tposC=0;            if (a[idx]==n)            {                tposC++;                posC--;            }            else            {                tposC++;                negC--;            }            if (hm.containsKey(k))            {                posC-=hm.get(k);                negC+=hm.get(k);            }             long sum=prev-posC+negC-(n-a[idx])+(a[idx]-1);            posC+=tposC;            idx--;            if (ans>sum)            {                minIdx=k;                ans=sum;            }            prev=sum;        }         out.println(ans+" "+minIdx);    }      class Pair implements Comparable<Pair>    {        int x;        int y;        int z;        Pair(int a,int b,int c)        {            x=a;            y=b;            z=c;        }         @Override        public boolean equals(Object o)        {            Pair other = (Pair)o;            return x == other.x && y == other.y;        }        public String toString()        {            return x+" "+y+" "+z;        }         @Override        public int compareTo(Pair o)        {            if (x==o.x)                return Integer.compare(y, o.y);            else                return Integer.compare(x, o.x);        }        @Override public int hashCode()        {            return Objects.hash(x, y);        }    }     long pow(long x, long n, long M) {        x%=M;        long result = 1;        while (n > 0) {            if (n % 2 == 1)                result = (result * x) % M;            x = (x * x) % M;            n = n / 2;        }        return result;    }     long modInverse(long A, long M) {        extendedEuclid(A, M);        return (EEx % M + M) % M;    }    long EEd, EEx, EEy;     void extendedEuclid(long A, long B) {        if (B == 0) {            EEd = A;            EEx = 1;            EEy = 0;        } else {            extendedEuclid(B, A % B);            long temp = EEx;            EEx = EEy;            EEy = temp - (A / B) * EEy;        }    }     int max(int a,int b)    {        if(a>b)            return a;        else            return b;    }     int min(int a,int b)    {        if(a>b)            return b;        else            return a;    }     long max(long a,long b)    {        if(a>b)            return a;        else            return b;     }      long min(long a,long b)    {        if(a>b)            return b;        else            return a;     }     long add(long a,long b)    {        long x=(a+b);        while(x>=mod) x-=mod;        return x;     }      long sub(long a,long b)    {        long x=(a-b);        while(x<0) x+=mod;        return x;     }      long mul(long a,long b)    {        a%=mod;        b%=mod;        long x=(a*b);        return x%mod;     }     void run() throws Exception    {        String INPUT = "/Users/ayubsubhaniya/IdeaProjects/Test/src/input.txt";        in = oj ? System.in : new FileInputStream(INPUT);        out = new PrintWriter(System.out);         long s = System.currentTimeMillis();        solve();        out.flush();        tr(System.currentTimeMillis() - s + "ms");     }    public static void main(String[] args) throws Exception    {        new Tester().run();    }     private byte[] inbuf = new byte[1024];    public int lenbuf = 0, ptrbuf = 0;     private int readByte()    {        if (lenbuf == -1)            throw new InputMismatchException();        if (ptrbuf >= lenbuf)        {            ptrbuf = 0;            try            {                lenbuf = in.read(inbuf);            }            catch (IOException e)            {                throw new InputMismatchException();            }            if (lenbuf <= 0)                return -1;        }        return inbuf[ptrbuf++];    }     private boolean inSpaceChar(int c)    {        return !(c >= 33 && c <= 126);    }     private int skip()    {        int b;        while ((b = readByte()) != -1 && inSpaceChar(b))            ;        return b;    }     private double nd()    {        return Double.parseDouble(ns());    }     private char nc()    {        return (char) skip();    }     private String ns()    {        int b = skip();        StringBuilder sb = new StringBuilder();        while (!(inSpaceChar(b)))        { // when nextLine, (inSpaceChar(b) && b != ' ')            sb.appendCodePoint(b);            b = readByte();        }        return sb.toString();    }     private char[] ns(int n)    {        char[] buf = new char[n];        int b = skip(), p = 0;        while (p < n && !(inSpaceChar(b)))        {            buf[p++] = (char) b;            b = readByte();        }        return n == p ? buf : Arrays.copyOf(buf, p);    }     private char[][] nm(int n, int m)    {        char[][] map = new char[n][];        for (int i = 0; i < n; i++)            map[i] = ns(m);        return map;    }     private int[] na(int n)    {        int[] a = new int[n];        for (int i = 0; i < n; i++)            a[i] = ni();        return a;    }     private int ni()    {        int num = 0, b;        boolean minus = false;        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))            ;        if (b == '-')        {            minus = true;            b = readByte();        }         while (true)        {            if (b >= '0' && b <= '9')            {                num = num * 10 + (b - '0');            }            else            {                return minus ? -num : num;            }            b = readByte();        }    }     private long nl()    {        long num = 0;        int b;        boolean minus = false;        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))            ;        if (b == '-')        {            minus = true;            b = readByte();        }         while (true)        {            if (b >= '0' && b <= '9')            {                num = num * 10 + (b - '0');            }            else            {                return minus ? -num : num;            }            b = readByte();        }    }     private boolean oj = System.getProperty("ONLINE_JUDGE") != null;     private void tr(Object... o)    {        if (!oj)            System.out.println(Arrays.deepToString(o));    } } 
