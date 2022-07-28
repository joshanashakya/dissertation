import java.util.*;import java.io.*;import java.math.*;public class AcaciousString{    static final Random random=new Random();        static void ruffleSort(int[] a) {        int n = a.length;         for (int i=0; i<n; i++) {            int oi=random.nextInt(n), temp=a[oi];            a[oi]=a[i]; a[i]=temp;        }        ArrayList<Integer> lst = new ArrayList<>();        for(int i : a)            lst.add(i);        Collections.sort(lst);        for(int i = 0; i < n; i++)            a[i] = lst.get(i);    }     static void ruffleSort(long[] a) {        int n = a.length;         for (int i=0; i<n; i++) {            int oi=random.nextInt(n);            long temp=a[oi];            a[oi]=a[i]; a[i]=temp;        }        ArrayList<Long> lst = new ArrayList<>();        for(long i : a)            lst.add(i);        Collections.sort(lst);        for(int i = 0; i < n; i++)            a[i] = lst.get(i);    }     public static void process()throws IOException    {        int n = ni();        char[] ch = nln().toCharArray();        char[] st = "abacaba".toCharArray();        int c = 0;        for(int i = 0; i+6 < n; i++){            int f = 0;            for(int j = 0; j < 7; j++){                if(ch[i+j] != st[j]){                    f = 1;                    break;                }            }            if(f == 0)                c++;        }        if(c == 1){            pn("YES");            for(int i = 0; i < n; i++){                if(ch[i] == '?')                    ch[i] = 'z';            }            pn(String.valueOf(ch));        }        else if(c >= 2)            pn("NO");        else{            for(int i = 0; i+6 < n; i++){                char[] str = Arrays.copyOf(ch, n);                for(int j = i; j+6 < n; j++){                    int f = 0;                    for(int k = 0; k < 7; k++){                        if(str[j+k] != st[k] && str[j+k] != '?'){                            f = 1;                            break;                        }                    }                    if(f == 0){                        for(int k = 0; k < 7; k++)                            str[j+k] = st[k];                        break;                    }                }                int temp = 0;                for(int j = 0; j+6 < n; j++){                    int f = 0;                    for(int k = 0; k < 7; k++){                        if(str[j+k] != st[k]){                            f = 1;                            break;                        }                    }                    if(f == 0)                        temp++;                }                if(temp == 1){                    pn("YES");                    for(int k = 0; k < n; k++){                        if(str[k] == '?')                            str[k] = 'z';                    }                    pn(String.valueOf(str));                    return;                }            }            pn("NO");        }    }       static AnotherReader sc;    static PrintWriter out;    public static void main(String[]args)throws IOException    {        boolean oj = System.getProperty("ONLINE_JUDGE") != null;        if(oj){sc=new AnotherReader();out=new PrintWriter(System.out);}        else{sc=new AnotherReader(100);out=new PrintWriter("output.txt");}        long s = System.currentTimeMillis();        int t=1;        t=ni();        //int k = t;        while(t-->0) {/*p("Case #"+ (k-t) + ": ")*/;process();}        out.flush();        System.err.println(System.currentTimeMillis()-s+"ms");        out.close();    }     static long power(long k, long c, long mod){        long y = 1;        while(c > 0){            if(c%2 == 1)                y = y * k % mod;            c = c/2;            k = k * k % mod;        }        return y;    }      static void pn(Object o){out.println(o);}    static void p(Object o){out.print(o);}    static void pni(Object o){out.println(o);out.flush();}    static int ni()throws IOException{return sc.nextInt();}    static long nl()throws IOException{return sc.nextLong();}    static double nd()throws IOException{return sc.nextDouble();}    static String nln()throws IOException{return sc.nextLine();}    static int[] nai(int N)throws IOException{int[]A=new int[N];for(int i=0;i!=N;i++){A[i]=ni();}return A;}    static long[] nal(int N)throws IOException{long[]A=new long[N];for(int i=0;i!=N;i++){A[i]=nl();}return A;}    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}    /////////////////////////////////////////////////////////////////////////////////////////////////////////     static class AnotherReader{BufferedReader br; StringTokenizer st;    AnotherReader()throws FileNotFoundException{    br=new BufferedReader(new InputStreamReader(System.in));}    AnotherReader(int a)throws FileNotFoundException{    br = new BufferedReader(new FileReader("input.txt"));}    String next()throws IOException{    while (st == null || !st.hasMoreElements()) {try{    st = new StringTokenizer(br.readLine());}    catch (IOException  e){ e.printStackTrace(); }}    return st.nextToken(); } int nextInt() throws IOException{    return Integer.parseInt(next());}    long nextLong() throws IOException    {return Long.parseLong(next());}    double nextDouble()throws IOException { return Double.parseDouble(next()); }    String nextLine() throws IOException{ String str = ""; try{    str = br.readLine();} catch (IOException e){    e.printStackTrace();} return str;}} /////////////////////////////////////////////////////////////////////////////////////////////////////////////}
