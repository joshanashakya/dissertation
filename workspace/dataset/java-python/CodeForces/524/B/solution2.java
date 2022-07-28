import java.util.*;import java.io.*;import java.math.*;import java.text.*;public class Main{    static class Reader     {         private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public Reader() { this(System.in); }public Reader(InputStream is) { mIs = is;}         public int read() {if (numChars == -1) throw new InputMismatchException();if (curChar >= numChars) {curChar = 0;try { numChars = mIs.read(buf);} catch (IOException e) { throw new InputMismatchException();}if (numChars <= 0) return -1; }return buf[curChar++];}         public String nextLine(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isEndOfLine(c));return res.toString() ;}         public String s(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isSpaceChar(c));return res.toString();}         public long l(){int c = read();while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }long res = 0; do{ if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read();}while(!isSpaceChar(c));return res * sgn;}         public int i(){int c = read() ;while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }int res = 0;do{if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read() ;}while(!isSpaceChar(c));return res * sgn;}         public double d() throws IOException {return Double.parseDouble(s()) ;}        public boolean isSpaceChar(int c) { return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; }         public boolean isEndOfLine(int c) { return c == '\n' || c == '\r' || c == -1; }         public int[] arr(int n){int[] ret = new int[n];for (int i = 0; i < n; i++) {ret[i] = i();}return ret;}    }                    //       |----|       /\      |    |   -----   |           //       |   /       /  \     |    |     |     |           //       |--/       /----\    |----|     |     |           //       |   \     /      \   |    |     |     |           //       |    \   /        \  |    |   -----   -------     static int n,m,h,arr[];     public static void main(String[] args)throws IOException    {        PrintWriter out= new PrintWriter(System.out);        Reader sc=new Reader();        int n=sc.i();        int arr[][]=new int[n][2];        for(int i=0;i<n;i++)        {            arr[i][0]=sc.i();            arr[i][1]=sc.i();        }        int min=2000000000;        for(int h=1;h<=1000;h++)        {            int check=0;            int sum=0;            for(int i=0;i<n;i++)            {                if(arr[i][0]>h&&arr[i][1]>h)                check=1;                else if(arr[i][0]<=h&&arr[i][1]<=h)                sum+=Math.min(arr[i][0],arr[i][1]);                else if(arr[i][0]<=h)                sum+=arr[i][1];                else                sum+=arr[i][0];            }            if(check==0)            min=Math.min(min,sum*h);        }        out.println(min);        out.flush();    }}
