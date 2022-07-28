import java.util.*;import java.io.*;import java.math.*;public class Main1{    static class Reader     {         private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public Reader() { this(System.in); }public Reader(InputStream is) { mIs = is;}         public int read() {if (numChars == -1) throw new InputMismatchException();if (curChar >= numChars) {curChar = 0;try { numChars = mIs.read(buf);} catch (IOException e) { throw new InputMismatchException();}if (numChars <= 0) return -1; }return buf[curChar++];}         public String nextLine(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isEndOfLine(c));return res.toString() ;}         public String s(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isSpaceChar(c));return res.toString();}         public long l(){int c = read();while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }long res = 0; do{ if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read();}while(!isSpaceChar(c));return res * sgn;}         public int i(){int c = read() ;while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }int res = 0;do{if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read() ;}while(!isSpaceChar(c));return res * sgn;}         public double d() throws IOException {return Double.parseDouble(s()) ;}        public boolean isSpaceChar(int c) { return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; }         public boolean isEndOfLine(int c) { return c == '\n' || c == '\r' || c == -1; }         public int[] arr(int n){int[] ret = new int[n];for (int i = 0; i < n; i++) {ret[i] = i();}return ret;}    }            ///////////////////////////////////////////////////////////////////////////////////////////    //    RRRRRRRRR            AAA             HHH     HHH     IIIIIIIIIIIII   LLL           //    //    RR    RRR           AAAAA            HHH     HHH      IIIIIIIIIII    LLL           //    //    RR   RRR           AAAAAAA           HHH     HHH          III        LLL           //    //    RR  RRR           AAA   AAA          HHHHHHHHHHH          III        LLL           //    //    RRRRRR           AAA     AAA         HHHHHHHHHHH          III        LLL           //    //    RR  RRR         AAAAAAAAAAAAA        HHH     HHH          III        LLL           //    //    RR    RRR      AAA         AAA       HHH     HHH      IIIIIIIIIII    LLLLLLLLLLLL  //    //    RR     RRR    AAA           AAA      HHH     HHH     IIIIIIIIIIIII   LLLLLLLLLLLL  //    ///////////////////////////////////////////////////////////////////////////////////////////        public static void main(String[] args)throws IOException    {        PrintWriter out= new PrintWriter(System.out);        Reader sc=new Reader();        int n=sc.i();        int m=sc.i();        int k=sc.i();        int lockedcell[]=new int[k+1];        int lockedcore[]=new int[n];        int arr[][]=new int[n][m];        for(int i=0;i<n;i++)arr[i]=sc.arr(m);        for(int i=0;i<m;i++)        {            for(int c=1;c<=k;c++)            {                int counter=0;                Set<Integer> st=new HashSet<>();                for(int j=0;j<n;j++)                {                    if(lockedcore[j]!=0)                    continue;                    if(lockedcell[arr[j][i]]==1)                    lockedcore[j]=i+1;                    else if(arr[j][i]==c)                    {                        counter++;                        st.add(j);                    }                }                if(counter>1)                {                    lockedcell[c]=1;                    for(int j:st)                    lockedcore[j]=i+1;                }            }        }        for(int i=0;i<n;i++)        out.println(lockedcore[i]);        out.flush();    }}
