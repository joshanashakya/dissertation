import java.util.*;import java.io.*; public class Mamo {    static long mod=1000000007;    static Reader in=new Reader();    static List<Integer >G[];    static long a[],p[],xp[],xv[];    static StringBuilder Sd=new StringBuilder(),Sl=new StringBuilder();    public static void main(String [] args) {    	//Dir by MohammedElkady    	long vov=1;    	for(int i=0;i<32;i++)vov*=2L;    	vov--;    int t=in.nextInt();    Stack<Integer> stack=new Stack(),spac=new Stack();    long ans=0;spac.add(1);    while( t-->0) {  String S=in.s();    if(S.equals("add")) {    	long res=1;    	for(int x:spac) {    		res*=(long)x;    	if(res>vov) {res=vov+2;break;}    	}    	ans+=res;    	if(ans>vov) {break;}    }    else if(S.equals("for")) {    	int x=in.nextInt();    	stack.add(x);    	if(x>1)    		spac.add(x);    }    else {    	int x=stack.pop();    	if(x>1)    		spac.pop();    }    }    if(ans>vov) {out.append("OVERFLOW!!!");}    else out.append(ans+" ");    	out.close();    }    static long ans=0L;    static boolean v[];    static ArrayList<Integer>res;    static  Queue <Integer> pop;    static  Stack <Integer>rem;    public static void Dfs(int o) {    	v[o]=true;    	for(int i:G[o]) {    	    		Dfs(i);    		if(a[i]>0) {    			res.add(i+1);    		a[o]+=a[i];}    		else {    			rem.add(i+1);    		}    	}    	    	ans+=a[o];    }    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));    static long gcd(long g,long x){if(x<1)return g;else return gcd(x,g%x);}      static class Reader     {         private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public Reader() { this(System.in); }public Reader(InputStream is) { mIs = is;}         public int read() {if (numChars == -1) throw new InputMismatchException();if (curChar >= numChars) {curChar = 0;try { numChars = mIs.read(buf);} catch (IOException e) { throw new InputMismatchException();}if (numChars <= 0) return -1; }return buf[curChar++];}         public String nextLine(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isEndOfLine(c));return res.toString() ;}         public String s(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isSpaceChar(c));return res.toString();}         public long l(){int c = read();while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }long res = 0; do{ if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read();}while(!isSpaceChar(c));return res * sgn;}         public int nextInt(){int c = read() ;while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }int res = 0;do{if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read() ;}while(!isSpaceChar(c));return res * sgn;}         public double d() throws IOException {return Double.parseDouble(s()) ;}        public boolean isSpaceChar(int c) { return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; }         public boolean isEndOfLine(int c) { return c == '\n' || c == '\r' || c == -1; }         public int[] arr(int n){int[] ret = new int[n];for (int i = 0; i < n; i++) {ret[i] = nextInt();}return ret;}    }}class node implements Comparable<node>{int a, b;node(int tt,int ll){a=tt;b=ll;}    @Override    public int compareTo(node o) {    return b-o.b;        }}class FastReader    {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new                     InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException  e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }} class Sorting{  public static int[] bucketSort(int[] array, int bucketCount) {  if (bucketCount <= 0) throw new IllegalArgumentException("Invalid bucket count");  if (array.length <= 1) return array; //trivially sorted    int high = array[0];  int low = array[0];  for (int i = 1; i < array.length; i++) { //find the range of input elements  if (array[i] > high) high = array[i];  if (array[i] < low) low = array[i];  }  double interval = ((double)(high - low + 1))/bucketCount; //range of one bucket   ArrayList<Integer> buckets[] = new ArrayList[bucketCount];  for (int i = 0; i < bucketCount; i++) { //initialize buckets  buckets[i] = new ArrayList();  }    for (int i = 0; i < array.length; i++) { //partition the input array  buckets[(int)((array[i] - low)/interval)].add(array[i]);  }   int pointer = 0;  for (int i = 0; i < buckets.length; i++) {  Collections.sort(buckets[i]); //mergeSort  for (int j = 0; j < buckets[i].size(); j++) { //merge the buckets  array[pointer] = buckets[i].get(j);  pointer++;  } } return array; }}