import java.util.*;import java.io.*;import java.math.*; public class First{       public static boolean func(String x, String y)    {         boolean a=false,b=false,c=false;                  if((x.indexOf('A') != -1 )|| (y.indexOf('A') != -1))         {               a=true;         }         if((x.indexOf('B') != -1 )|| (y.indexOf('B') != -1))         {               b=true;         }         if((x.indexOf('C') != -1 )|| (y.indexOf('C') != -1))         {               c=true;         }         if(a && b && c)         {              return true;         }         return false;    }        public static void process()throws IOException    {         int n = ni();         int[] price = new int[n];         String[] vit = new String[n];             for(int i=0;i<n;i++)         {              String[] x = nln().trim().split(" ");              price[i] = Integer.parseInt(x[0]);              vit[i] = x[1];         }                   // boolean bool_a=false, bool_b=false, bool_c=false, bool_abc=false;         int min_a = Integer.MAX_VALUE, min_b = Integer.MAX_VALUE, min_c = Integer.MAX_VALUE, min_abc = Integer.MAX_VALUE;          for(int i=0; i<n; i++)         {              if(vit[i].length()==1)              {                   if(vit[i].charAt(0) == 'A')                  {                       if(min_a > price[i])                       {                            min_a = price[i];                       }                  }                  if(vit[i].charAt(0) == 'B')                  {                       if(min_b > price[i])                       {                            min_b = price[i];                       }                  }                  if(vit[i].charAt(0) == 'C')                  {                       if(min_c > price[i])                       {                            min_c = price[i];                       }                  }              }              else if(vit[i].length() == 3)              {                    if(min_abc > price[i])                    {                         min_abc = price[i];                    }              }         }          int ans = Integer.MAX_VALUE;         if(min_a != Integer.MAX_VALUE && min_b != Integer.MAX_VALUE && min_c != Integer.MAX_VALUE)         {               // pn("Here 1");               ans = Math.min(ans, min_a + min_b + min_c);         }                 if(min_abc != Integer.MAX_VALUE)         {              // pn("Here 2");              ans = Math.min(ans, min_abc);         }          // pn("Answer = "+ans);          for(int i=0;i<n-1;i++)         {              for(int j=i+1; j<n ;j++)              {                     if(vit[i].length()<3 && vit[j].length()<3)                     {                          if(func(vit[i],vit[j]))                          {                                // pn("Here 3");                                ans = Math.min(ans, price[i]+price[j]);                          }                     }              }         }          if(ans == Integer.MAX_VALUE)         {              pn(-1);         }         else         {              pn(ans);         }            }     	static AnotherReader sc;    static PrintWriter out;    public static void main(String[]args)throws IOException    {        out = new PrintWriter(System.out);        sc=new AnotherReader();        boolean oj = true;     // 	oj = System.getProperty("ONLINE_JUDGE") != null;    // 	if(!oj) sc=new AnotherReader(100);     //     long s = System.currentTimeMillis();        int t=1;        while(t-->0)            process();        out.flush();        // if(!oj)        //     System.out.println(System.currentTimeMillis()-s+"ms");        System.out.close();      }     static void pn(Object o){out.println(o);}    static void p(Object o){out.print(o);}    static void pni(Object o){out.println(o);System.out.flush();}    static int ni()throws IOException{return sc.nextInt();}    static long nl()throws IOException{return sc.nextLong();}    static double nd()throws IOException{return sc.nextDouble();}    static String nln()throws IOException{return sc.nextLine();}    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}    static boolean multipleTC=false;   /////////////////////////////////////////////////////////////////////////////////////////////////////////     static class AnotherReader{BufferedReader br; StringTokenizer st;    AnotherReader()throws FileNotFoundException{    br=new BufferedReader(new InputStreamReader(System.in));}    AnotherReader(int a)throws FileNotFoundException{    br = new BufferedReader(new FileReader("input.txt"));}    String next()throws IOException{    while (st == null || !st.hasMoreElements()) {try{    st = new StringTokenizer(br.readLine());}    catch (IOException  e){ e.printStackTrace(); }}    return st.nextToken(); } int nextInt() throws IOException{    return Integer.parseInt(next());}    long nextLong() throws IOException    {return Long.parseLong(next());}    double nextDouble()throws IOException { return Double.parseDouble(next()); }    String nextLine() throws IOException{ String str = ""; try{    str = br.readLine();} catch (IOException e){    e.printStackTrace();} return str;}}    /////////////////////////////////////////////////////////////////////////////////////////////////////////////}	