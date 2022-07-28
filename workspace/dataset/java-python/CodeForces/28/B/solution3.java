import java.util.*;import java.io.*;import java.math.BigInteger; public class lp1{ static PrintWriter out = new PrintWriter(System.out);static int[] p;static int find(int x){        if(x==p[x])           return x;       return p[x] = find(p[x]);}static void union(int x,int y){       int rx = find(x),ry = find(y);       if(rx==ry)          return;       p[rx]=ry;}static void solve() {    int n = ni();   p = new int[n];   int a[] = ai(n);   int f[] = ai(n);   for(int i=0;i<n;i++)       p[i] =i;   for(int i=0;i<n;i++)      {            if((i+f[i])<n)                  union(i,i+f[i]);            if((i-f[i])>=0)                  union(i,i-f[i]);                 }   String f1="YES";   for(int i=0;i<n;i++)      if(find(i)!=find(a[i]-1))          {f1="NO" ; break;}    pn(f1);   out.flush();}public static void main(String[] args) throws Exception{ solve(); /* use this block when you need more recursion depthnew Thread(null, null, "Name", 999) {            public void run() {                try {                    solve();                } catch(Exception e) {                    e.printStackTrace();                    System.exit(1);                }            }        }.start();   */} static int[] ai(int n)  // it will give in array of size n{    int a[] = new int[n];    for(int i=0;i<n;i++)        a[i] = ni();    return a;}static long[] al(int n)  // it will give in array of size n{    long a[] = new long[n];    for(int i=0;i<n;i++)        a[i] = nl();    return a;} static void p(Object o){   out.print(o);}static void pn(Object o){    out.println(o);}static int abs(int x){    return x>0 ? x : -x;}static long gcd(long a,long b){       if(a==0)          return b;       if(b==0)          return a;       if(b%a==0)          return a;          return gcd(b%a,a);}static int count_set(int n){   int c=0;while(n>0){   if(n%2==1)     c++;     n=n/2;}   return c;}static void subtract_1(char s[]) // it will subtract 1 from the given number.  number should be positive{      if(s[0]=='0') // number is zero          return;     int n = s.length,i=n-1;     while(s[i]=='0')       i--;     s[i] = (char)((int)(s[i]-'0') + 47);        for(int j=i+1;j<n;j++)         s[j]='9';}static long pow(long a,long b,long md){     long ans=1;    while(b>0)    {         if(b%2==1)           ans = (ans*a)%md;           a = (a*a)%md;           b = b/2;    }   return ans;}static long min(long a,long b){      return a<b ? a : b;}static long max(long a,long b){     return a>b ? a : b;}static boolean pal(String s){   int n = s.length(),i1=0,i2=n-1;      while(i1<i2)     {        if(s.charAt(i1)!=s.charAt(i2))             return false;             i1++; i2--;     }       return true;}static String rev(String r){    String s = "";    int i= r.length()-1;     while(i>=0)    {        s=s+r.charAt(i);        i--;       }       return s;}static FastReader sc=new FastReader();        static int ni(){                 int x = sc.nextInt();                 return(x);        }      static long nl(){              long x = sc.nextLong();              return(x);         }      static String n(){                 String str = sc.next();                     return(str);       }     static String ns(){                 String str = sc.nextLine();                   return(str);      }     static double nd(){               double d = sc.nextDouble();                 return(d);       }  static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } }
