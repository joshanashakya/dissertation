import java.util.*;import java.io.*;import java.math.*;public class Main{    public static void process()throws IOException    {        long n=nl();        long a=nl();        long b=nl();        n*=6;        if(a*b>=n)        {            pn(a*b);            pn(a+" "+b);            return;        }        if(a>=b)        {               for(long j=n;j<=100+n;j++)            for(long i=b;i<=Math.sqrt(j);i++)                if(j%i==0 && (j/i)>=a)                {                    pn(j);                    pn((j/i)+" "+i);                    return;                }            long temp=(long)(Math.ceil((double)n/b));            pn(b*temp);            pn(temp+" "+b);        }        else        {            for(long j=n;j<=n+100;j++)            for(long i=a;i<=Math.sqrt(j);i++)                if(j%i==0 && (j/i)>=b)                {                    pn(j);                    pn(i+" "+(j/i));                    return;                }            long temp=(long)(Math.ceil((double)n/a));            pn(a*temp);            pn(a+" "+temp);        }     }     static AnotherReader sc;    static PrintWriter out;    public static void main(String[]args)throws IOException    {        boolean oj = System.getProperty("ONLINE_JUDGE") != null;        if(oj){sc=new AnotherReader();out=new PrintWriter(System.out);}        else{sc=new AnotherReader(100);out=new PrintWriter("output.txt");}        int t=1;        // t=ni();        while(t-->0) {process();}        out.flush();out.close();      }     static void pn(Object o){out.println(o);}    static void p(Object o){out.print(o);}    static void pni(Object o){out.println(o);out.flush();}    static int ni()throws IOException{return sc.nextInt();}    static long nl()throws IOException{return sc.nextLong();}    static double nd()throws IOException{return sc.nextDouble();}    static String nln()throws IOException{return sc.nextLine();}    static int[] nai(int N)throws IOException{int[]A=new int[N];for(int i=0;i!=N;i++){A[i]=ni();}return A;}    static long[] nal(int N)throws IOException{long[]A=new long[N];for(int i=0;i!=N;i++){A[i]=nl();}return A;}    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));} /////////////////////////////////////////////////////////////////////////////////////////////////////////     static class AnotherReader{BufferedReader br; StringTokenizer st;    AnotherReader()throws FileNotFoundException{    br=new BufferedReader(new InputStreamReader(System.in));}    AnotherReader(int a)throws FileNotFoundException{    br = new BufferedReader(new FileReader("input.txt"));}    String next()throws IOException{    while (st == null || !st.hasMoreElements()) {try{    st = new StringTokenizer(br.readLine());}    catch (IOException  e){ e.printStackTrace(); }}    return st.nextToken(); } int nextInt() throws IOException{    return Integer.parseInt(next());}    long nextLong() throws IOException    {return Long.parseLong(next());}    double nextDouble()throws IOException { return Double.parseDouble(next()); }    String nextLine() throws IOException{ String str = ""; try{    str = br.readLine();} catch (IOException e){    e.printStackTrace();} return str;}}   /////////////////////////////////////////////////////////////////////////////////////////////////////////////}
