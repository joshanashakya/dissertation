import java.io.*;import java.util.StringTokenizer; public class C {     public static void main(String[] args) throws IOException {         Scanner sc = new Scanner(System.in);        PrintWriter out = new PrintWriter(System.out);         int a = sc.nextInt() * 2, b = sc.nextInt() * 2, x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();        int d1 = Math.abs(Math.floorDiv(x1 - y1, b) - Math.floorDiv(x2 - y2, b));        int d2 = Math.abs(Math.floorDiv(x1 + y1, a) - Math.floorDiv(x2 + y2, a));        out.println(Math.max(d1, d2));        out.close();     }      static class Scanner    {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}         public String next() throws IOException        {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {return Integer.parseInt(next());}         public long nextLong() throws IOException {return Long.parseLong(next());}         public String nextLine() throws IOException {return br.readLine();}         public boolean ready() throws IOException {return br.ready();}      }}
