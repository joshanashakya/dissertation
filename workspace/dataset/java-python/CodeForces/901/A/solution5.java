import java.util.*;import java.lang.*;import java.io.*;import java.math.*;public class Prac{         static class InputReader {         private final InputStream stream;        private final byte[] buf = new byte[8192];        private int curChar, snumChars;        public InputReader(InputStream st) {            this.stream = st;        }         public int read() {            if (snumChars == -1)                throw new InputMismatchException();            if (curChar >= snumChars) {                curChar = 0;                try {                    snumChars = stream.read(buf);                }                 catch (IOException e) {                    throw new InputMismatchException();                }                if (snumChars <= 0)                    return -1;            }            return buf[curChar++];        }        public int ni() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public long nl() {            int c = read();            while (isSpaceChar(c)) {            c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            long res = 0;            do {                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public int[] nia(int n) {            int a[] = new int[n];            for (int i = 0; i < n; i++) {                a[i] = ni();            }            return a;        }         public String rs() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                    c = read();            } while (!isSpaceChar(c));            return res.toString();        }        public String nextLine() {            int c = read();            while (isSpaceChar(c))                c = read();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isEndOfLine(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         private boolean isEndOfLine(int c) {            return c == '\n' || c == '\r' || c == -1;        }     }    public static class Key {         private final int x;        private final int y;         public Key(int x, int y) {            this.x = x;            this.y = y;        }         @Override        public boolean equals(Object o) {            if (this == o) return true;            if (!(o instanceof Key)) return false;            Key key = (Key) o;            return x == key.x && y == key.y;        }         @Override        public int hashCode() {            int result = x;            result = 31 * result + y;            return result;        }     }    static class Pair{        int x,y;        public Pair(int x,int y){            this.y=y;            this.x=x;        }    }          static PrintWriter w = new PrintWriter(System.out);    static long mod=998244353L,mod1=1000000007;            public static void main(String [] args){        InputReader sc=new InputReader(System.in);        int n=sc.ni();        int arr[]=new int[n+1];        boolean f=false;        int s=0,in=-1;        for(int i=0;i<=n;i++){            arr[i]=sc.ni();            s+=arr[i];        }        for(int i=1;i<=n;i++){            if(arr[i]>=2&&arr[i-1]>=2){                in=i;                break;            }        }        if(in==-1)w.println("perfect");        else{            w.println("ambiguous");            int t1[]=new int[s];            int t2[]=new int[s];            int p=0,j=0;            for(int i=0;i<=n;i++){                int c=arr[i];                while(c-->0){                    t1[j]=p;                    t2[j]=p;                    j++;                }                if(i==in){                    t1[j-1]=p-1;                }                p+=arr[i];                             }            for(int i=0;i<s;i++){                w.print(t1[i]+" ");            }            w.println();            for(int i=0;i<s;i++){                w.print(t2[i]+" ");            }                    }                w.close();    }}
