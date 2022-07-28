import java.io.*;import java.math.*;import java.util.*; //import org.omg.CORBA.Environment; //Codeforcespublic class Main { private static MyScanner in; private static PrintStream out; private static boolean LOCAL_TEST = false;  private static void solve() throws IOException {  int n = in.nextInt();  int[] a = new int[n];  for (int i = 0; i < n; i++) {   a[i] = in.nextInt();  }  int[] lastpos = new int[100001];  int[] diff = new int[100001];  int[] cnt = new int[100001];  boolean[] exclude = new boolean[100001];  for (int i = 1; i <= 100000; i++) {   lastpos[i] = 0;   diff[i] = 0;   cnt[i] = 0;   exclude[i] = false;  }  for (int i = 1; i <= n; i++) {   int x = a[i - 1];   cnt[x] += 1;   if (cnt[x] > 1) {    int diffpos = i - lastpos[x];    if (diff[x] == 0)     diff[x] = diffpos;    else {     if (diff[x] != diffpos) {      exclude[x] = true;     }    }   }   lastpos[x] = i;  }  int numx = 0;  for (int x = 1; x <= 100000; x++) {   if (cnt[x] > 0 && !exclude[x])    numx++;  }  out.println(numx);  StringBuilder sb = new StringBuilder();  for (int x = 1; x <= 100000; x++) {   if (cnt[x] > 0 && !exclude[x]) {    sb.append("" + x + " " + diff[x] + String.format("%n"));   }  }  out.println(sb); }  public static void main(String[] args) throws IOException {  // helpers for input/output  out = System.out;  try {   String cname = System.getenv("COMPUTERNAME");   if (!cname.equals(""))    LOCAL_TEST = true;  } catch (Exception e) {  }  if (LOCAL_TEST) {   in = new MyScanner("E:\\zin.txt");  }  else {   boolean usingFileForIO = false;   if (usingFileForIO) {    // using input.txt and output.txt as I/O    in = new MyScanner("input.txt");    out = new PrintStream("output.txt");   }   else {    in = new MyScanner();    out = System.out;   }  }   solve(); }  // ===================================== static class MyScanner {  BufferedReader bufReader;  StringTokenizer strTok;   public MyScanner() throws IOException  {   bufReader = new BufferedReader(new InputStreamReader(System.in));   strTok = new StringTokenizer("");  }   public MyScanner(String inputFile) throws IOException {   bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(     inputFile)));   strTok = new StringTokenizer("");  }   String GetNextToken() throws IOException {   if (!strTok.hasMoreTokens())    strTok = new StringTokenizer(bufReader.readLine());   return strTok.nextToken();  }   public int nextInt() throws IOException {   return Integer.valueOf(GetNextToken());  }   public long nextLong() throws IOException {   return Long.valueOf(GetNextToken());  }   public double nextDouble() throws IOException {   return Double.valueOf(GetNextToken());  }   public String nextString() throws IOException {   return GetNextToken();  }   public String nextLine() throws IOException {   return bufReader.readLine();  }   public int countTokens() {   return strTok.countTokens();  }   public boolean hasMoreTokens() {   return strTok.hasMoreTokens();  } } }